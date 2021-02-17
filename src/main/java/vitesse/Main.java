package vitesse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/** @GOAL
 * Vous entrez sur une portion de route et vous comptez vous reposer entièrement sur votre régulateur de vitesse pour traverser la zone sans devoir vous arrêter ni ralentir.
 * L'objectif est de trouver la vitesse maximale (hors excès de vitesse) qui vous permettra de franchir tous les feux au vert.
 * Attention : Vous ne pouvez pas franchir un feu à la seconde où il passe au rouge !
 * Votre véhicule entre directement dans la zone à la vitesse programmée sur le régulateur et ce dernier veille à ce qu'elle ne change plus par la suite.
 */

/** @INPUT:
 * Ligne 1 : Un entier speed pour la vitesse maximale autorisée sur la portion de route (en km/h).
 *
 * Ligne 2 : Un entier lightCount pour le nombre de feu de circulation sur la route.
 *
 * lightCount prochaines lignes :
 * - Un entier distance représentant la distance du feu par rapport au point de départ (en mètre).
 * - Un entier duration représentant la durée du feu sur chaque couleur.
 *
 * Un feu alterne une période de duration secondes au vert puis duration secondes au rouge.
 * Tous les feux passent au vert en même temps dès votre entrée dans la zone.
 */

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int counter;

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        List<Integer> cubesLessThanN= new ArrayList<>();

        for (int i = 1; i < Math.cbrt(N); i++) {
            cubesLessThanN.add(i*i*i);
        }
        Integer[] cubesArray = (Integer[]) cubesLessThanN.toArray();

        for (int i = 0; i < cubesArray.length; i++) {
            int cube = cubesArray[i];

            int somme;

            for (int j = i+1; j < cubesArray.length; j++) {
                int cube2 = cubesArray[i+1];
                somme = cube + cube2;

                if (somme == N) {
                    counter ++;
                } else if (somme > N) {
                    continue;
                } else {

                }
            }





            int j = i;
            while ((j < cubesArray.length)
                    && (somme<N)) {
                somme =
            }
        }

        // 3 => 1,1,1 (1)
        // 9 => 1,8 (1)
        //

        System.out.println();
    }

    private void function(int N, Set<Integer> cubeSet) {
        for (int cube: cubeSet) {

        }
    }
}