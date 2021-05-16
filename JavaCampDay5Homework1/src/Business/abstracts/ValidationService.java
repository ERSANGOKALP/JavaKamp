package Business.abstracts;

public interface ValidationService {
	
	boolean validateName (String name);
	boolean validateSurname(String surname);
	boolean validateemail(String email);
	boolean validatepassword(String password);
	boolean validateIsClick(boolean isClick);
	

}
