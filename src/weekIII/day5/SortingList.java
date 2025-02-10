package weekIII.day5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortingList {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(53);
            numbers.add(38);
            numbers.add(81);
            numbers.add(14);

            System.out.println("Before Sorting : " + numbers);
            Comparator<Integer> com = new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    if (o1 % 10 > o2 % 10) {
                        return 1;
                    } else return -1;
                }
            };

            Collections.sort(numbers, com);

            // Printing the sorted ArrayList
            System.out.println("After Sorting : " + numbers);

        }

}
