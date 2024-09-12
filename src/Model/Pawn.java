package Model;

public class Pawn extends Chess {
	public Pawn(Pawn other) {
        super(other);
        // Sao chép các thuộc tính đặc biệt của Pawn
    }
	Pawn(){
		
	}
	
	@Override
	void setValue() {
		this.value = (this.isQueen == 1) ? 90 : 10;
	}
	@Override
	void BecomeQueen() {
		this.isQueen = 1;
		this.value = 90;
	}
	@Override
	void PositiveMove(int[][] Board) {
		if (this.value == 10) {
			int k = -1 * this.getIndex();
			if ((P.y - k >= 0) && (P.y - k < 8) && (Board[P.x][P.y - k] == 0))
				this.updatePnew(P.x, P.y - k);
			if ((P.y == 1 || P.y == 6) && (P.y - 2 * k >= 0) && (P.y - 2 * k < 8) && (Board[P.x][P.y - 2 * k] == 0)
					&& (Board[P.x][P.y - k] == 0))
				this.updatePnew(P.x, P.y - 2 * k);
			if ((P.y - k >= 0) && (P.y - k < 8) && (P.x + 1 < 8) && (this.getIndex() * Board[P.x + 1][P.y - k] < 0))
				this.updatePnew(P.x + 1, P.y - k);
			if ((P.y - k >= 0) && (P.y - k < 8) && (P.x - 1 >= 0) && (this.getIndex() * Board[P.x - 1][P.y - k] < 0))
				this.updatePnew(P.x - 1, P.y - k);
		}
		if (this.value == 90) {
			int k = this.getIndex();
			for (int i = P.x + 1; i < 8; i++) {
				if (Board[i][P.y] != 0) {
					if (Board[i][P.y] * k < 0)
						this.updatePnew(i, P.y);
					break;
				}
				this.updatePnew(i, P.y);
			}
			for (int i = P.x - 1; i >= 0; i--) {
				if (Board[i][P.y] != 0) {
					if (Board[i][P.y] * k < 0)
						this.updatePnew(i, P.y);
					break;
				}
				this.updatePnew(i, P.y);
			}
			for (int i = P.y + 1; i < 8; i++) {
				if (Board[P.x][i] != 0) {
					if (Board[P.x][i] * k < 0)
						this.updatePnew(P.x, i);
					break;
				}
				this.updatePnew(P.x, i);
			}
			for (int i = P.y - 1; i >= 0; i--) {
				if (Board[P.x][i] != 0) {
					if (Board[P.x][i] * k < 0)
						this.updatePnew(P.x, i);
					break;
				}
				this.updatePnew(P.x, i);
			}
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
	}
//	public static void main(String ar[]) {
//		Chess p = new Pawn();
//		p.setP(1, 1);
//		p.setValue();
//		p.setIndex(1);
//		p.PositiveMove();
//		while (!p.Pnew.isEmpty()) {
//			Location t=p.Pnew.pop();
//			System.out.print(t.x+", "+t.y);
//		}
//	}
}
