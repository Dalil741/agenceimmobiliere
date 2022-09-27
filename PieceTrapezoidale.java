public class PieceTrapezoidale extends Piece {
    
    private int b1, b2;
    private double length;

    public PieceTrapezoidale(TypePiece typepiece, String niveau, int b1, int b2, double length) {
        super(typepiece, niveau);
        this.b1 = b1;
        this.b2 = b2;
        this.length = length;
        
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
         return ((b1 + b2) / 2) * length;
    }

}
