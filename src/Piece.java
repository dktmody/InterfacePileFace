public class Piece implements IPiece {
    private String piece;
    public Piece() {
        this.piece = (Math.random() <= 0.2) ? "pile": "face";
    }
    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    @Override
    public boolean aFacePourCoteVisite() {
        return false;
    }

    @Override
    public boolean aPilePourCoteVisite() {
        return false;
    }
}
