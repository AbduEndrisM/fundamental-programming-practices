package lesson2;

import java.util.Random;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [][]a = new int [6][4]; 
		Random  r = new Random();
		
		for(int i=0; i<4; i++) {
			for (int j=0;j<4;j++) {
				a[i][j] = r.nextInt(99)+1;
			}
		}
	
	/*	
		for(int i=0; i<4; i++) {
			for (int j=0;j<4;j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
		*/
			System.out.println("\n");
		
		for(int i=0; i<2; i++) {
			for (int j=0;j<4;j++) {
				
				if(i==0)
					{ 
					System.out.print( "   "+ a[i][j] + "  ");
					}	
				
				else 
					{ 
					System.out.print( " + " + a[i][j] + "  ");
			
					}
				
			}
			
			System.out.println();			
			
		}
		
		System.out.print("  ___\t____\t ____\t____ ");
		
		
		
										System.out.println("\n\n");
										
			
			for(int i=2; i<4; i++) {
				for (int j=0;j<4;j++) {
									
					if(i==2)
						{ 
							System.out.print( "   "+ a[i][j] + "  ");
						}	
									
						else 
							{ 
								System.out.print( " + " + a[i][j] + "  ");
								
							}
											
								}
											
				System.out.println();			
											
			}
			
			System.out.print("  ___\t____\t ____\t____ ");
		
	}
}
