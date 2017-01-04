package co.simplon.boucles;

public class BouclesFor {
	// ceci est une constante de la classe
	public static final int MAX_SUPPORTED = 100;

	// des attributs d'instance qui permettent de définir un entier de début et
	// un entier de fin
	private Integer debut = null;
	private Integer fin = null;
	
	private final int tailleTableau;

	/**
	 * Constructeur par défaut
	 */
	public BouclesFor() {
		this.tailleTableau = 0;
	}

	/**
	 * Constructeur avec bornes
	 * @param debut Borne de début
	 * @param fin Borne de fin
	 */
	public BouclesFor(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
		tailleTableau = this.fin - this.debut + 1;
	}

	public int[] construireTableau() {
		if (debut == null || fin == null) {
			return construireTableauSansBornes();
		} else {
			return construireTableauAvecBornes();
		}
	}

	public int[] construireTableauInverse() {
		int[] tableauInverse = new int[tailleTableau];
		
		int valeur = this.fin;
		for (int index=0 ; index < tailleTableau ; index++, valeur--) {
			tableauInverse[index] = valeur;
		}
		
		return tableauInverse;
	}
	
	/**
	 * Solution reposant sur le tableau en sens croissant
	 * @return
	 */
	public int[] construireTableauInverseSolutionAlternative() {
		int[] tableau = construireTableau();
		int[] tableauInverse = new int[tailleTableau];
		
		int j = tailleTableau -1;
		for (int i = 0 ; i < tailleTableau ; i++, j--) {
			tableauInverse[i] = tableau[j];
		}
		
		return tableauInverse;
	}

	public int[] construireTableauEntiersPairs() {
		return null;
	}

	private int[] construireTableauAvecBornes() {
		int[] tableau = new int[tailleTableau];

		int index = 0;
		for (int i = this.debut ; i <= this.fin ; i++) {
			tableau[index++] = i;
		}
		
		return tableau;
	}

	private int[] construireTableauSansBornes() {
		return null;
	}

	public String[] suffixerTableau(String[] tableauEntree, String suffixe) {
		return null;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		return null;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}

	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}
