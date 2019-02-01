package main.java;

import main.java.Game.Challenger;
import main.java.Game.ChoixJeu;
import main.java.Game.ModeJeu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChoixJeu choixJeu = new ChoixJeu();
        choixJeu.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        choixJeu.displaySelectedMenu(nb);

        ModeJeu modeJeu = new ModeJeu();
        modeJeu.displayAvailableMode();
        int md = sc.nextInt();
        modeJeu.displaySeletedMode(md);


        Challenger challenger = new Challenger();
        challenger.combinaison();





            }



    }

