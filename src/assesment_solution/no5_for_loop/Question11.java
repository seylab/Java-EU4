package assesment_solution.no5_for_loop;

public class Question11 {

	public static void main(String[] args) {
		/**
		 * Question-11:
		 * 
		 * Print the following output using nested for loops.
		 * 
		 * 4 3 2 1
		 *  3 2 1
		 *   2 1
		 *    1
		 * 
		 */

		for (int i = 4; i >= 1; i--) {
			
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
//				if (j != 1) {
					System.out.print(" ");
//				}
			}
			System.out.println();

		}
		/*
		    4 3 2 1 
			3 2 1 
			2 1 
			1 
		 */
		
		System.out.println("--------");
		for (int i = 4; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print(j);
//				if (j != 1) {
					System.out.print(" ");
//				}
			}
			System.out.println();

		}
		/*
		    4 3 2 1 
			  3 2 1 
			    2 1 
			      1 
			
			// add 0 space in 1st iteration  (4-4) * 2 
			// add 2 space in 2nd iteration  (4-3) * 2 
			// add 4 space in 3rd iteration  (4-2) * 2
			// add 6 space in 4th iteration  (4-1) * 2
			 * 
			 * 
		 */
		System.out.println("--------");
		for (int i = 4; i >= 1; i--) {

			for(int j=1 ; j<= (4-i)*2 ;j++) {
				System.out.print(" ");
			}
			
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
//				if (j != 1) {
				System.out.print(" ");
//				}
			}
			System.out.println();

		}
		
		System.out.println("--------");
		/*
		    1 
			1 2 
			1 2 3 
			1 2 3 4 
		 * */
		
		for (int i = 1; i <= 4; i++) {
		
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		 *     
		       1 
			  1 2 
			 1 2 3 
			1 2 3 4 
		 * */
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4-i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		/*
		  	  1 
		    1 2 
		  1 2 3 
		1 2 3 4 

		 * */
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= (4-i)*2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

		

	}

}
