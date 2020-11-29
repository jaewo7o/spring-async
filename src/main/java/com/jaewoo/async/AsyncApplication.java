package com.jaewoo.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@Slf4j
@SpringBootApplication
public class AsyncApplication {

	@RestController
	public static class MyController {
		@GetMapping("/callable")
		public String async() throws InterruptedException {
			log.info("callable");
			//return new Callable<String>() {
				//@Override
				//public String call() throws Exception {
					log.info("async");
					Thread.sleep(2000);
					return "hello";
				//}
			//};
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(AsyncApplication.class, args);
	}

}
