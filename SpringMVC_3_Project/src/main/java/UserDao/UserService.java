package UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	@Autowired
    private UserDeo userDeo;
    public int createUser(User user) {
    	return this.userDeo.saveUser(user);
    }
}
