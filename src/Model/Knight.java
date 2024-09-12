package Model;

public class Knight extends Chess {
	public Knight(Knight other) {
        super(other);
        // Sao chép các thuộc tính đặc biệt của Knight
    }
	Knight(){
		
	}
	
	@Override
	void setValue() {
		this.value = 30;
	}
	@Override
	void PositiveMove(int[][] Board) {
		int k = this.getIndex();
		if ((P.x + 2 < 8) && (P.y + 1 < 8)
				&& (Board[P.x + 2][P.y + 1] == 0 || this.getIndex() * Board[P.x + 2][P.y + 1] < 0))
			this.updatePnew(P.x + 2, P.y + 1);
		if ((P.x + 1 < 8) && (P.y + 2 < 8)
				&& (Board[P.x + 1][P.y + 2] == 0 || this.getIndex() * Board[P.x + 1][P.y + 2] < 0))
			this.updatePnew(P.x + 1, P.y + 2);
		if ((P.x - 1 >= 0) && (P.y - 2 >= 0)
				&& (Board[P.x - 1][P.y - 2] == 0 || this.getIndex() * Board[P.x - 1][P.y - 2] < 0))
			this.updatePnew(P.x - 1, P.y - 2);
		if ((P.x - 2 >= 0) && (P.y - 1 >= 0)
				&& (Board[P.x - 2][P.y - 1] == 0 || this.getIndex() * Board[P.x - 2][P.y - 1] < 0))
			this.updatePnew(P.x - 2, P.y - 1);
		if ((P.x + 1 < 8) && (P.y - 2 >= 0)
				&& (Board[P.x + 1][P.y - 2] == 0 || this.getIndex() * Board[P.x + 1][P.y - 2] < 0))
			this.updatePnew(P.x + 1, P.y - 2);
		if ((P.x - 1 >= 0) && (P.y + 2 < 8)
				&& (Board[P.x - 1][P.y + 2] == 0 || this.getIndex() * Board[P.x - 1][P.y + 2] < 0))
			this.updatePnew(P.x - 1, P.y + 2);
		if ((P.x - 2 >= 0) && (P.y + 1 < 8)
				&& (Board[P.x - 2][P.y + 1] == 0 || this.getIndex() * Board[P.x - 2][P.y + 1] < 0))
			this.updatePnew(P.x - 2, P.y + 1);
		if ((P.x + 2 < 8) && (P.y - 1 >= 0)
				&& (Board[P.x + 2][P.y - 1] == 0 || this.getIndex() * Board[P.x + 2][P.y - 1] < 0))
			this.updatePnew(P.x + 2, P.y - 1);
	}
//	public static void main(String ar[]) {
//	Chess p = new Knight();
//	p.setP(1, 2);
//	p.setValue();
//	p.setIndex(-1);
//	p.PositiveMove();
//	while (!p.Pnew.isEmpty()) {
//		Location t=p.Pnew.pop();
//		System.out.print(t.x+", "+t.y+"\n");
//	}
//}
}
