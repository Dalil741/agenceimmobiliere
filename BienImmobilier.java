import java.util.ArrayList;

public abstract class BienImmobilier {
    
    private String rue;
    private String ville;
    private String codePostal;
    private Vendeur vendeur;
    private ArrayList<Piece> lesPieces;

    public BienImmobilier(String rue, String ville, String codePostal, Vendeur vendeur)

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }
    public String getCodePostal() {
        return codePostal;
    }
    /**
     * @return methode vendeur */
    public Vendeur getVendeur() {
        return vendeur;
    /**
     * @return
     */
    }

    
    public boolean surfaceHabitable() {
        if (TypePiece) {
            return = true;
        }
        else {
            return = false;
        }
    }

public static void main(AjouterPiece[] args) {
       Piece piece = new Piece();
       Piece.ajouterPiece();
    }



















    @Override
     public String toString() {
     DecimalFormat numberFormat = new DecimalFormat("#.00");
             return "\nLocalisation : " +rue +" & + codePostal+ " " + ville +
        "\n \n Description du bien : " + pieces.toString() +
     "\nPour une surface habitable de : " +
     numberFormat.format(surfaceHabitable())+
     " m2 et une surface non habitable de : " +
     numberFormat.format(surfaceNonHabitable())+" m2. ";
     }
}
