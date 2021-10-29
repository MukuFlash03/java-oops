public class test {
    public static void main(String[] args) {
        String[] last = {"Biri", "Newman", "Ropeburn"};
        String[] first = {"Ben", "Chad", "Audrey"};
        String userId[] = new String[3];
        String sub = "";

        for (int i = 0; i<last.length; i++) {
            if (last[i].length() < 7)
                sub = last[i].toLowerCase();
            else
                sub = last[i].substring(0,7).toLowerCase();
                // System.out.println(sub);
                // System.out.println(first[i].charAt(0));
            userId[i] = (first[i].charAt(0) + sub).toLowerCase();
            System.out.println(userId[i]);
        }
    }
}