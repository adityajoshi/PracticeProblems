import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration1(String s) {
        // Write your code here
        int length = 0;
        length = s.length();
        int words = length / 3;
        int count = 0;
        for(int i=0;i<length; i+=3){
            if(s.charAt(i)!='S'){
                count++;
            }
            if(s.charAt(i+1)!='O'){
                count++;
            }
            if(s.charAt(i+2)!='S'){
                count++;
            }
        }
        return count;
    }

    public static int marsExploration2(String s){
        int count =0;
        String sos = "SOS";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=sos.charAt(i%3)) count++;
        }
        return count;
    }

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {
        int count = Result.marsExploration1("SOSSPSSQSSOR");
        System.out.println(count);
        count = Result.marsExploration2("SOSSPSSQSSOR");
        System.out.println(count);
    }
}
