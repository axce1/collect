import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        
        int n = args.length;
        Integer[] data = new Integer[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.valueOf(args[i]);
        }

        Set<Integer> found = new HashSet<>();
        Set<Integer> dupl = new HashSet<>();
        for (Integer digit :
                data) {
            if (found.contains(digit)) {
                dupl.add(digit);
            } else {
                found.add(digit);
            }
        }

        if(dupl.size() != 0) {
            System.out.println("true");
        } else {
        System.out.println("false");
        }
    }
}
