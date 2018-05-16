package teams.rms.dao;

import org.springframework.stereotype.Component;

import teams.rms.entity.User;

public interface UserMapper {

		public User getUser(int id);
}
