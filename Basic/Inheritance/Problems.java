package Java.Basic.Inheritance;
public class Problems {
    public static void main(String[] args) {
        
        //1. Farm Problem
        System.out.println("\n\n1. Farm Problem");
        int totalLegs = animals(5,3,4);
        System.out.println(totalLegs);

        //2. Football Points
        System.out.println("\n\n2. Football Points");
        int teamPts = footballPoints(3,2,1);
        System.out.println(teamPts);

        //3. Emily Lover
        System.out.println("\n\n3. Emily Lover");
        greetings("Martha");
        greetings("Mubashir");

        //4. Negative Number
        System.out.println("\n\n4. Negative Number");
        int neg = returnNegative(10);
        System.out.println(neg);

        //5. Bartender
        System.out.println("\n\n5. Bartender");
        shouldServeDrinks(24, false);
        shouldServeDrinks(19, true);
        shouldServeDrinks(15, true);

        //6. Free Coffee
        System.out.println("\n\n6. Free Coffee");
        int cups = totalCups(38);
        System.out.println(cups);

        //7. Broken Bridge
        System.out.println("\n\n7. Broken Bridge");
        isSafeBridge("####");
        isSafeBridge("## ####");
        isSafeBridge("#");

        //8. Journey Home
        System.out.println("\n\n8. Journey Home");
        backToHome("NEWE");
        backToHome("NENESSWW");
        backToHome("NEESSW");

        //9. Lowercase Uppercase Swap
        System.out.println("\n\n9. Lowercase Uppercase Swap");
        String str = caseChange("abc DEF fGH");
        System.out.print(str);

    }

    //1. Farm Problem
    public static int animals(int chicks, int cows, int pigs) {
        return chicks*2 + cows*4 + pigs*4; 
    }

    //2. Football Points
    public static int footballPoints(int wins, int draws, int losses) {
        return wins*3 + draws*1; 
    }

    //3. Emily Lover
    public static void greetings(String person) {
        String greet = person.equals("Mubashir")? "Hello": "Mi amor!"; 
        System.out.println(greet);
    }

    //4. Negative Number
    public static int returnNegative(int num) {
        return num*(-1); 
    }

    //5. Bartender
    public static void shouldServeDrinks(int age, boolean ready) {
        boolean serve = (age >= 18 && ready) ? true : false; 
        System.out.println(serve);
    }

    //6. Free Coffee
    public static int totalCups(int cups) {
        return cups + cups/6; 
    }

    //7. Broken Bridge
    public static void isSafeBridge(String bridge) {
        boolean safe = true;
        for(int i = 0; i < bridge.length(); i++) {
            if (bridge.charAt(i) == ' ') {
                safe = false;
                break;
            }
        }
        System.out.println(safe);
    }

    //8. Journey Home
    public static void backToHome(String directions) {
        int vertical = 0, horizontal = 0;
        char ch = ' ';
        boolean home;

        for (int i = 0; i < directions.length(); i++) {
            ch = directions.charAt(i);
            if (ch == 'N')  vertical++;
            else if (ch == 'S')  vertical--;
            else if (ch == 'E')  horizontal++;
            else if (ch == 'W')  horizontal--;
        }

        if ((vertical == 0) && (horizontal == 0))
            home = true;
        else
            home = false;

        System.out.println(home);
    }

    //9. Lowercase Uppercase Swap
    public static String caseChange(String sentence) {
        String word="";
        char ch = ' '; 
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            if (Character.isUpperCase(ch))
                ch += 32;
            else if(Character.isLowerCase(ch))
                ch -= 32;
            word += ch;
        }
        return word;
    }
}
