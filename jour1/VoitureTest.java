package jour1;

public class VoitureTest {
    int vitesse = 0;
    String marque;
    String couleur;

    public VoitureTest (String couleur, String marque, int vitesse) {
        this.couleur = couleur;
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void Demarrer() {
        System.out.println("La voiture demarre");
    }
    public void Accelerer (int increment) {
        vitesse += increment;
        System.out.println("la voiture roule maintenant a " + vitesse + "km/h");

    }

    public void Freiner (int decrement) {
        if (vitesse - decrement >= 0){
            vitesse -= decrement;
            System.out.println("La voiture s'arrete. Vitesse reinitialisé a " + vitesse + "km/h");
        }
    }

    public static void main(String[] args) {
        VoitureTest maVoiture = new VoitureTest("Rouge", "Toyota", 0);
        maVoiture.Demarrer();
        maVoiture.Accelerer(10);
        maVoiture.Accelerer(10);
        maVoiture.Freiner(maVoiture.vitesse);
    }
}

