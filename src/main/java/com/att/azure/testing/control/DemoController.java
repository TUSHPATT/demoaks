package com.att.azure.testing.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

	@GetMapping("/{name}")
	public String getName(@PathVariable String name) {
		return String.format("Hello %s", name);
	}

}
