package Strings;

public class EmailValidation {

	public static void main(String[] args) {
		String userId="radhika.magadum@gmail.com";
		
		if(userId.isBlank()==false && userId.contains("@") && userId.endsWith(".com")) {
			
			System.out.println("Register successfull");
		} 
		else 
			System.out.println("Please Enter valid User id");
	}

}
