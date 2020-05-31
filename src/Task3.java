import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(4, 4, 5, 6, 7);
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
        }
        System.out.println("false");
    }
}
