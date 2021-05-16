package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.ValidationService;

public class ValidationManager implements ValidationService{
	
	

	@Override
	public boolean validateName(String name) {
		if (name.length()<2) {
			System.out.println("Ad�n�z 2 karakterden az olamaz");
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean validateSurname(String surname) {
		if(surname.length()<2) {
			System.out.println("Ad�n�z 2 karakterden k���k olmaz");
			return false;
		}
		return true;
	}

	@Override
	public boolean validateemail(String email) {
		String EMAIL_PATTERN = "^(.+)@(\\S+)$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
        return matcher.matches();
		
	}

	@Override
	public boolean validatepassword(String password) {
		if(password.length()<6) {
			System.out.println("�ifre en az 6 karakter olmal�");
			return false;
		}else {
			return true;
		}
	
	}

	@Override
	public boolean validateIsClick(boolean isClick) {
		
		return isClick;
	}

}
