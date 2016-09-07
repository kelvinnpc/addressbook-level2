package seedu.addressbook.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void noInputShouldReturnFalse() {
		assertFalse(Utils.isAnyNull());
	}
	
	@Test
	public void oneNullShouldReturnTrue() {
		assertTrue(Utils.isAnyNull("hello", 1, null));
	}
	
	@Test
	public void noNullShouldReturnFalse() {
		assertFalse(Utils.isAnyNull("hello", 1, 0, 'c'));
	}

}
