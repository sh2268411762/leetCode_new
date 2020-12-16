package com.gdpph.o1kuaixue.demo.chapter20.section2.section2;

import com.demo.spring.bean.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 零壹学堂
 */
@RestController
public class IndexController {
	private static final String PREFIX = "Hello %s !";

	@RequestMapping(value = "/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(String.format(PREFIX, name));
	}
}
