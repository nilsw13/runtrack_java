package jour1.Job04;

public class CompteBancaire {
    double solde = 100;

    double soldeMaj;


    public void Depot(double dpo) {

        soldeMaj = solde + dpo;
        System.out.print(dpo + "€"  + " déposés.");
        solde = soldeMaj;
        System.out.print(" Nouveau Solde : " + solde + "€\n");

    }

    public void Retrait(double rtr) {
        soldeMaj = solde - rtr;
        if (soldeMaj <= 0.0){
            System.out.println("Tentatives de retrait de " + rtr + "€" + "... Solde insuffisant");
        } else {
            soldeMaj = solde - rtr;
            System.out.print(rtr + "€" + " retirés. ");
            solde = soldeMaj;
            System.out.print(" Nouveau Solde : " + solde + "€\n");
        }

    }

    public void AfficherSolde(){
        System.out.println("Solde actuel : " + solde + "€");
    }

    public static void main(String[] args) {
        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.AfficherSolde();
        compteBancaire.Depot(50);
        compteBancaire.Retrait(70);
        compteBancaire.Retrait(90);

    }
}
