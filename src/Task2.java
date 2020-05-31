import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(3, 8, 15, 17);
        int num = 23;
        for (int i = 0; i < data.size(); i++) {
            int j;
            for (j = i+1; j < data.size(); j++ ){
                int elemSum = data.get(i) + data.get(j);
                if (elemSum == num) {
                    System.out.println(data.get(i) + " " + data.get(j));
                }
            }
        }
    }
}
