public class Voiture {
    Position post;
    boolean etat ;
    public void rouler(){
        while(post.x<100){
            post.suivant();
            etat = true;
        };

    }
    public void arret(){
        etat=false;

    }
    public void etatVoiture(){
        if(etat== true){
            System.out.println("la voiture roule");
        }else{System.out.println("la voiture est en arret");}
    }

}
