package Java.Advanced.Localization;

import java.util.*;

public class LangLocalEx1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. German");
        System.out.println("4. French");
        System.out.println("5. Chinese");
        System.out.println("6. Russian");
        System.out.println("7. Hindi");

        System.out.println("Enter language choice number: ");
        int choice = scn.nextInt();
        greetings(choice);
        
    }

    static void greetings(int choice) {

        switch (choice) {
            case 1:
                getMessage("en");
                break;
            case 2:
                getMessage("es");
                break;
            case 3:
                getMessage("de");
                break;
            case 4:
                getMessage("fr");
                break;
            case 5:
                getMessage("zh");
                break;
            case 6:
                getMessage("ru");
                break;
            case 7:
                getMessage("hi");  
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    static void getMessage(String langCode) {
        ResourceBundle resBundle = ResourceBundle.getBundle("Java.Advanced.Localization.messages", new Locale(langCode));
	    System.out.println(resBundle.getString("wish"));
    }
}