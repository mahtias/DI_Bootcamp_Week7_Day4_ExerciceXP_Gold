/**
 * @author N'ZO LAGOU
 *  Choisissez Un Élément Aléatoire Dans Un Tableau
Instructions
Écrire une méthode qui renvoie un élément aléatoire d'un ArrayList.

La signature est :

public static String random(ArrayList<String> values) {
// return a random string from the ones contained in values
}


En utilisant la méthode, demandez à l'utilisateur 
certaines chaînes, puis imprimez-en une aléatoire.
 */

package exercice3;

import java.util.ArrayList;
import java.util.Random;

public class PickRandomFromArray {
    public static String random(ArrayList<String> values) {
        // return a random string from the ones contained in values
        //int randomIndex = new Random().nextInt(0, values.size());
        int randomIndex = new Random().nextInt(values.size());
        return values.get(randomIndex);
    }
}
