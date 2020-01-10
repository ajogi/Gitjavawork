package Jogi;


import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class Sai {
 
    public static void main(String[] args) {
        
        String str ="Hello How Are You Doing How Do You Do";
        String[] strWords = str.split(" ");
        LinkedHashSet<String> lhSetWords 
            = new LinkedHashSet<String>( Arrays.asList(strWords) );
        
        //join the words again by space
        StringBuilder sbTemp = new StringBuilder();
        int index = 0;
        
        for(String s : lhSetWords){
            
            if(index > 0)
                sbTemp.append(" ");
        
            sbTemp.append(s);
            index++;
        }        
        str = sbTemp.toString();
        System.out.println(str);
 
    }

}
