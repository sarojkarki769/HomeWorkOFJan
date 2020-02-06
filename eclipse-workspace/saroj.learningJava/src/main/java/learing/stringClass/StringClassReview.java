package learing.stringClass;

public class StringClassReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String city;
//	city = "Manassas";
//	int cityLength =city.length();   // finding the length of city.
//	
//	
//	System.out.println(city.length());
//	System.out.println(cityLength);
//	
	
	String firstName ="Saroj";
	int numberOfchaz = firstName.length();
	 
//	System.out.println("Number of in my name is " + numberOfchaz);
	 
	String lastName = new String("Tursun");
	String lastNameUpperCase = "TURSUN";
	
	 
//	System.out.println(lastName.toUpperCase());
//	 System.out.println(lastName.toLowerCase());
	 
	 
//	 boolean result = lastNameUpperCase == lastName.toUpperCase();
	
//	System.out.println(result);
//	System.out.println(!result);
	
//	System.out.println(lastNameUpperCase.equalsIgnoreCase(lastName));
//	System.out.println(lastNameUpperCase.equals(lastName));

	
	
// String email = "sarojkarki769@ymail.com";
// boolean checkingTheEmail = email.contains("karki");
// 
//System.out.println(checkingTheEmail);
	
	
	
	
	String email = "saroj.karki769@ymail.com";
//	int index = email.indexOf("7");
	int index2 = email.indexOf(".");
	int index3 = email.indexOf("7");
	
//	System.out.println(index);
	System.out.println(index2);
	System.out.println(index3);
	
	
	String fullName = email.substring(0, index);
	String firstName1 = email.substring(0, index2);
	String lastName1 = email.substring(5, index3);
	
			System.out.println(fullName);
			System.out.println(firstName1);
			System.out.println(lastName1);
			
			
			//// OR  ///OR
			
			
			
			int indexOfPoint = fullName.index(".");
			
			String firstName2 = fullName.substring(0, indexOfPoint);
			
			System.out.println(firstName2);
			
			String lastName2 = fullName.substring(indexOfPoint+1);
			
   	System.out.println(lastName2);
	
	
	
	
	
	
	
	
 
	
	
	
	
	}

}
