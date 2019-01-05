package tr.edu.medipol.hesaplama;

import static org.junit.Assert.*;

import org.junit.Test;

public class DorsislemTest {

	@Test
	public void testToplama() {
		
		int sonuc = new Dortislem().toplama(45, 55);
		assertEquals(100, sonuc);
		
		
	}

	@Test
	public void testCikarma() {
		int sonuc = new Dortislem().cikarma(45, 55);
		assertEquals(-10, sonuc);
	}

	@Test
	public void testCarpma() {
		int sonuc = new Dortislem().carpma(45, 10);
		assertEquals(450, sonuc);
	}

	@Test
	public void testBolme() {
		int sonuc = new Dortislem().bolme(45, 5);
		assertEquals(9, sonuc);
	}

}
