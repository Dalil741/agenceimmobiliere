public class PieceCirculaire extends Piece {
    
    static double PI = Math.PI;
    private double rayon;

    public PieceCirculaire(TypePiece typepiece, String niveau, double rayon, double PI) {
        super(typepiece, niveau);
        this.rayon = rayon;
        PieceCirculaire.PI = PI;
    }


    @Override
        // TODO Auto-generated method stub
        public final double surface() {
             return PI * rayon * rayon; 
            }

    
    }

