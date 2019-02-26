package packageCollection;
//Question 6 Print the elements of an array in the decreasing
// frequency if 2 numbers have same frequency then print the one which came first.


import java.util.*;


public class Question6 {
    public static void main(String[] args) {
        String string = "this is to sort a string according to character occurrence";
        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                if (frequency.containsKey(string.charAt(i))) {
                    int k = frequency.get(string.charAt(i));
                    k++;
                    frequency.put(string.charAt(i), k);
                } else {
                    frequency.put(string.charAt(i), 1);
                }
            }
        }
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(frequency.entrySet());

     Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
         @Override
         public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
             return (o1.getValue()).compareTo(o2.getValue());
         }
     });
        HashMap<Character, Integer> temp1 = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp1.put(aa.getKey(), aa.getValue());
        }
        System.out.println(temp1.toString());
    }
}