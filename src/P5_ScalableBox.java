

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_ScalableBox {

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		int drawBoxCap = 7;
		for( int capDashIndex = 1; capDashIndex <= drawBoxCap ; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		int drawBoxInsides = 7;
		for( int insideRowIndex = 1; insideRowIndex <= drawBoxInsides ; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		int insidelines = 7;
		for( int insideRowIndex = 1; insideRowIndex <= insidelines ; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
