package com.shivaa.stringss.quesions;
import java.util.*;
public class LtLongestSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("ENTER A STRING :- ");
        String str = scn.nextLine();

        // now to get longest substring having non-repeated elements in an string
        int maxcount = 1;
//         generating all substrings and checking whether its repeating or not then maxcount returns
        for (int i = 1; i < str.length(); i++) {
            for (int j = i+1; j <= str.length();j++){
                  String ans =str.substring(i,j);

                 if(!isRepeating(ans)){
                     if (maxcount <= ans.length()) {
                         maxcount = ans.length();
                     }
                 }
            }
        }

        System.out.println(maxcount);
    }
    // function for isRepeating when a sting is given
    public static boolean isRepeating(String s){
        String ans = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            String ch =  "" + s.charAt(i);

            // if ans have the character
            if (ans.contains(ch)) {
                return true;
            }
            else{
                ans += ch;
                ch = "";
            }
        }
        return false;
    }
}
