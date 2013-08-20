package ejemplosCleanCode;

import java.util.ArrayList;
import java.util.List;

public class CleanCode {

    public static void main(String[] args) {
        
        CleanCode.getThem();
        
    }

    
   public static List<int[]> getThem() {
        
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : list1) {
            if (x[0] == 4) {
                list1.add(x);
            }
            System.out.println(x);
        }
        return list1;
    }
}
