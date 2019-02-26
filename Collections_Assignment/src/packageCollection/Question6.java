package packageCollection;
//Question 6 Print the elements of an array in the decreasing
// frequency if 2 numbers have same frequency then print the one which came first.
import java.util.HashMap;
import java.util.*;
public class Question6 {
    public HashMap<Integer,Integer> elementCount(int array[]) {
        HashMap<Integer, Integer> elementOccurence = new HashMap<>();
        for (int i : array) {
            if (!elementOccurence.containsKey(i)) {
                elementOccurence.put(i, 1);
            } else {
                elementOccurence.put(i, elementOccurence.get(i) + 1);
            }
        }
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(elementOccurence.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {

                if(o2.getValue()==o1.getValue())
                    return o1.getKey();
                else
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> list1 : list) {

            temp.put(list1.getKey(), list1.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        int array[]={1,3,0,4,3,6,7,5,4,6,6,9,4,3,7};
        Question6 q = new Question6();
        HashMap<Integer,Integer> temp =q.elementCount(array);
        for (Map.Entry<Integer, Integer> i : temp.entrySet()) {
            System.out.println("Element = " + i.getKey() + ", occurence = " + i.getValue());
        }
    }

}

