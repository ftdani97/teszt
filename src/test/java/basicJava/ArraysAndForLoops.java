package basicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndForLoops {
    public static void main(String[] args) {
        int myNumber = 5;
        String myText = "Fasz kivan";
        char myLetter = 'l';
        double myDecimalNumber = 5.5;
        boolean whatISayIsTrue = true;
        // System.out.println(myLetter + " is a great letter");

// ARRAY - ha egy adattípusból többet akarunk tárolni

      //1. verzió:
        int[] myCar = {1, 2, 3, 4, 5, 6, 7};

      //2. verzió
       String[] myNum = new String[4];
       myNum[0] = "Yugo";
       myNum[1] = "Opel";
       myNum[2] = "Volvo";
       myNum[3] = "VW";
        // System.out.println(myCar [0]);

        for (int i = 0; i < myCar.length; i++) {
            System.out.println(myCar[i]);
        }

        String[] name = {"Maria", "Daniel", "Tamas", "Kitti"};

        for (int a = 1; a < name.length; a++) {
            System.out.println(name[a]);
        }

        // int[] myNum = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};

        /*   for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] % 2 == 0) {
                System.out.println(myNum[i]);
            } else {
                System.out.println(myNum[i] + "not great");
            }
            */


/* ARRAY LIST
        <String> ezzel mondjuk meg neki, hogy csak String értékeket tárolhat.
        csevap.ADD: Az add metódussal bővítjuk a listát, itt nem statikusan az elején adjuk meg az értékeket,
                    hanem dinamikusan bővítjük az add metódussal.
        csevap.REMOVE: eltávolítod az objectet
        csevap.GET(index): ezzel hívod meg az értéket, amit meghatároztál az arraylistben. csevap.get(2)
            FONTOS, itt nem [], hanem () megy!
        System.out.println() --> ide kell meghívni, tehát itt a zárójelbe a csevap.get (index) megy.

        csevap.contains() - ha tudni akarjuk, hogy az array tartalmazza-e a keresett értéket
        List<String> myCarArrayList = Arrays.asList (myCar); - a hagyományos arrayt átkonvertálhatjuk dinamikusba
             */

        ArrayList<String> csevap = new ArrayList<>();
        csevap.add("pjeskavica");
        csevap.add("tsevap");
        csevap.add("cseevap");

        System.out.println(csevap.get(0));

/* FOR LOOP - ismétlődő műveletek végrehajtására használunk.
              Akkor célszerű, ha pontosan tudjuk, hányszor szeretnénk lefuttatni az utasításokat.
              Alább egy array list kerül a for loopba. */

        for (int i = 0; i < csevap.size(); i++) {
            System.out.println(csevap.get(i));
        }
        System.out.println("********");

/* FOR-EACH LOOP: egy egyszerűsített formája a for ciklusnak.
                  Nem kell indexet (i) kezelned és egyszerűen végigmegy minden elemen sorban.
                  FONTOS: itt nem kell a .get metódus
                  Vegyél ki egyesével minden elemet a csevap gyűjteményből,
                  és ideiglenesen nevezd el a-nak, hogy tudj vele dolgozni a cikluson belül.
                  */

        for (String a : csevap) {
            System.out.println(a);
        }
        //Tartalmazza-e az arraylist az adott itemet
        System.out.println(csevap.contains("tsevap"));

        //hagyományos array-t array listé alakítunk, és megkérdezzük, hogy megtalálható-e benne az érték
        List<String> nameArrayList = new ArrayList<>(Arrays.asList(name));
        nameArrayList.add("Jeno");
        System.out.println(nameArrayList.contains("Jeno"));

    }
    }





