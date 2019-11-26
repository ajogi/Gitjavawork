package Practice1;

import java.util.Arrays;
import java.util.HashSet;
 
public class Intersection
{
  public static void main(String[] args) 
  {
    Integer[] a	= {10,4,5,8,6};
    Integer[] b = {9,5,4,7,11};
     
    HashSet<Integer> set = new HashSet<>(); 
     
    set.addAll(Arrays.asList(a));
     
    set.retainAll(Arrays.asList(b));
     
    //System.out.println(set);
     
    //convert to array
    Integer[] intersection = {};
    intersection = set.toArray(intersection);
     
    System.out.println("c = "+Arrays.toString(intersection));
  }
}	