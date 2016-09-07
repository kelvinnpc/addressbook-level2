package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

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
	
	@Test
	public void uniqueShouldReturnTrue() {
		Collection<Object> testCollection = new ArrayList<Object>();
		testCollection.add("hello");
		testCollection.add(1);
		testCollection.add(2);
		testCollection.add('c');
		testCollection.add("c");
		assertTrue(Utils.elementsAreUnique(testCollection));
	}
	
	@Test
	public void notUniqueShouldReturnFalse() {
		Collection<Object> testCollection = new ArrayList<Object>();
		testCollection.add("hello");
		testCollection.add(1);
		testCollection.add(2);
		testCollection.add('c');
		testCollection.add('c');
		assertFalse(Utils.elementsAreUnique(testCollection));
	}


}
