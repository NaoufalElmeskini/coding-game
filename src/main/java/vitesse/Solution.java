package vitesse;

import java.util.*;
import java.io.*;
import java.math.*;

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
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int speedLimit = in.nextInt();
        int lightCount = in.nextInt();
        int speedMax = 0;

        System.err.println("speedLimit: " + speedLimit);
        System.err.println("lightCount: " + lightCount);

        for (int i = 0; i < lightCount; i++) {
            int distance = in.nextInt();
            int duration = in.nextInt();

            System.err.println("distance: " + distance);
            System.err.println("duration: " + duration);

            float distanceToLightInKm = ((float) distance)/1000;
            float durationInH = ((float) duration)/60;

            System.err.println("distanceToLightInKm: " + distanceToLightInKm);
            System.err.println("durationInH: " + durationInH);

            final float REFERENCE_SPEED = distanceToLightInKm / durationInH;
            System.err.println("REFERENCE_SPEED" + REFERENCE_SPEED);

            int k = 0;
            int speedCandidatValue = 0;
            while (speedCandidatValue < speedLimit) {
                speedMax = speedCandidatValue;
                speedCandidatValue = (int) Math.floor(REFERENCE_SPEED * ((2 * k) + 1));
                System.err.println("speedCandidatValue: " + speedCandidatValue);
                k++;
            }

            float distanceMaxInDuration = speedMax * durationInH;
            System.err.println("distanceMaxInDuration: " + distanceMaxInDuration);
            if (distanceMaxInDuration > distanceToLightInKm) {
                break;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(speedMax);
    }

    private static int strictFloor(float floatValue) {
        int valueFloor = (int) Math.floor(floatValue);
        float diff = (float) (floatValue - valueFloor);
        if (diff == 0) { //if floatValue is equal to its floot value (aka floatValue is integer)
            return valueFloor - 1;
        }
        return valueFloor;
    }
}