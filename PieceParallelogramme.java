public class PieceParallelogramme extends Piece {
    
    private double length;
    private double height;
    
    public PieceParallelogramme(TypePiece typepiece, String niveau, double length, double height) {
        super(typepiece, niveau);
        this.length = length;
        this.height = height;
    }

    @Override
    public double surface() {
        // TODO Auto-generated method stub
        double surface = length * height;
        return surface;
    }
}
