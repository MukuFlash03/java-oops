package Java.Advanced.Collections.Lists;

import java.util.*;

public class SortByPriceH2L implements Comparator <Product>{
    
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() < p2.getPrice())
            return 1;
        else
            return -1;
    }
}
