import Business.concretes.UserManager;
import Business.concretes.ValidationManager;
import Core.concretes.LoginManager;
import DataAccess.concretes.HibernateUser;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Ersan","Gökalp","ersan@gmail.com", "123456");
		
		UserManager manager=new UserManager(new HibernateUser()	, new ValidationManager(),new LoginManager());
		manager.add(user1);
		manager.login(user1);
		manager.signIn(user1);

	}

}
