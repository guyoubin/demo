package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void test() {
		System.out.println("test");
	}

	@Test
	public void contextLoads() {
		System.out.println("hello");
	}

	@Test
	public void test_2() {
		System.out.println("test_@");
		System.out.println("test_2");
	}

}
