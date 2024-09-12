package Model;

import java.util.Stack;

public class King extends Chess {
	public King(King other) {
        super(other);
        // Sao chép các thuộc tính đặc biệt của King
    }
	
	King(){
		
	}
	
	@Override
	void setValue() {
		this.value = 1000;
	}
	@Override
	void PositiveMove(int[][] Board) {
		int k = this.getIndex();
		if ((P.x + 1 < 8) && (Board[P.x + 1][P.y] * k <= 0))
			this.updatePnew(P.x + 1, P.y);
		if ((P.x + 1 < 8) && (P.y + 1 < 8) && (Board[P.x + 1][P.y + 1] * k <= 0))
			this.updatePnew(P.x + 1, P.y + 1);
		if ((P.x + 1 < 8) && (P.y - 1 >= 0) && (Board[P.x + 1][P.y - 1] * k <= 0))
			this.updatePnew(P.x + 1, P.y - 1);
		if ((P.x - 1 >= 0) && (Board[P.x - 1][P.y] * k <= 0))
			this.updatePnew(P.x - 1, P.y);
		if ((P.x - 1 >= 0) && (P.y + 1 < 8) && (Board[P.x - 1][P.y + 1] * k <= 0))
			this.updatePnew(P.x - 1, P.y + 1);
		if ((P.x - 1 >= 0) && (P.y - 1 >= 0) && (Board[P.x - 1][P.y - 1] * k <= 0))
			this.updatePnew(P.x - 1, P.y - 1);
		if ((P.y + 1 < 8) && (Board[P.x][P.y + 1] * k <= 0))
			this.updatePnew(P.x, P.y + 1);
		if ((P.y - 1 >= 0) && (Board[P.x][P.y - 1] * k <= 0))
			this.updatePnew(P.x, P.y - 1);
	}

//	public static void main(String ar[]) {
//		Chess p = new King();
//		p.setP(1, 2);
//		p.setValue();
//		p.setIndex(1);
//		p.PositiveMove();
//		while (!p.Pnew.isEmpty()) {
//			Location t = p.Pnew.pop();
//			System.out.print(t.x + ", " + t.y + " ; ");
//		}
//		System.out.print("\n");
//		Stack<Location> t = p.ValidMove();
//		while (!t.isEmpty()) {
//			Location k = t.pop();
//			System.out.print(k.x + ", " + k.y + " ; ");
//		}
//	}
}
