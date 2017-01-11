package com.ibm.microservices.refapp.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest( properties = { "spring.cloud.discovery.enabled:false" } )
public class EurekaApplicationTests {

	@Test
	public void contextLoads() {
	}

}
