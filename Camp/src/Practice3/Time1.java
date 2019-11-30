package Practice3;

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Time1 {
 public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        String time = input.nextLine();
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            System.out.println();
            System.out.println(String.format("%01d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second));
        }
        else
        {
        System.out.println("invalid");
        }
       
    }
}