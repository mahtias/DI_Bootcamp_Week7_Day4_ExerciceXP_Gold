/**
 * @author N'ZO LAGOU
 * Exercice 2 : Choisissez Un Nombre Au Hasard
Instructions
Écrivez une méthode qui retourne un entier aléatoire 
entre deux nombres possibles.

La signature est :

public static int random(int a, int b) {
// return a or b, randomly
}


En utilisant la méthode, demandez à l'utilisateur
 deux nombres entiers et imprimez un des deux au hasard.


 */

package exercice2;

import java.util.Random;

public class PickRandomFromNumber {
    public static int random(int a, int b) {
        //return new Random().nextInt(a, b + 1);
        return new Random().nextInt( b + 1);
    }
}
