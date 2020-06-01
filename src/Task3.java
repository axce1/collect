import java.util.*;

public class Task3 {
    public static void findDuplicates(List<Integer> data) {
        Set<Integer> found = new HashSet<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (Integer digit :
                data) {
            if (found.contains(digit)) {
                if(hashMap.containsKey(digit)) {
                    hashMap.put(digit, hashMap.get(digit) + 1);
                }
            } else {
                found.add(digit);
                hashMap.put(digit, 1);
            }
        }

        if(hashMap.size() != 0) {
            System.out.println("true");
            for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(
                            "Число " + entry.getKey() + " повторяется " + entry.getValue() + " раз"
                    );
                }
            }
        } else {
            System.out.println("false");
            System.out.println("No find duplicates");
        }
    }
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(3, 3, 3, 4, 5, 6, 7, 3, 7, 7);
        findDuplicates(data);
    }
}
