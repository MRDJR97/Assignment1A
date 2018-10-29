package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetUsernameTest {

	@Test
	public void test() {
		Student junit = new Student();
		int age = 21;
		String name = "DanielRegan";
		junit.setAge(age);
		junit.setName(name);
		String expectedUsername = name.concat(Integer.toString(age));
		String actualUsername = junit.getUsername();
		assertEquals(expectedUsername, actualUsername);
	}

}
