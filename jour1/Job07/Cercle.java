package jour1.Job07;

public class Cercle {
    double rayon;
    double pi = Math.PI;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    public void CalculAireCercle(){
        double AireCercle = pi *  Math.pow(rayon, 2);
        System.out.println("Aire du cercle de rayon " + rayon + ": " + AireCercle);

    }
}
