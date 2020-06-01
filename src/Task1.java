import java.util.ArrayList;


public class Task1 {
    public static void main(String[] args) {
        CustomList cl = new CustomList();
        cl.add(15);
        cl.add(16);
        System.out.println(cl);
        cl.add(1);
        System.out.println(cl);
        cl.remove(2);
        System.out.println(cl);
        int ma = cl.max();
        System.out.println(ma);
        int mi = cl.min();
        System.out.println(mi);
        System.out.println(cl.getByInd(0));
        System.out.println(cl.getByValue(13));
        System.out.println(cl.avg());
    }
}
