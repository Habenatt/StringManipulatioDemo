package com.company;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        // we can't change String(immutable) after initialization. but using String buffer we can
        String str1 = "StringToUpperCase".toUpperCase();
        StringBuilder str = new StringBuilder(str1).reverse();
        System.out.println(str.toString());
        /*str.insert(2,2021);
        System.out.println(str);

        int len =str.length();
        System.out.println("Len  "+len);
        int cap = str.capacity();
        System.out.println("Cap  "+cap);

        str.append("StringsStringString");

        //New Capacity = (CurrentCapacity+1)*2  or (oldCapacity*2)+2
        int len2= str.length();
        int cap2=str.capacity();
        System.out.println("Len2  "+len2);
        System.out.println("Cap2  "+cap2);
        System.out.println("Len  "+len);
*/
        /*StringJoiner joinNames = new StringJoiner(",", "[", "]");
        StringJoiner join = new StringJoiner(",", "(", ")");
        joinNames.add("Haben");
        joinNames.add("Ninu");
        join.add("Haben");
        join.add("Ninu");

        System.out.println(joinNames);
        System.out.println(join);
        StringJoiner merge = joinNames.merge(join);

        System.out.println("Merged  " + merge);

        StringBuffer sb = new StringBuffer(20);
        int sb2 =sb.capacity();
        System.out.println("sb  "+sb2);

        ExampleInterface<Integer> ex1 = new ExampleInterface<>() {

            @Override
            public Integer compare(Integer one, Integer two) {
                if (one < two) {
                    return two;
                } else {
                    return one;
                }
            }


            @Override
            public void print() {
                System.out.println("Functional Interface");

            }
        };


        ex1.print();
        ex1.show();

*/
    }

}