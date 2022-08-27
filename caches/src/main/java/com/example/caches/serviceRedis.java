package com.example.caches;


import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class serviceRedis {
	
	@Cacheable(cacheNames = "try") // Cachlenmesini Sağlan Anotation :)
	
	public String longrunningMethod() throws InterruptedException {
		Thread.sleep(5000L);
		return "Server is Execute :)";
	
	}
	
	@CachePut
	
	/* 
	 *  @CacheEvict ile Cache Temizleyebilirsiniz
	 *  @CachePut ile KEy value Oluşturabilirsiniz
	 * 
	 * 
	 * 
	 */

}
