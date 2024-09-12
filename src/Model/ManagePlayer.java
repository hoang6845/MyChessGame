package Model;

import java.util.Stack;

public class ManagePlayer {
	Chess Player[] = new Chess[16];
	Chess Computer[] = new Chess[16];
	int MoveOderCurent; // quan di may se chon hien tai;chi so i trong Pos.
	Location MoveOderNext;// buoc di tiep theo cua may

	void begin() {
		Player[0] = new Pawn();
		Player[1] = new Pawn();
		Player[2] = new Pawn();
		Player[3] = new Pawn();
		Player[4] = new Pawn();
		Player[5] = new Pawn();
		Player[6] = new Pawn();
		Player[7] = new Pawn();

		// Castle cua nguoi
		Player[8] = new Castle();
		Player[9] = new Castle();

		// Knight cua nguoi
		Player[10] = new Knight();
		Player[11] = new Knight();

		// Bishop cua nguoi
		Player[12] = new Bishop();
		Player[13] = new Bishop();

		// Queen cua nguoi
		Player[14] = new Queen();

		// King cua nguoi
		Player[15] = new King();
		for (int i = 0; i < 8; i++) {
			Player[i].setP(i, 6);
			Player[i].setIndex(-1);
			Player[i].setValue();
		}
		Player[8].setP(0, 7);
		Player[8].setIndex(-1);
		Player[8].setValue();
		Player[9].setP(7, 7);
		Player[9].setIndex(-1);
		Player[9].setValue();
		Player[10].setP(1, 7);
		Player[10].setIndex(-1);
		Player[10].setValue();
		Player[11].setP(6, 7);
		Player[11].setIndex(-1);
		Player[11].setValue();
		Player[12].setP(2, 7);
		Player[12].setIndex(-1);
		Player[12].setValue();
		Player[13].setP(5, 7);
		Player[13].setIndex(-1);
		Player[13].setValue();
		Player[14].setP(3, 7);
		Player[14].setIndex(-1);
		Player[14].setValue();
		Player[15].setP(4, 7);
		Player[15].setIndex(-1);
		Player[15].setValue();

		// tot cua may
		Computer[0] = new Pawn();
		Computer[1] = new Pawn();
		Computer[2] = new Pawn();
		Computer[3] = new Pawn();
		Computer[4] = new Pawn();
		Computer[5] = new Pawn();
		Computer[6] = new Pawn();
		Computer[7] = new Pawn();

		// xe cua may
		Computer[8] = new Castle();
		Computer[9] = new Castle();

		// ma cua may
		Computer[10] = new Knight();
		Computer[11] = new Knight();

		// tuong cua may
		Computer[12] = new Bishop();
		Computer[13] = new Bishop();

		// Hau cua may

		Computer[14] = new Queen();

		// vua cua may
		Computer[15] = new King();
		for (int i = 0; i < 8; i++) {
			Computer[i].setP(i, 1);
			Computer[i].setIndex(1);
			Computer[i].setValue();
		}
		Computer[8].setP(0, 0);
		Computer[8].setIndex(1);
		Computer[8].setValue();
		Computer[9].setP(7, 0);
		Computer[9].setIndex(1);
		Computer[9].setValue();
		Computer[10].setP(1, 0);
		Computer[10].setIndex(1);
		Computer[10].setValue();
		Computer[11].setP(6, 0);
		Computer[11].setIndex(1);
		Computer[11].setValue();
		Computer[12].setP(2, 0);
		Computer[12].setIndex(1);
		Computer[12].setValue();
		Computer[13].setP(5, 0);
		Computer[13].setIndex(1);
		Computer[13].setValue();
		Computer[14].setP(3, 0);
		Computer[14].setIndex(1);
		Computer[14].setValue();
		Computer[15].setP(4, 0);
		Computer[15].setIndex(1);
		Computer[15].setValue();
	}
//	public static void main(String ar[]) {
//		ManagePlayer play = new ManagePlayer();
//		play.begin();
//		play.Computer[10].PositiveMove();
//
//		while (!play.Computer[10].Pnew.isEmpty()) {
//			Location t = play.Computer[10].Pnew.pop();
//			System.out.print(t.x + ", " + t.y + " ; ");
//		}
//		System.out.print("\n");
//		System.out.println(play.Computer[10].getValue());
//		Stack<Location> t = play.Computer[10].ValidMove();
//		while (!t.isEmpty()) {
//			Location k = t.pop();
//			System.out.print(k.x + ", " + k.y + " ; ");
//		}
//	}
}
