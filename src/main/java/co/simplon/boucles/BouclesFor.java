package co.simplon.boucles;

public class BouclesFor {
	// ceci est une constante de la classe
	public static final int MAX_SUPPORTED = 100;

	// des attributs d'instance qui permettent de définir un entier de début et
	// un entier de fin
	private Integer debut = null;
	private Integer fin = null;

	private int tailleTableau = 0;

	/**
	 * Constructeur par défaut
	 */
	public BouclesFor() {
	}

	/**
	 * Constructeur avec bornes
	 * 
	 * @param debut
	 *            Borne de début
	 * @param fin
	 *            Borne de fin
	 */
	public BouclesFor(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	}

	public int[] construireTableau() {
		if (debut == null || fin == null) {
			tailleTableau = MAX_SUPPORTED;
			return construireTableauSansBornes();
		} else {
			tailleTableau = this.fin - this.debut + 1;
			return construireTableauAvecBornes();
		}
	}

	public int[] construireTableauInverse() {
		tailleTableau = this.fin - this.debut + 1;
		int[] tableauInverse = new int[tailleTableau];

		int valeur = this.fin;
		for (int index = 0; index < tailleTableau; index++, valeur--) {
			tableauInverse[index] = valeur;
		}

		return tableauInverse;
	}

	/**
	 * Solution reposant sur le tableau en sens croissant
	 * 
	 * @return
	 */
	public int[] construireTableauInverseSolutionAlternative() {
		int[] tableau = construireTableau();
		int[] tableauInverse = new int[tailleTableau];

		int j = tailleTableau - 1;
		for (int i = 0; i < tailleTableau; i++, j--) {
			tableauInverse[i] = tableau[j];
		}

		return tableauInverse;
	}
	
	public int[] construireTableauEntiersPairs() {
		tailleTableau = (this.fin - this.debut + 1) / 2;
		int[] tableau = new int[tailleTableau];
		
		for (int i = this.debut, index=0 ; i <= this.fin ; i++) {
			if (i % 2 == 0) {
				tableau[index] = i;
				index++;
			}
		}
		
		return tableau;
	}

	public int[] construireTableauEntiersPairsParcoursTableau() {
		tailleTableau = (this.fin - this.debut + 1) / 2;
		int[] tableau = new int[tailleTableau];

		// je détermine la valeur de la première case de mon tableau
		int valeur = this.debut;
		if (valeur % 2 != 0) {
			valeur++;
		}

		for (int index = 0; index < tailleTableau; index++, valeur+=2) {			
			tableau[index] = valeur;
		}

		return tableau;
	}

	private int[] construireTableauAvecBornes() {
		int[] tableau = new int[tailleTableau];

		int index = 0;
		for (int i = this.debut; i <= this.fin; i++) {
			tableau[index++] = i;
		}

		return tableau;
	}

	private int[] construireTableauSansBornesVersionSimple() {
		int[] tableau = new int[tailleTableau];
		
		for (int index=0 ; index < tailleTableau ; index++) {
			tableau[index] = index+1;	
		}	
	
		return tableau;
	}
	
	private int[] construireTableauSansBornes() {
		int[] tableau = new int[tailleTableau];
		
		int index = 0;
		for (;;) {
			if (index == MAX_SUPPORTED) {
				break;
			}
			tableau[index] = ++index;
		}
		
		return tableau;
	}

	public String[] suffixerTableau(String[] tableauEntree, String suffixe) {
		String[] tableauSortie = new String[tableauEntree.length];
		int index = 0;
		
		for (String element : tableauEntree) {
			tableauSortie[index] = element + suffixe;
			index++;
		}
		
		return tableauSortie;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		int taille = 0;
		for (Integer[] ligne : matrice) {
			taille += ligne.length;
		}
		
		Integer[] tableauSortie = new Integer[taille];
		int index = 0;

		for (Integer[] ligne : matrice) {
			for (Integer element : ligne) {
				tableauSortie[index] = element;
				index++;
			}
		}
		return tableauSortie;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}

	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}
