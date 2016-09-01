/***************************************************
 * time record - exploration of objects
 * notice - there is a private class timeRec
 * and a public class timeRecDemo 
 * 
 * Time: hours 0 - 23
 *       minutes 0 - 59
 **************************************************/

import java.io.*;

class timeRec {
	private int hours;
	private int minutes;
	
	public timeRec (int h, int m){
		if(h < 24 && h > 0){
			hours = h;
			}
		else {
			hours = h % 24;
			}

		if(m < 60 && m > 0){
			minutes = m;
			}
		else {
			minutes = m % 60;
			}

	}

	public int getHours(){
		return hours;
		}

	public int getMinutes(){
		return minutes;
		}

	public void setHours(int h){
		hours = h;
		}

	public void setMinutes(int m){
		minutes = m;
		}

	public void displayTimeRec(){
		System.out.print("\nPrinting the time: ");
		System.out.print("Hours: " + hours);
		System.out.print(" Minutes: " + minutes + "\n");
		}
	
}

/*********************************************
 * timeRecDemo
 * main to create/call timeRec
 *********************************************/

public class timeRecDemo {
	public static void main(String[] args){
		timeRec tr = new timeRec(4, 28);
		tr.displayTimeRec();
		}
	}

