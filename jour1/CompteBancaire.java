package jour1;

public class CompteBancaire {
    double solde = 100;

    double soldeMaj;


    public void Depot(double dpo) {

        soldeMaj = solde + dpo;
        System.out.println(dpo + "€"  + " déposés");
        solde = soldeMaj;
        AfficherSolde();

    }

    public void Retrait(double rtr) {
        soldeMaj = solde - rtr;
        if (soldeMaj <= 0.0){
            System.out.println("Tentatives de retrait de " + rtr + "€" + "... Opération échoué, solde insuffisant");
        } else {
            soldeMaj = solde - rtr;
            System.out.println(rtr + "€" + " retirés. ");
            solde = soldeMaj;
            AfficherSolde();
        }

    }

    public void AfficherSolde(){
        System.out.println("Solde compte : " + solde + "€");
    }

    public static void main(String[] args) {
        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.AfficherSolde();
        compteBancaire.Depot(150.0);
        compteBancaire.Retrait(180);
        compteBancaire.Retrait(70.0);

    }
}
