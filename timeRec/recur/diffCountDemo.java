/***************************************************
 * DiffCountDemo: different recursive counts 
 **************************************************/

import java.io.*;

class diffCount {
	private int theCount;
	
	public diffCount (int i){
		this.theCount = i;
	}

	private void endDisplay(){
		System.out.println("\n\n" + "That's all, folks");
		}

	/*********************************************
  	 * factorial: 
	 * x!
	 * x (x-1)(x-2)...(1)
	 *********************************************/
	public int getFactorial(int i){
		if(i < 1) return 1;
		return i * getFactorial(i - 1);
		}

	/*********************************************
	 * fibbonacci numbers
	 * 1,1,2,3,5,8,13,21,34,55,89...
	 *********************************************/
	public int getFibbo(int i, int j, int k){
		if(k == 1) return 1;
		return i + getFibbo(j, i+j, k-1);
		}

	public int powerTwo(int x){
		if(x == 0) return 1;
		return 2 * powerTwo(x - 1);
		}

	public void displayOtherInt(int i){
		System.out.print("\nThe value of this integer is: " + i + "\n");
		}

	public void displayInt(){
		System.out.print("\nPrinting the int: '" + this.theCount + "'");
		this.endDisplay();
		}
	
}

/*********************************************
 * timeRecDemo
 * main to create/call timeRec
 *********************************************/

public class diffCountDemo {
	public static void main(String[] args){
		diffCount dc = new diffCount(17);
		dc.displayInt();
		System.out.println("\nFactorial: ");
		dc.displayOtherInt(dc.getFactorial(5));
		System.out.print("\n\n7th Fibbonacci: 1,1,2,3,5,8,13,21,34,55,89\n\n");
		dc.displayOtherInt(dc.getFibbo(1, 1, 7));
		for(int i = 0; i < 16; i++){
			System.out.println("\nTwo to the power of " + i);
			dc.displayOtherInt(dc.powerTwo(i)); 
			}
		}
	}
