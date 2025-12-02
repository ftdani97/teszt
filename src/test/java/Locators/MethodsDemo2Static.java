package Locators;// public static void getData() --> static moves your method to class level
// akkor használjuk a staticot ha a method a saját classában szerepel

public class MethodsDemo2Static {

    public static void main(String[] args) {

        MethodsDemo d = new MethodsDemo();  // így hozunk létre objectet a classhoz
        String name = getUserData(); //ilyenkor nem kell a d. mert static lent a method
        System.out.println(name);
        getUserData2(); //nincs szükség objectre ha static
    }

    public static String getUserData() {
        System.out.println("Hello World");
        return "Dani";
    }
    public static String getUserData2() {
        System.out.println("Hello World");
        return "static";
    }
}

