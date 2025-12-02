package basicJava;

public class Strings {

    public static void main (String[] args){
//STRING típusok
        //string is an object that represents sequences of characters
        //létrehozunk egy objecktumot (a), amin belül tároljuk a "kanál" értéket.
        //két módja van a String meghatározásának

        String SZOVEG5 = "kanál";
        //--> literal (ha több változó ugyanazt az értéket tartalmazza
        // akkor csak egy objectet hoz létre, az elsőt)

        String SZOVEG2 = new String("villa");
        String SZOVEG3 = new String("villa");
        // using new allocate operator.
        // Minden esetben új objectet hoz létre

//STRING tördelése
        //SZOVEG.split(" "); --> ahol space van ott tördel
        // String[] splittedString --> egy arrayt hoz belőle létre, 3 elemmel
        String SZOVEG = "Fejel Tóth Dániel";
        String[] splittedString = SZOVEG.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        System.out.println(splittedString[2]);
    //VAGY
        String TEXT = "Fejel Tóth Dániel";
        String[] splittedString1 = TEXT.split("Tóth");
        System.out.println(splittedString1[0]);
        System.out.println(splittedString1[1]);
        System.out.println(splittedString1[1].trim()); // --> így megszabadulunk a space-től a szó előtt a consolban

    //ha a TEXT string összes karakterét akarjuk kiíratni egyesével
        for (int i = 0; i<TEXT.length();i++) {
            System.out.println(TEXT.charAt(i));
        }

    /* Ha az utolsó karaktertől kezdve akarjuk kiíratni;Ez a ciklus visszafelé járja be a
        TEXT nevű szöveget, és karakterenként kiírja. a szöveg karaktereit indexek alapján érjük el,
         és ezek az indexek 0-tól indulnak, nem 1-től. 17 karakter a TEXT, de az indexe 16 ezért -1 */

        for (int i = TEXT.length()-1; i>=0; i--){
            System.out.println(TEXT.charAt(i));
        }

    }


}
