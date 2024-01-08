package com.shivaa.recusions;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "bhdaabacax";
        int size = str.length();
        char target = 'a';
        int index = 0;
        System.out.println(remove(str,index,size,target));;
    }
    // function
    static String remove(String string,int idx,int n , char tar){
        String ans= new String("");
        if (idx==string.length()) return ans;
        if(string.charAt(idx)==tar){
            return remove(string,idx+1,n,tar);
        }
        return ans+= ""+string.charAt(idx)+remove(string,idx+1,n,tar);
    }
}
