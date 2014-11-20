import java.util.ArrayList;

public class Route {
    private Voie [] tabVoie = new Voie [2];
    private String nomRoute;

    public Route(Voie[] tabVoie, String nomRoute) {
        super();
        this.tabVoie = tabVoie;
        this.nomRoute = nomRoute;
    }

    public Voie[] getTabVoie() {
        return tabVoie;
    }
    public void setTabVoie(Voie[] tabVoie) {
        this.tabVoie = tabVoie;
    }
    public String getNomRoute() {
        return nomRoute;
    }
    public void setNomRoute(String nomRoute) {
        this.nomRoute = nomRoute;
    }


}
