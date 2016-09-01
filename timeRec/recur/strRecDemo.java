/***************************************************
 * time record - exploration of objects
 * notice - there is a private class timeRec
 * and a public class timeRecDemo
 *
 * Time: hours 0 - 23
 *       minutes 0 - 59
 **************************************************/

import java.io.*;

class strRec {
	private String name;
	private String[] table;

	//
	// must have 0 as last value - this array must be 'non-zero' - 0 marks end.
	//
	private int[] iList = new int[100]; 
	public strRec (String nm){
		for(int i=0; i< 15; i++){
			iList[i] = 7;
			}
		name = nm;
		}

	public String getName(){
		return name;
		}

	public int strLen (){
		return this.name.length();
		}

	public void loadTable(){
		this.table = new String[17];
		for (int i = 0; i < 17; i++){
			this.table[i] = "this stuff ["  + Integer.toString(i) + "]";
			}
		}

	public boolean isEmptyArray(){
		if(iList[0] == 0) return true;
		return false;
		}

	public void displayTable(){
		for (int i = 0; i < this.table.length; i++){
			System.out.print("\n" + this.table[i]);
			}
		this.endDisplay();
		}

	private void endDisplay(){
		System.out.println("\n\n" + "That's all, folks");
		}

	public void dispArr(){
		for(int i=0;i<iList.length;i++){
			System.out.print("'" + iList[i] + "'");
			}
		}

	public int getElt(int i, int n){
		if(n == 0){
			return iList[i];
			}
		return getElt(i+1, n-1);
		}

	public int[] joinArray(int[] arr1, int[] arr2){
		int[] localArray = new int[arr1.length + arr2.length + 1];
		int i = 0;
		int j = 0;
		for (i=0; i < arr1.length; i++){
			if(arr1[i] > 0){
				localArray[i] = arr1[i];
				}
			}
		for (j=0; j < arr2.length; j++){
			if(arr2[j] > 0){
				localArray[i++] = arr2[j];
				}
			}
		localArray[i] = 0;
		return localArray;
		}

	public int[] joinArray(int v1, int[] arr2){
		int[] localArray = new int[arr2.length + 1 + 1];
		int i = 0;
		localArray[0] = v1;
		for(i=0;i<arr2.length;i++){
			localArray[i+1] = arr2[i];
			}
		localArray[i+1] = 0;
		return localArray;
		}
 
  	/***********************************************
	 * following are the Lisp like functions
	 * only for a 1-level array
	 **********************************************/

	/*******************************************
	 * getFirst
	 * @return int (first int of array)
	 *******************************************/
  	public int getFirst(){
		return iList[0];
		}

	/*******************************************
	 * getRest
	 * @return array of int (all but first)
	 *******************************************/
	public int[] getRest(int[] iArr){
		int[] iLst = new int[iArr.length];
		for(int i=1;i<iArr.length;i++){
			iLst[i-1] = iArr[i];
		}
	return iLst;
	}

	/*******************************************
	 * initArray
	 * initializes iList to an array of 0
	 *******************************************/
  	public void initArray(){
		for(int i=0;i<iList.length;i++){
			iList[i] = 0;
		}
	}

	/*******************************************
	 * setArray
	 * @param - array of int
	 * @side effect - copies param to iList
	 *******************************************/
	public void setArray(int[] iArr){
		this.initArray();

 		for(int i=0;i<iArr.length;i++){
			iList[i] = iArr[i];
		}
	}

	/*******************************************
	 * displayArray
	 * @side effect - prints array to console
	 *******************************************/
	public void displayArray(){
		System.out.print("\n");
		for(int i=0; i < iList.length; i++){
			if(iList[i] > 0){
				System.out.print(iList[i] + ";");
			}
		}
		System.out.print("\n");
	}

	/***************************************************
	 * isArray
	 * Checking if the value is an array or an int
	 **************************************************/
	private boolean isArr(int i){
		return false;
		}

	private boolean isArr(int[] i){
		return true;
		}

	public void displayStrRec(){
		int x = 17;
		int[] i1 = {1,2,3,4,5};
		int[] i2 = {7,6,5,4};
		//int[] i3 = joinArray(i1,i2);
		int[] i4 = joinArray(i1, iList);

		System.out.println("Starting init");	 
		initArray();
		System.out.println("Starting set");
		setArray(i4);
		System.out.println("Length: " + i4.length);

		displayArray();
		System.out.println("DONE");	
		//System.out.print("\nPrinting the name: '" + name + "'");
		//System.out.print(" String Length: " + this.strLen() + "\n");
		//this.loadTable();
		//this.displayTable();
		//Class cls = iList.getClass();
		//boolean isArr = cls.isArray();
		System.out.print("Array: " + isArr(iList));
		System.out.print("Array: " + isArr(4));
		System.out.print("Empty: " + isEmptyArray());
		System.out.print(" The nth element: " + getElt(0, 5) + "\n\n");
		System.out.print("First: " + getFirst() + "\n");
		//displayArray();
		System.out.print("First: " + getFirst() + "\n");
		setArray(getRest(iList));
		System.out.print("First: " + getFirst() + "\n");
		//displayArray();
		System.out.print("First: " + getFirst() + "\n");
		setArray(getRest(iList));
		System.out.print("First: " + getFirst() + "\n");
		//displayArray();
		initArray();
		System.out.println("Empty: " + isEmptyArray());
		}

}

/*********************************************
 * timeRecDemo
 * main to create/call timeRec
 *********************************************/

public class strRecDemo {
	public static void main(String[] args){
		strRec sr = new strRec("this");
		sr.displayStrRec();
		//sr.dispArr();
		}
	}
