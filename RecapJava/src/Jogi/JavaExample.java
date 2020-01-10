package Jogi;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class JavaExample {
    public static void main(String args[]){
String str1 = "Hello How are you doing How do you do";
String str2[] = str1.split(" ");
List<String> al = new ArrayList<String>();
al = Arrays.asList(str2);
LinkedHashSet<String> hashSet = new LinkedHashSet(al);
for(String s: hashSet){
  System.out.println(s);
}
   }
}
