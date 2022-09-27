public class PieceTriangulaire extends Piece {
    
    private double base;
    private double length;

    public PieceTriangulaire(TypePiece typepiece, String niveau, double base, double length) {
        super(typepiece, niveau);
        this.base = base;
        this.length = length;
    }

    public double surface() {
        return base * length * 0.5;
    }
}
