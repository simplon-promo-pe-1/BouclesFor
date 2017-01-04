package co.simplon.boucles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BouclesForeachTest {

	@Test
	public void tous_les_elements_du_tableau_sont_suffixes() {
		BouclesFor boucle = new BouclesFor();
		String[] tableauEntree = new String[] { "A", "B", "C", "D" };
		String suffixe = "E";

		String[] tableauSortie = boucle.suffixerTableau(tableauEntree, suffixe);
		
		assertEquals(4, tableauSortie.length);
		assertEquals("AE", tableauSortie[0]);
		assertEquals("BE", tableauSortie[1]);
		assertEquals("CE", tableauSortie[2]);
		assertEquals("DE", tableauSortie[3]);
	}
	
	@Test
	public void la_matrice_carree_est_mise_a_plat() {
		BouclesFor boucle = new BouclesFor();
		Integer[] ligne1 = new Integer[] { 1, 2 };
		Integer[] ligne2 = new Integer[] { 3, 4 };
		Integer[][] matrice = new Integer[][] { ligne1, ligne2 };
		
		Integer[] tableau = boucle.applanirMatrice(matrice);
		
		assertEquals(4, tableau.length);
		assertEquals(new Integer(1), tableau[0]);
		assertEquals(new Integer(2), tableau[1]);
		assertEquals(new Integer(3), tableau[2]);
		assertEquals(new Integer(4), tableau[3]);
	}
	
	@Test
	public void la_matrice_non_carree_est_mise_a_plat() {
		BouclesFor boucle = new BouclesFor();
		Integer[] ligne1 = new Integer[] { 3, 2, 1 };
		Integer[] ligne2 = new Integer[] { -2, 0, 6 };
		Integer[][] matrice = new Integer[][] { ligne1, ligne2 };
		
		Integer[] tableau = boucle.applanirMatrice(matrice);
		
		assertEquals(6, tableau.length);
		assertEquals(new Integer(3), tableau[0]);
		assertEquals(new Integer(2), tableau[1]);
		assertEquals(new Integer(1), tableau[2]);
		assertEquals(new Integer(-2), tableau[3]);
		assertEquals(new Integer(0), tableau[4]);
		assertEquals(new Integer(6), tableau[5]);
	}
}
