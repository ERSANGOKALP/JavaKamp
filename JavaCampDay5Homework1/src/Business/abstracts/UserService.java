package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
	
	void signIn (User user);
	void login (User user);
	void add(User user);
	void delete(User user);
	void update(User user);
}
