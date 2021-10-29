package Java.Advanced.Collections.Lists;

import java.util.*;

public class SortByPriceL2H implements Comparator <Product>{
    
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() > p2.getPrice())
            return 1;
        else
            return -1;
    }
}
