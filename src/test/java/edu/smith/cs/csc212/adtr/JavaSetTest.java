package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {

	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}

	@Test
	public void testInsert1() {
		SetADT<String> set1 = new JavaSet<>();
		set1.insert("A");
		assertEquals(set1.size(), 1);	
		assertEquals(set1.contains("A"), true);
	}

	@Test
	public void testInsertDiff() {
		SetADT<String> set2 = new JavaSet<>();
		set2.insert("A");
		set2.insert("B");
		assertEquals(set2.size(), 2);
		assertEquals(set2.contains("A"), true);
		assertEquals(set2.contains("B"), true);
	}

	@Test
	public void testInsertSame() {
		SetADT<String> set3 = new JavaSet<>();
		set3.insert("A");
		set3.insert("A");
		assertEquals(set3.size(), 1);
		assertEquals(set3.contains("A"), true);	
	}

	@Test
	public void testContains() {
		SetADT<String> set4 = new JavaSet<>();
		set4.insert("A");
		set4.insert("C");
		assertEquals(set4.size(), 2);
		assertEquals(set4.contains("A"), true);	
		assertEquals(set4.contains("C"), true);
	}

	@Test
	public void testNotContains() {
		SetADT<String> set5 = new JavaSet<>();
		set5.insert("A");
		set5.insert("C");
		assertEquals(set5.size(), 2);
		assertEquals(set5.contains("Z"), false);
		assertEquals(set5.contains("A"), true);
		assertEquals(set5.contains("C"), true);
	}

	@Test
	public void testRemove() {
		SetADT<String> set6 = new JavaSet<>();
		set6.insert("A");
		set6.insert("C");
		set6.remove("A");
		assertEquals(set6.contains("A"), false);
		assertEquals(set6.contains("C"), true);
		assertEquals(set6.size(), 1);
	}

	@Test
	public void testRemoveNot() {
		SetADT<String> set6 = new JavaSet<>();
		set6.insert("A");
		set6.insert("C");
		set6.remove("Z");
		assertEquals(set6.size(), 2);
		assertEquals(set6.contains("A"), true);
		assertEquals(set6.contains("C"), true);
		assertEquals(set6.contains("Z"), false);
	}

}
