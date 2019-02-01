package main.java.Game;

public class ModeJeu {

    /**
     *
     * Afficher le mode de jeu choisi par le joueur.
     */

    public void displayAvailableMode() {
        System.out.println("Choissez votre mode jeu");
        System.out.println("CHALLENGER");
        System.out.println("DEFENSEUR");
        System.out.println("DUEL");
        System.out.println();
    }

    /**
     * Afficher le mode de jeu.
     * @param ModJeu .
     */

    public void displaySeletedMode(int ModJeu) {
        System.out.print("Vous avez choisi le mode " + ModJeu);
        System.out.println();

    }


}
