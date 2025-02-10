package weekIII.assignment2;

import java.util.*;

public class MergeArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();


        System.out.println("Enter elements for l1");
        while (true) {
            int ele = sc.nextInt();
            if (ele == -1) break;
            l1.add(ele);
        }


        System.out.println("Enter elements for l2:");
        while (true) {
            int ele = sc.nextInt();
            if (ele == -1) break;
            l2.add(ele);
        }


        ArrayList<Integer> m1 = mergeLists(l1, l2);


        System.out.println("Merged list without duplicates:");
        for (int num : m1) {
            System.out.print(num + " ");
        }
    }

    private static ArrayList<Integer> mergeLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        TreeSet<Integer> s = new TreeSet<>(l1);
        s.addAll(l2);
        return new ArrayList<>(s);
    }
}