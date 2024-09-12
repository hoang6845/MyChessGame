package Model;

import java.util.Stack;

public class Bishop extends Chess {
	public Bishop(Bishop other) {
        super(other);
        // Sao chép các thuộc tính đặc biệt của Bishop
    }
	
	Bishop(){
		
	}
	
	@Override
	void setValue() {
		this.value = 35;
	}

	@Override
	void PositiveMove(int[][] Board) {
		int k = this.getIndex();
		for (int i = P.x + 1, j = P.y + 1; (i < 8 && j < 8); i++, j++) {

			if (Board[i][j] != 0) {
				if (Board[i][j] * k < 0)
					this.updatePnew(i, j);
				break;
			}
			this.updatePnew(i, j);
		}
		for (int i = P.x + 1, j = P.y - 1; (i < 8 && j >= 0); i++, j--) {

			if (Board[i][j] != 0) {
				if (Board[i][j] * k < 0)
					this.updatePnew(i, j);
				break;
			}
			this.updatePnew(i, j);
		}
		for (int i = P.x - 1, j = P.y - 1; (i >= 0 && j >= 0); i--, j--) {

			if (Board[i][j] != 0) {
				if (Board[i][j] * k < 0)
					this.updatePnew(i, j);
				break;
			}
			this.updatePnew(i, j);
		}
		for (int i = P.x - 1, j = P.y + 1; (i >= 0 && j < 8); i--, j++) {

			if (Board[i][j] != 0) {
				if (Board[i][j] * k < 0)
					this.updatePnew(i, j);
				break;
			}
			this.updatePnew(i, j);
		}
	}

//	public static void main(String ar[]) {
//		Chess p = new Bishop();
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
