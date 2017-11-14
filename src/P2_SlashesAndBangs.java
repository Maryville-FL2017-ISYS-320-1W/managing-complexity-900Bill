/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	
Draw a box with 6 lines and 20 columns mixing backslashes and exclamation points.
for (line 1) 20 exclamation points
for (line2-6) add 4 more backslashes than the line prior
while deleting exclamation points.



*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 
 
 
 
 */

public class P2_SlashesAndBangs {
	public static final int LINES = 6;
	public static final int Columns = 20;

	public static void main(String[] args) {
		for (int line = LINES; line >=1; line--) {
			for (int i = 1; i <= (line - 1); i++ ) {
				System.out.print("!");
			}
			int slash = 1 * LINES ;
			for(int i = 4; i <= slash; i++) {
				System.out.print("/");
			}
			System.out.println("");
		}
	}

}
