package com.example.caches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/try")
public class CacheController {
	
	@Autowired
	private serviceRedis redis;
	
	
	
	
	@GetMapping
	public String cacheControl() throws InterruptedException {
		return redis.longrunningMethod();
	}

}
