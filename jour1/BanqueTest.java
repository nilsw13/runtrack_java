package jour1;

public class BanqueTest {
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
        BanqueTest banqueTest = new BanqueTest();
        banqueTest.AfficherSolde();
        banqueTest.Depot(150.0);
        banqueTest.Retrait(180);
        banqueTest.Retrait(70.0);

    }
}
