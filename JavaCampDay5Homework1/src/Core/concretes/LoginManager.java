package Core.concretes;



import java.util.Scanner;


import Core.abstracts.LoginServices;
import Entities.concretes.User;

public class LoginManager implements LoginServices{
	
	@Override
	public boolean login(User user) {
		Scanner scan =new Scanner(System.in);
		
		while (true) {
			
			System.out.println("is this your email : " + user.getEmail() );
			System.out.println("Please enter true or false ");
			String verified = scan.nextLine();
		
		
		
			if(verified.equals("true")) {
				System.out.println("Email is verified");
				return true;
			} 
			else if (verified.equals("false")) {
				System.out.println("This email is not verified.");
				return false;
			}
		}
		
		
	}

}
