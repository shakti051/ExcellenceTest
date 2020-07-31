package com.company;

import java.util.Arrays;
/**
 * Write a code to sort the object by id
 * I.e final output should have objected sort by id’s
 * **/
public class Answer5 {
    public static void main(String[] args) {
        MyType[] myTypes = {
                new MyType("id", "2", "name1", "abc1"),
                new MyType("id", "298", "name2", "abc2"),
                new MyType("id", "3", "name3", "abc3"),
        };

        System.out.println("--- before");
        System.out.println(Arrays.asList(myTypes));
        Arrays.sort(myTypes, (a, b) -> a.id.compareTo(b.id));
        System.out.println("--- after");
        System.out.println(Arrays.asList(myTypes));

    }
}
