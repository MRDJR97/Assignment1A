package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class GetUsernameJunitTest {

	@Test
	public void test() {
		Student junit = new Student("DanielRegan", 21);
		String expectedUsername = "DanielRegan21";
		String actualUsername = junit.getUsername();
		assertEquals(expectedUsername, actualUsername);
	}

}
