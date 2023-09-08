package jour1.Job02;

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
    public void Accelerer () {
        vitesse += 10;
        System.out.println("la vitesse est maintenant de " + vitesse + "km/h");

    }

    public void Freiner (int decrement) {
        if (vitesse - decrement >= 0){
            vitesse -= decrement;
            System.out.println("La voiture s'arrete. Vitesse reinitialisée à " + vitesse + "km/h");
        }
    }

    public static void main(String[] args) {
        VoitureTest maVoiture = new VoitureTest("Rouge", "Toyota", 50);
        maVoiture.Demarrer();
        maVoiture.Accelerer();
        maVoiture.Accelerer();
        maVoiture.Freiner(maVoiture.vitesse);
    }
}

