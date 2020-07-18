package com.vvs.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

//	@GetMapping("/")
	public String firstPage() {
		return "<h2>We succeed. We are viewing our first page</h2>";
	}
}
