package teams.rms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teams.rms.dao.UserMapper;
import teams.rms.entity.User;


@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		User user = userMapper.getUser(id);
		return user;
	}

}
