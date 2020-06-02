import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3v2 {

    public static void findDuplicates(List<Integer> data) {
        Set<Integer> set = new HashSet<>();
        for (int el : data) {
            if( !set.add(el) ) {
                System.out.println("Повторяющееся число "+ el);
            }
        }
    }

    public static void main(String[] args) {
            List<Integer> data = Arrays.asList(3, 4, 5, 6, 3, 7, 7);
            findDuplicates(data);
    }
}
