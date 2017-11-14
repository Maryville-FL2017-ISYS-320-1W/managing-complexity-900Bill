import java.util.Scanner;

/*
  	ISYS 320
  	Name(s):
  	Date: 
*/



public class P1_OutputLoopResult {

	public static void main(String[] args) {
		//TODO Auto-Generated method stub
		System.out.println("Square of is");
		Scanner sr = new Scanner(System.in);
		int ns = sr.nextInt(); 
		P1_OutputLoopResult p1_OutputLoopResult = new P1_OutputLoopResult();
		System.out.println("Sum of the squares of "+ns+" numbers is "+P1_OutputLoopResult.sumSquare(ns));
		
	}
	public static int sumSquare(int n) {
		if(n==0)
			return 0;
		else
			return ((n*n)+sumSquare(n-1));
		}
		
	}