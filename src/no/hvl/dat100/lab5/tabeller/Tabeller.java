package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String returnString = "[";
		
	for (int i = 0; i < tabell.length; i++) {
		
		if (i != tabell.length - 1) {
			returnString += (tabell[i] + ",");
		} else {
			returnString += tabell[i];
		}
	}
		returnString += ("]");
		
		return returnString;
	
	}

	// c)
	public static int summer(int[] tabell) {

		int returnSum = 0;
		
		//For løkke
		
		/*for(int i = 0;  i < tabell.length; i++) {
			returnSum += tabell[i];
		} */
		
		//While løkke		
		/*int index = 0;
		
		while(index < tabell.length){
			returnSum += tabell[index];
				index += 1;
		} */
		
		
		//utvidet for løkke
		
		for (int i : tabell) {
			
			returnSum += i;
		}
			
		return returnSum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean returnFinnes = false;
		
		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				returnFinnes = true;
			}
		}
		
		return returnFinnes;
		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int returnPosisjon = -1;
		
		for (int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				returnPosisjon = i;
			}
			
		}
		
		return returnPosisjon;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		
		// TODO
		
		int[] returnInverse = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			
			returnInverse[i] = tabell[tabell.length - i - 1];
			
		}
		
		return returnInverse;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean returnSotert = true;
		
		for (int i = 0; i < tabell.length - 1 ; i++) {
			if (tabell[i] > tabell[i + 1]) {
				
				returnSotert = false;
			} else {returnSotert = true;
					}
			
		}
		
		return returnSotert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] returnSammen = new int[tabell1.length + tabell2.length];
		

		for (int i = 0; i < returnSammen.length; i++) {
			if(i < tabell1.length) {
			returnSammen[i] = tabell1[i];
			}
			else{			
				returnSammen[i] = tabell2[i - tabell1.length];
			}
		}
		
		return returnSammen;
	}
}
