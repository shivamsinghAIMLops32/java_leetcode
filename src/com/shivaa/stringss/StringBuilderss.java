package com.shivaa.stringss;

import java.util.*;

public class StringBuilderss {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");

        /* This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations.*/
        System.out.println(str.append(" shivam"));
        System.out.println(str.append(7));
        str.setCharAt(1,'y');
        System.out.println(str);
//        System.out.println(str.setCharAt(1,'y'));  wrong

        System.out.println(str.insert(1,"blah"));

        System.out.println(str.replace(2,6,"star"));
        System.out.println(str.deleteCharAt(2));
        System.out.println(str.delete(2,5));   // 2 to 4 will be deleted.

        System.out.println(str.reverse());

        System.out.println(str.capacity());

        System.out.println(str.append("nksjjncidc"));
        System.out.println(str.substring(1,8));     // 1 to 5

        System.out.println(str.subSequence(2,5));

    }
}
