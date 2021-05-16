package DataAccess.concretes;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUser implements UserDao{
	
	
	

	@Override
	public void add(User user) {
		System.out.println(user.getName() + "adl� kullan�c� eklendi");
				
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + "adl� kullan�c� silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + "adl� kullan�c�n�n bilgileri g�ncellendi");
		
	}

	@Override
	public void signIn(User user) {
		System.out.println("Ba�ar�l� bir �ekilde kay�t oldunuz ");
		
	}

}
