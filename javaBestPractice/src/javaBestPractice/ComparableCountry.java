package javaBestPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Country implements Comparable<Country>{
	int countryId;
	String name;
	
	Country(int id,String con){
		countryId=id;
		name=con;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Country obj) {
		System.out.println("inside compare");
		return (obj.countryId > this.countryId )? -1 :( obj.countryId < this.countryId )? 1 : 0 ;
	}
}
public class ComparableCountry {

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
		         
		         System.out.println("Before Sort  : ");
		         for (int i = 0; i < listOfCountries.size(); i++) {
		    Country country=(Country) listOfCountries.get(i);
		    System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getName());
		   }
		         Collections.sort(listOfCountries);

		         System.out.println("After Sort  : ");
		         for (int i = 0; i < listOfCountries.size(); i++) {
		    Country country=(Country) listOfCountries.get(i);
		    System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getName());
		   }

	}

}
