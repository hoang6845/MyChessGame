package Model;

public class Queen extends Chess {
	public Queen(Queen other) {
        super(other);
        // Sao chép các thuộc tính đặc biệt của Queen
    }
	Queen(){
		
	}
	
	@Override
	void setValue() {
		this.value = 90;
	}
	@Override
	void PositiveMove(int[][] Board) {
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

//	public static void main(String ar[]) {
//		Chess p = new Queen();
//		p.setP(1, 2);
//		p.setValue();
//		p.setIndex(-1);
//		p.PositiveMove();
//		while (!p.Pnew.isEmpty()) {
//			Location t = p.Pnew.pop();
//			System.out.print(t.x + ", " + t.y + "\n");
//		}
//	}
}
