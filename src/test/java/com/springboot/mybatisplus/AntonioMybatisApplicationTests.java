package com.springboot.mybatisplus;

import com.springboot.mybatisplus.entity.User;
import com.springboot.mybatisplus.service.IUserService;
import com.springboot.mybatisplus.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AntonioMybatisApplicationTests {

	@Resource
	private IUserService userService;

	@Test
	public void findAll() {
		//查询所有，注意需要添加有参构造和无参构造 @AllArgsConstructor ， @NoArgsConstructor
		List<User> list = userService.list();
		list.forEach(System.out::println);
	}

	@Test
	public void findById(){
		User user = userService.getById(1);
		System.out.println(user.toString());
	}
}
