package Java.Advanced.Collections.Maps;

import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        HashMap <String, String> map1 = new HashMap <String, String>();

        map1.put("101", "A1");
        map1.put("102", "B1");
        map1.put("103", "C1");
        map1.put("104", "A2");
        map1.put("105", "C2");
        map1.put("106", "B2");

        TreeMap <String, String> map2 = new TreeMap <String, String>();

        map2.put("101", "A1");
        map2.put("102", "B1");
        map2.put("103", "C1");
        map2.put("104", "A2");
        map2.put("105", "C2");
        map2.put("106", "B2");

        LinkedHashMap <String, String> map3 = new LinkedHashMap <String, String>();

        map3.put("101", "A1");
        map3.put("102", "B1");
        map3.put("103", "C1");
        map3.put("104", "A2");
        map3.put("105", "C2");
        map3.put("106", "B2");

        System.out.println("HashMap");
        System.out.println(map1);
        System.out.println();
        System.out.println("TreeMap");
        System.out.println(map2);
        System.out.println();
        System.out.println("LinkedHashMap");
        System.out.println(map3);
        System.out.println();

        String empName = map1.get("103");
        System.out.println(empName);

        Collection <String> empNames = map1.values();
        System.out.println("----- Employee Names -----");
        for (String name: empNames) {
            System.out.println(name);
        }

        Set <String> empIds = map1.keySet();
        System.out.println("----- Employee IDs -----");
        for (String id: empIds) {
            System.out.println(id);
        }

        
        Set <Map.Entry<String, String>> employeeData = map1.entrySet();
        System.out.println("----- Emp ID \t Emp Name-----");
        for (Map.Entry<String, String> employee: employeeData) {
            String id = employee.getKey();
            String name = employee.getValue();
            System.out.println(id + "\t" + name);
        }
        

    }
}
