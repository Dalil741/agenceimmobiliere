public abstract class Piece {
    
    private TypePiece typepiece;
    private String niveau;

    public Piece(TypePiece typepiece, String niveau) {
        this.typepiece = typepiece;
        this.niveau = niveau;
    }

    public String getNiveau(){
        return niveau;
    }
  
    public abstract double surface();

    public String toString() {
        return typepiece.toString() + " surface " + surface() + " m2 ";
    }
}
