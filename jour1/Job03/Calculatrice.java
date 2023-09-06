package jour1.Calculatrice;
import java.util.Scanner;
public class Calculatrice {
    double chiffreA ;
    double chiffreB ;

    public void userNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le premier nombre : ");
        chiffreA = scanner.nextDouble();
        System.out.println("entrer le deuxieme nombre : ");
        chiffreB = scanner.nextDouble();



    }

    public void formules() {
        double addition = chiffreA + chiffreB;
        double soustraction = chiffreA - chiffreB;
        double produit = chiffreA * chiffreB;
        double division = chiffreA / chiffreB;
        System.out.println("Somme = " + addition);
        System.out.println("Différence = " + soustraction);
        System.out.println("Produit = " + produit);
        System.out.println("Division = " + division);
    }

    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
        calculatrice.userNumbers();
        calculatrice.formules();
    }
}
