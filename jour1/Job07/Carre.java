package jour1.Job07;

public class Carre {
    double cote;

    public Carre(double cote){
        this.cote = cote;
    }

    public void CalculAireCarre(){
        double AireCarre = cote * cote;
        System.out.println("Aire du carré de coté " + cote + ": " + AireCarre);

    }
}
