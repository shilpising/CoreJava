import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterUser {
	static List<User> localUser;
	static {
		localUser=new ArrayList<>();
		localUser.add(new User("abc"));
		localUser.add(new User("abcd"));
		localUser.add(new User("abce"));
		localUser.add(new User("abcf"));
		localUser.add(new User("abcg"));
		
	}
	
	public static List<User> addUser(List<User> remoteUser,List<User> u){
		Iterator<User> itr=u.iterator();
		List<User> returnList=new ArrayList<User>();
		while(itr.hasNext()) {
			User temp=itr.next();		
			if(remoteUser.contains(temp) && !localUser.contains(temp)) {
				localUser.add(temp);
				returnList.add(temp);
			}
		}
		return returnList;
	}
	
	public static List<User> updateUser(List<User> remoteUser,List<User> u){
		Iterator<User> itr=u.iterator();
		List<User> returnList=new ArrayList<User>();
		while(itr.hasNext()) {
			if(remoteUser.contains(itr.next()) && localUser.contains(itr.next())) {
				localUser.add(itr.next());
				returnList.add(itr.next());
			}
		}
		return returnList;
	}
	
	public static List<User> deleteUser(List<User> remoteUser,List<User> u){
		Iterator<User> itr=u.iterator();
		List<User> returnList=new ArrayList<User>();
		while(itr.hasNext()) {
			if(!remoteUser.contains(itr.next()) && localUser.contains(itr.next())) {
				localUser.remove(itr.next());
				returnList.add(itr.next());
			}
		}
		return returnList;
	}

	public static void main(String[] args) {
		List<User> remoteUser=new ArrayList<>();
		List<User> user=new ArrayList<>();
		remoteUser.add(new User("abc"));
		remoteUser.add(new User("abcd"));
		remoteUser.add(new User("abce"));
		remoteUser.add(new User("abcf"));
		remoteUser.add(new User("abcg"));
		remoteUser.add(new User("def"));
		remoteUser.add(new User("gfh"));
		
		user.add(new User("def"));
		user.add(new User("gfh"));
		addUser(remoteUser, user).forEach(System.out::print);
		
	}

}
