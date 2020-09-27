package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] index : matrise ) {
			System.out.println();
			for(int idx : index) {
				System.out.print(idx + " ");
			}
			
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String returnString = "";
		
		for (int[] index : matrise ) {
			for(int idx : index) {
				returnString += idx + " ";
			}
			returnString += "\n";
		}
		
		return returnString;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] returnMatrix = new int[matrise.length][matrise[0].length] ;
		
		for (int rad = 0; rad < matrise.length; rad++){
			for(int element = 0; element < matrise[rad].length; element++) {
			returnMatrix[rad][element] = matrise[rad][element]	* tall;
			}
			
		}
		
		return returnMatrix;
			
	
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean returnSame = true;
		
		for (int rad = 0; rad < a.length; rad++){
			for(int element = 0; element < a[rad].length; element++) {
				if(a[rad][element] != b[rad][element]) {
					returnSame = false;
				}
				
			}
			
		}
			return returnSame;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
