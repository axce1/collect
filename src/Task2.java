import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void findIndex(List<Integer> data, int sum) {
        List<Integer> arr = new ArrayList();
        for (int i = 0; i < data.size(); i++) {
            int j;
            for (j = i+1; j < data.size(); j++ ){
                int elemSum = data.get(i) + data.get(j);
                if (elemSum == sum) {
                    arr.add(i);
                    arr.add(j);
                    System.out.println(arr);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(3, 8, 15, 17);
        int num = 23;

        findIndex(data, num);
    }
}
