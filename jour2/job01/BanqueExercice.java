package jour2.job01;
import jour1.Job04.CompteBancaire;

public class BanqueExercice extends CompteBancaire {
    double soldeCourant;
    double soldeEpargne;

    double tauxInteret;



    public BanqueExercice(double soldeCourant, double soldeEpargne, double tauxInteret){
        this.soldeCourant = soldeCourant;
        this.soldeEpargne = soldeEpargne;
        this.tauxInteret = tauxInteret;
        System.out.println("Solde du compte courant : " + soldeCourant + "€");
        System.out.println("Solde du compte Epargne : " + soldeEpargne + "€" + " avec un taux d'intérêt de " + tauxInteret + "%");



    }

    public void calculInteret(){
        double interetsAjouter = (soldeEpargne * tauxInteret) / 100;
        double nouveauSolde = soldeEpargne + interetsAjouter;
        System.out.print("Intérêts ajoutés: " + interetsAjouter + " Nouveau solde : " + " " + nouveauSolde);


    }


    public static void main(String[] args) {
        BanqueExercice be = new BanqueExercice(100, 200, 2);
        be.calculInteret();
    }


}
