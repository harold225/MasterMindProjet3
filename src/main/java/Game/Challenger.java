package main.java.Game;


import java.util.Random;
import java.util.Scanner;
public class Challenger {

    public void combinaison ()  {


        /**
         * Génération de combinaison secrete par l'ordinateur
         *
         *
         */

        Random rand = new Random();
        int max = 9999;
        int min = 1000;
        int nombreAleatoire = rand.nextInt(max - min + 1) + min;
        System.out.println("Combinaison" + nombreAleatoire);
        System.out.println("Proposer votre combinaison");

        /**
         *
         *
         */

        Scanner sc = new Scanner(System.in);
        int comb = sc.nextInt();

        String nombre = String.valueOf(nombreAleatoire);
        String combin = String.valueOf(comb);
        String status = "";


        for (int j = 0; j < 4; j++) {

         //   System.out.println("j = " + nombre.charAt(j));

          //  nombre.charAt(j);

            int a = Character.getNumericValue(nombre.charAt(j));

            int b = Character.getNumericValue(combin.charAt(j));

            if (a < b) {
                status = status + "+";
            }

            if (a > b) {
                status = status + "-";
            }

            if (a == b) {
                status = status + "=";
            }



            if (nombre.charAt(j) == combin.charAt(j) ) {
                System.out.println();


            }


        }

        System.out.println("Proposition :" + combin + " -> reponse : " + status);


      /*  for (int i = 0; i < 3; i++) {

            Scanner sc = new Scanner(System.in);
            int comb = sc.nextInt();

            if (nombreAleatoire < comb) {

                System.out.println("c'est plus petit");

            }

            if (nombreAleatoire > comb) {

                System.out.println("c'est plus grand");

            }

            if (nombreAleatoire == comb) {

                System.out.println("Vous avez trouvez la combinaison");

            }

        }

        */
    }

}