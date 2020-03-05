package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {

	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		// Assert.assert
	}

	@Test
	public void testInsert() {
		MapADT<String, String> map1 = new JavaMap<>();
		map1.put("A", "Aardvark");
		assertEquals(map1.size(), 1 );
		// Assert.assert
	}

	@Test
	public void testInsert2() {
		MapADT<String, String> map2 = new JavaMap<>();
		map2.put("A", "Aardvark");
		map2.put("C", "Cat");
		map2.put("K", "Cat");
		assertEquals(map2.size(), 3);
		assertEquals(map2.get("A"), "Aardvark");
		assertEquals(map2.get("C"), "Cat");
		assertEquals(map2.get("K"), "Cat");

		// Assert.assert
	}

	@Test
	public void testInsert3() {
		MapADT<String, String> map3 = new JavaMap<>();
		map3.put("A", "Aardvark");
		map3.put("C", "Cat");
		assertEquals(map3.size(), 2);
		map3.put("C", "Cat");
		assertEquals(map3.size(), 2);
		// Assert.assert
	}

	@Test
	public void testInsert4() {
		MapADT<String, String> map3 = new JavaMap<>();
		map3.put("A", "Aardvark");
		map3.put("C", "Cat");
		assertEquals(map3.size(), 2);
		assertEquals(map3.get("C"), "Cat");
		map3.put("C", "Cow");
		assertEquals(map3.size(), 2);
		assertEquals(map3.get("C"), "Cow");
		// Assert.assert
	}

	@Test
	public void testGet() {
		MapADT<String, String> map4 = new JavaMap<>();
		map4.put("A", "Aardvark");
		map4.put("C", "Cat");
		assertEquals(map4.size(), 2);
		assertEquals(map4.get("A"), "Aardvark");
		assertEquals(map4.get("C"), "Cat");

	}

	@Test
	public void testRepeatedGet() {
		MapADT<String, String> map5 = new JavaMap<>();
		map5.put("A", "Aardvark");
		map5.put("C", "Cat");
		assertEquals(map5.size(), 2);
		assertEquals(map5.get("D"), null);	
		assertEquals(map5.get("A"), "Aardvark");		
		assertEquals(map5.get("C"), "Cat");		
	}

	@Test
	public void testSize() {
		MapADT<String, String> map6 = new JavaMap<>();
		map6.put("A", "Aardvark");
		map6.put("C", "Cat");
		assertEquals(map6.size(), 2);		
	}

	@Test
	public void testRemove() {
		MapADT<String, String> map7 = new JavaMap<>();
		map7.put("A", "Aardvark");
		map7.put("C", "Cat");
		assertEquals(map7.size(), 2);
		assertEquals(map7.get("C"), "Cat");
		assertEquals(map7.get("A"), "Aardvark");
		map7.remove("C");
		assertEquals(map7.size(), 1);
		assertEquals(map7.get("C"), null);
		assertEquals(map7.get("A"), "Aardvark");
	}

	@Test
	public void testRepeatedRemove() {
		MapADT<String, String> map8 = new JavaMap<>();
		map8.put("A", "Aardvark");
		map8.put("C", "Cat");
		assertEquals(map8.size(), 2);
		assertEquals(map8.get("A"), "Aardvark");
		assertEquals(map8.get("C"), "Cat");
		map8.remove("Z");
		assertEquals(map8.size(), 2);
		assertEquals(map8.get("A"), "Aardvark");
		assertEquals(map8.get("C"), "Cat");
	}

}
