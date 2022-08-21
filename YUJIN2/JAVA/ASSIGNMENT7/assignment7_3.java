import java.util.ArrayList;
import java.util.TreeSet;

public class assignment7_3 {
    public static void main(String[] args) {
        int k=10;
        ArrayList<Integer> arrayFirstList = new ArrayList<Integer>(k);
        for(int i=0; i< k; i++){
            int num = (int)(Math.random()*5)+1;
            arrayFirstList.add(num);
        }
        System.out.print(arrayFirstList);
        System.out.print(" -> ");
        TreeSet<Integer> arrayFirstTreeSet = new TreeSet<Integer>(arrayFirstList);
        ArrayList<Integer> arraySecondList = new ArrayList<Integer>(arrayFirstTreeSet);
        System.out.println(arraySecondList);
    }
}
