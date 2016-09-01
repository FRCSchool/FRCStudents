import java.util.Scanner;

class blowOut {
	public static void main (String[] args){
		int i = 2;
		Scanner s = new Scanner(System.in);
		do { 
			i *= 2;		
			System.out.println("Hello World:" + i);
		} while (i > 0);
	}
}
