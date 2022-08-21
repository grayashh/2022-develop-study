import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) throws Exception {
        Integer[] arr = {1, 3, 3, 2, 1, 1, 4, 5, 5, 1, 3};
        HashSet<Integer> hashset = new HashSet<>();
        for (Integer elem : arr) {
            hashset.add(elem);
        }
        System.out.println(hashset);
    }
}
