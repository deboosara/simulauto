import java.util.ArrayList;

public class Voie {
    private ArrayList<Position> voie;
    private String nomVoie;


    public Voie(ArrayList<Position> voie, String nomVoie) {
        super();
        this.voie = voie;
        this.nomVoie = nomVoie;
    }

    public ArrayList<Position> getVoie() {
        return voie;
    }
    public void setVoie(ArrayList<Position> voie) {
        this.voie = voie;
    }
    public String getNomVoie() {
        return nomVoie;
    }
    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }


}
