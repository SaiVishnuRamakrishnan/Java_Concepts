package Map;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
  
public class SortedMapExample {
    public static void main(String[] args)
    {
        SortedMap<Integer, String> sm
            = new TreeMap<Integer, String>();
        
        sm.put(new Integer(2), "practice");
        sm.put(new Integer(3), "quiz");
        sm.put(new Integer(5), "code");
        sm.put(new Integer(4), "contribute");
        sm.put(new Integer(1), "geeksforgeeks");
        Set s = sm.entrySet();
  
        // Using iterator in SortedMap
        Iterator i = s.iterator();
  
        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();
  
            int key = (Integer)m.getKey();
            String value = (String)m.getValue();
  
            System.out.println("Key : " + key
                               + "  value : " + value);
        }
        
        SortedMap<String, String> tm
        = new TreeMap<String, String>(new Comparator<String>() {
              public int compare(String a, String b)
              {
                  return b.compareTo(a);
              }
          });

    // Adding elements into the TreeMap
    // using put()
    tm.put("India", "1");
    tm.put("Australia", "2");
    tm.put("South Africa", "3");

    // Displaying the TreeMap
    System.out.println(tm);

    // Removing items from TreeMap
    // using remove()
    tm.remove("Australia");
    System.out.println("Map after removing "
                       + "Australia:" + tm);
    }
}