package Model;

import java.util.Stack;

public class Chess {
	int value; // gia tri cua quan co 10,35,30,50,90,1000
	int index; // 1 la ben may,-1 la ben minh;
	int isQueen = 0;

	Chess() {
	}

	public Chess(Chess other) {
		this.value = other.value;
		this.index = other.index;
		this.isQueen = other.isQueen;
		this.P = new Location(other.P.x, other.P.y);
		this.Pnew = (Stack<Location>) other.Pnew.clone();
	}

	Location P = new Location(); // vi tri hien tai
	Stack<Location> Pnew = new Stack<Location>(); // vi tri di chuyen toi duoc

	void die() {
		this.value = -1;
	}

	void setValue() {

	}

	void alive() {
		setValue();
	}

	int getValue() {
		return value * index;
	}

	int getIndex() {
		return index;
	}

	void BecomeQueen() {

	}

	void setIndex(int i) {
		this.index = i;
	}

	void setP(int m, int n) {
		this.P.x = m;
		this.P.y = n;
	}

	Location getP() {
		return P;
	}

	void updatePnew(int x1, int y1) {
		Location New = new Location();
		New.x = x1;
		New.y = y1;
		Pnew.push(New);
	}

	void resetPnew() {
		while (!Pnew.empty()) {
			Pnew.pop();
		}
	}

	void PositiveMove(int[][] Board) {

	}

	Stack<Location> ValidMove(int[][] Board) {
		resetPnew();
		PositiveMove(Board);
		return Pnew;
	}
}

class Location {
	int x, y;

	Location() {

	}

	Location(int x1, int y1) {
		x = x1;
		y = y1;
	}
}

class Pos {
	int x, y, value;
}

class Undo {
	int i;
	int PorC;
	Location begin = new Location();
	Location end = new Location();
	boolean checkQueen = false;
}