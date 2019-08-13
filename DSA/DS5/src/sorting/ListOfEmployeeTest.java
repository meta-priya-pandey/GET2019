package sorting;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ListOfEmployeeTest {

	ListOfEmployee list = new ListOfEmployee();
	List<String> sortedList = new ArrayList<String>();

	@Before
	public void addToListTest() {
		list.addEmployee("Ankita", 200, 30);
		list.addEmployee("Priya", 500, 50);
		list.addEmployee("Chandra", 700, 40);
	}

	@Test
	public void sortTest() {
		list.sort();
		sortedList.add("Chandra");
		sortedList.add("Priya");
		sortedList.add("Ankita");
		assertEquals(sortedList, list.display());
	}
}