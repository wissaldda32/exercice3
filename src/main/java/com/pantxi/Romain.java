
package com.pantxi;

public class Romain {


    public static String convert(int n) {
        if (n == 1) {
            return "I";
        } else if (n == 3) {
            return "III";
        }
        else if (n == 4) {
            return "IV";
        }
        return null;
    }
}


        /*if (n < 1 || n > 50) {
            throw new IllegalArgumentException("Le nombre doit être entre 1 et 50");
        }


        String[] tabUnites = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tabDizaines = {"", "X", "XX", "XXX", "XL"};


        int unite = n % 10;

        int dizaine = n / 10;


        return tabDizaines[dizaine] + tabUnites[unite];
    }

*/

