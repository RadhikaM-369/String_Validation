package Strings;

public class validationDiffId {

	public static void main(String[] args) {
		String userId="radhika.magadum@tutanota.com";
		
		if(userId.isBlank()==false && userId.contains("@") && userId.endsWith(".com")) {
			if(userId.contains("gmail") ) {
				System.out.println("User is trying to login with : "+userId);
			} 
			else if(userId.contains("yahoo") ) {
				System.out.println("User is trying to login with : "+userId);
			} 
			else if(userId.contains("rediffmail") ) {
				System.out.println("User is trying to login with : "+userId);	
			} 
			else if(userId.contains("icloud") ) {
				System.out.println("User is trying to login with : "+userId);	
			}
			else if(userId.contains("aol") ) {
				System.out.println("User is trying to login with : "+userId);	
			} 
			else System.out.println("Access denied, user is trying to login with : "+userId+" please login with gmail/ yahoo/ rediffmail/ icloud/ aol account ");
			}
		else System.out.println("Enter valid email Id");	
	}

}
