package Locators;/* METHODS - if you have any set of lines of code that you would like to re-use every time
       you can wrap these lines in one block - and for that block you can give one name
       Whenever you want to use these lines of codes, you can call them by that blocks name
       and automatically all lines of code will be executed. Szóval ha van egy kódsor, amit többször
       is felhasználnál, akkor methodba rakod*/

//public - más classok is meghívhatják
//void - ha nem ad vissza semmilyen értéket, akkor void (int ha integert, String ha stringet)
    /*ha szeretnél hozzáférni egy class methodjaihoz, akkor annak a classnak egy objectét kell,
        hogy létrehozd */

public class MethodsDemo {
    public static void main(String[] args){
        //bármi amit ebbe a részbe írsz, le fog futni automatikusan!

        MethodsDemo d = new MethodsDemo();  // így hozunk létre objectet a classhoz
        String name = d.getData(); //így pedig elérhetővé válnak a class methodok
        System.out.println(name);
    }

    public String getData (){
        System.out.println("Hello World");
        return "Dani";
    }





}
