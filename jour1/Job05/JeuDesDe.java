package jour1.Job05;

import java.util.Random;

public class JeuDesDe {
    public static void main(String[] args) {
        Random random = new Random();
        int PremierDe = random.nextInt(7);
        int DeuxiemeDe = random.nextInt(7);
        int SommeDesDe = PremierDe + DeuxiemeDe;
        System.out.println("Dé 1 : " + PremierDe);
        System.out.println("Dé 2 : " +DeuxiemeDe);
        System.out.println("Somme : " + SommeDesDe);


    }


}
