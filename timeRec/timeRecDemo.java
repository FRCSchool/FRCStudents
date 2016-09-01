/*
 * time record - exploration of objects
 * notice - there is a private class timeRec
 * and a public class timeRecDemo 
 */

import java.io.*;

class timeRec {
	private int hours;
	private int minutes;
	
	public timeRec (int h, int m){
		if(h <= 24 && h > 0){
			hours = h;
			}
		else {
			hours = h % 24;
			}

		if(m <= 60 && m > 0){
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
		System.out.println("\nPrinting the time... y' know?");
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		}
	
}

class timeRecDemo {
	public static void main(String[] args){
		System.out.println("MAIN");
		timeRec tr = new timeRec(4, 28);
		tr.displayTimeRec();
		}
	}

