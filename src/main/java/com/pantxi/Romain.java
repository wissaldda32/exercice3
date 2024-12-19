
package com.pantxi;

public class Romain {


    public static String convert(int n) {
      /*  if (n == 1) {
            return "I";
        } else if (n == 3) {
            return "III";
        } else if (n == 4) {
            return "IV";
        } else if (n == 10) {
            return "X";
        } else if (n == 11) {
            return "XI";
        }
         else if(n==20){
             return "XX";
        }

        return null;
    }
}
/*
    switch(n/10){
       case 1: return "x";
        case 2: return "XX";
        case 3:return "XXX";
        case 4:return "XL";
        case 5:return "L";


  /*

    }

    {
        return
    }

    }
*/

        if (n < 1 || n > 50) {
            throw new IllegalArgumentException("Le nombre doit être entre 1 et 50");
        }


        String[] tabUnites = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tabDizaines = {"", "X", "XX", "XXX", "XL"};


        int unite = n % 10;

        int dizaine = n / 10;


        return tabDizaines[dizaine] + tabUnites[unite];
    }
}



