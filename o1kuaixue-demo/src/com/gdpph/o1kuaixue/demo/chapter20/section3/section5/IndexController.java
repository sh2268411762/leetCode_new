package com.gdpph.o1kuaixue.demo.chapter20.section3.section5;

import com.demo.jpa.entity.Users;
import com.demo.jpa.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 零壹学堂
 */
@RestController
@RequestMapping(value = "/person")
public class IndexController {

	@Autowired
	private UsersRepository usersRepository;

	@GetMapping("/all")
	public List<Users> allPerson() {
		return usersRepository.findAll();
	}

	@GetMapping("/find")
	public Users findPerson(
			@RequestParam(value = "name") String name) {
		return usersRepository.findByName(name);
	}
}
