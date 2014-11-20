
import java.util.ArrayList;

public class Carrefour {
    public Carrefour(ArrayList<Voie> carf, String nomcarrefour) {
        super();
        this.carf = carf;
        this.nomcarrefour = nomcarrefour;
    }
    private ArrayList<Voie> carf;
    private String nomcarrefour;
    public ArrayList<Voie> getCarf() {
        return carf;
    }
    public void setCarf(ArrayList<Voie> carf) {
        this.carf = carf;
    }
    public String getNomcarrefour() {
        return nomcarrefour;
    }
    public void setNomcarrefour(String nomcarrefour) {
        this.nomcarrefour = nomcarrefour;
    }

}
