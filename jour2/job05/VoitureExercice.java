package jour2.job05;




public class VoitureExercice {
        int vitesse = 0;


        public VoitureExercice (int vitesse) {

            this.vitesse = vitesse;
        }

        public void Demarrer() {
            try {
                if (vitesse > 110){
                    throw new VitesseLimiteDepasseeException();
                }
                System.out.println("La voiture demarre");
            } catch (VitesseLimiteDepasseeException v) {
                System.out.println(v.getMessage());
            };
        }
        public void Accelerer () throws VitesseLimiteDepasseeException {

            try {
                if (vitesse > 100){
                    throw new VitesseLimiteDepasseeException();
                }
                 vitesse  += 10 ;
                System.out.println("la vitesse est de : " + vitesse);
            } catch (VitesseLimiteDepasseeException v) {
                System.out.println(v.getMessage());
            }




        }


        public void Freiner (int decrement) {
            if (vitesse - decrement >= 0){
                vitesse -= decrement;
                System.out.println("La voiture s'arrete. Vitesse reinitialisée à " + vitesse + "km/h");
            }
        }

        public static void main(String[] args) throws VitesseLimiteDepasseeException {
            VoitureExercice maVoiture = new VoitureExercice(110);

            maVoiture.Accelerer();
        }
    }

