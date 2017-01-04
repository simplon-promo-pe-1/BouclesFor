package co.simplon.boucles;

import static org.junit.Assert.*;

import org.junit.Test;

public class BouclesForMethodeIterativeTest {

	@Test
	public void le_tableau_contient_10_elements() {
		BouclesFor boucle = new BouclesFor(1, 10);
		
		int[] tableau = boucle.construireTableau();
		
		assertEquals(10, tableau.length);
		assertEquals(1, tableau[0]);
		assertEquals(10, tableau[9]);
	}

	@Test
	public void les_10_elements_du_tableau_sont_en_ordre_inverse() {
		BouclesFor boucle = new BouclesFor(1, 10);
		
		int[] tableau = boucle.construireTableauInverse();
		
		assertEquals(10, tableau.length);
		assertEquals(10, tableau[0]);
		assertEquals(1, tableau[9]);
	}
	
	@Test
	public void le_tableau_contient_les_10_premiers_entiers_pairs() {
		BouclesFor boucle = new BouclesFor(1, 20);
		
		int[] tableau = boucle.construireTableauEntiersPairs();
		
		assertEquals(10, tableau.length);
		assertEquals(2, tableau[0]);
		assertEquals(20, tableau[9]);
	}
	
	@Test
	public void boucle_for_infinie_interrompue() {
		BouclesFor boucle = new BouclesFor();
		int max = BouclesFor.MAX_SUPPORTED;
		
		int[] tableau = boucle.construireTableau();
		
		assertEquals(max, tableau.length);
		assertEquals(35, tableau[34]);
		assertEquals(max, tableau[max - 1]);
	}
}
