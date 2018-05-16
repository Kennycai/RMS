package teams.rms.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import teams.rms.dao.UserMapper;
import teams.rms.entity.User;
import teams.rms.service.impl.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
    @RequestMapping("/showUser")  
    public String toIndex(Map<String, Object> map, int id){  
        User user = userService.getUserById(id);
        map.put("user", user);
        return "showUser";  
    }  
}
