package Business.concretes;

import Business.abstracts.UserService;

import Business.abstracts.ValidationService;
import Core.abstracts.LoginServices;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	private ValidationService service;
	private UserDao userDao;
	private LoginServices loginServices;
	
	
	
	
	public UserManager(UserDao userDao, ValidationService service, LoginServices loginServices) {
		this.userDao = userDao;
		this.service = service;
		this.loginServices = loginServices;
		
	}
	

	@Override
	public void signIn(User user) {
		if(service.validatepassword(user.getPassword())!= service.validatepassword(user.getPassword()) && 
		   service.validateemail(user.getEmail())!= service.validateemail(user.getEmail()) &&
		   service.validateName(user.getName()) != service.validateName(user.getName()) && 
		   service.validateSurname(user.getSurname())!=service.validateSurname(user.getSurname()) ) {
				this.userDao.signIn(user);	
					
				}
				
				
		
		
	}

	@Override
	public void login(User user) {
		if(!service.validatepassword(user.getPassword()) && !service.validateemail(user.getEmail())) {
			System.out.println("Parola veya email hatalý.");
			return;
		}
		loginServices.login(user);
		System.out.println("Hoþgeldiniz");
		
	}

	@Override
	public void add(User user) {
		if(!service.validatepassword(user.getPassword()) && !service.validateemail(user.getEmail()) &&
				   !service.validateName(user.getName()) && !service.validateSurname(user.getSurname())) {
					System.out.println("Girilen bilgilerinizde hata var.");
					return;
				}
				this.userDao.add(user);
				
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
