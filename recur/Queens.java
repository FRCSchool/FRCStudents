/*
 * time record - exploration of objects
 * notice - there is a private class timeRec
 * and a public class timeRecDemo
 */

import java.io.*;

class ChessBoard {
	private int[] Arr = new int[]{5,3,1,6,4,7,8,1,9};

	private int[][] Board = new int[8][8];
	private int currentI = 0;
	private int currentJ = 0;

	public ChessBoard(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				Board[i][j] = 0;
			}
		}
	}

	public int countQueens(){
		int count = 0;
		for(int i=0;i<8;i++){
			for(int j=0; j < 8; j++){
				if(Board[i][j] > 0) count++;
			}
		}
		return count;
	}

	public void placeQueen(int x, int y){
		Board[x][y] = 1;
	}

	public void removeQueen(int x, int y){
		Board[x][y] = 0;
	}

	public boolean inCheck(int x, int y){
			for(int i=0; i < 8; i++){
				if(Board[i][y] > 0 && i != x){
					return true;
				}
			}
			for(int j=0; j < 8; j++){
				if(Board[x][j] > 0 && j != y){
					return true;
				}
			}

			if(checkDiagonal(x,y,1)) return true;
			if(checkDiagonal(x,y,2)) return true;
			if(checkDiagonal(x,y,3)) return true;
			if(checkDiagonal(x,y,4)) return true;
			return false;
	}


	public boolean XXcheckDiagonal(int x, int y, int type){
		int i=x;
		int j=y;
		if(type == 1){
			while(i < 8 && j < 8){
				if(Board[i][j] > 0 && (i != x && j != y)){
					return true;
				}
				i++; j++;
			}
		}

		if(type == 2){
			while(i < 8 && j > -1){
				if(Board[i][j] > 0 && (i != x && j != y)){
					return true;
				}
				i++; j--;
			}
		}

		if(type == 3){
			while(i > -1 && j < 8){
				System.out.println(i + "/" + j);
				if(Board[i][j] > 0 && (i != x && j != y)){
					return true;
				}
				i--; j++;
			}
		}

			if(type == 4){
				while(i > -1 && j > -1){
					if(Board[i][j] > 0 && (i != x && j != y)){
						return true;
					}
					i--; j--;
				}
			}
				return false;
	}

	public boolean checkDiagonal(int x, int y, int type){
		int i=x;
		int j=y;

		while(i < 8 && i > -1 && j < 8 && j > -1){
			if(Board[i][j] > 0 && (i != x && j != y)){
				return true;
			}

			switch(type){
				case 1: i++; j++; break;
				case 2: i++; j--; break;
				case 3: i--; j++; break;
				case 4: i--; j--; break;
			}
		}
	return false;
	}

	public boolean checkBoard(){
		int count = 0;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(Board[i][j] == 1){
					count++;
				}
			}
		}

		if(count > 7){
			return true;
		}
		return false;
	}

	private boolean squareFilled(int x, int y){
		if(Board[x][y] == 1){
			return true;
		}
		return false;
	}

	public void displayBoard(){
		System.out.print("================\n");
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.print(Board[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}


public class Queens {
	public static void main(String[] args){
		ChessBoard CB = new ChessBoard();
		CB.displayBoard();
		int i = 0; int j = 0;
		while(CB.countQueens() < 5){
				if(i > 7){
					j++; i=0;
				}
				if(j > 7){
					return;
				}
				if(!CB.inCheck(i,j)){
					CB.placeQueen(i,j);
				}
		}

		CB.displayBoard();
		}
	}
