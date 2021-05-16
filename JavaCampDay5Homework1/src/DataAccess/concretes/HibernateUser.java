package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUser implements UserDao{
	
	
	

	@Override
	public void add(User user) {
		System.out.println(user.getName() + "adlý kullanýcý eklendi");
				
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + "adlý kullanýcý silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + "adlý kullanýcýnýn bilgileri güncellendi");
		
	}

	@Override
	public void signIn(User user) {
		System.out.println("Baþarýlý bir þekilde kayýt oldunuz ");
		
	}

}
