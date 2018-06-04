package javaBestPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CountrySortByIdComparator implements Comparator<Country>{
public int compare(Country obj1,Country obj2) {
	return (obj1.getCountryId()<obj2.getCountryId())?-1:(obj1.getCountryId()>obj2.getCountryId()?1:0);
	
}
}
public class ComparatorCountry {

	public static void main(String[] args) {
		Country indiaCountry=new Country(1, "India");
		   Country chinaCountry=new Country(4, "China");
		   Country nepalCountry=new Country(3, "Nepal");
		   Country bhutanCountry=new Country(2, "Bhutan");

		         List<Country> listOfCountries = new ArrayList<Country>();
		         listOfCountries.add(indiaCountry);
		         listOfCountries.add(chinaCountry);
		         listOfCountries.add(nepalCountry);
		         listOfCountries.add(bhutanCountry);
		         
		         
		         System.out.println("Before Sort by id : ");
		         for (int i = 0; i < listOfCountries.size(); i++) {
		    Country country=(Country) listOfCountries.get(i);
		    System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getName());
		   }
		         Collections.sort(listOfCountries,new CountrySortByIdComparator());

		         System.out.println("After Sort by id: ");
		         for (int i = 0; i < listOfCountries.size(); i++) {
		    Country country=(Country) listOfCountries.get(i);
		    System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getName());
		   }
		         
		         Collections.sort(listOfCountries,new Comparator<Country>() {

		        	    @Override
		        	    public int compare(Country o1, Country o2) {
		        	     return o1.getName().compareTo(o2.getName());
		        	    }
		        	   });

		        	   System.out.println("After Sort by name: ");
		        	         for (int i = 0; i < listOfCountries.size(); i++) {
		        	    Country country=(Country) listOfCountries.get(i);
		        	    System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getName());
		        	   }
		        	 }

	}


