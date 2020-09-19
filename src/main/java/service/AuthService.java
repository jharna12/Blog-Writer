package service;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;
import model.User;
import dto.RegisterRequest;
public class AuthService {
	@Autowired
	private UserRepository userRepository;
public void Signup(RegisterRequest registerRequest) {
	
  
	User user=new User();
	user.setUsername(registerRequest.getUsername());
	user.setPassword(registerRequest.getPassword());
	user.setEmail(registerRequest.getEmail());	
	userRepository.save(user);
}
}
