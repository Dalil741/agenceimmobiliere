public class PieceQuadrilatere extends Piece {
    
    private int b1, b2;
    private double length;
    
    public PieceQuadrilatere(TypePiece typepiece, String niveau, int b1, int b2, double length) {
        super(typepiece, niveau);
        this.b1 = b1;
        this.b2 = b2;
        this.length = length;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        return (b1 + b2) * length * 0.5;
    }
    
}