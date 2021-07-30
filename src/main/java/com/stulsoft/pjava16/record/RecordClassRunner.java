/*
 * Copyright (c) 2021. StulSoft
 */

package com.stulsoft.pjava16.record;

/**
 * @author Yuriy Stul
 */
public class RecordClassRunner {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1(){
        System.out.println("==>test1");
        var record1 = new RecordClass1("test 1", 123.0);
        var record2 = new RecordClass1("test 1", 123.0);
        var record3 = new RecordClass1("test 3", 123.0);

        System.out.println("record1: " + record1);
        System.out.println("record1.equals(record2) = " + record1.equals(record2));
        System.out.println("record1.equals(record3) = " + record1.equals(record3));
    }

    private static void test2(){
        System.out.println("==>test2");
        var record1 = new RecordClass1("test 1", 123.0);
        System.out.println("record1.a() = " + record1.a());
        System.out.println("record1.d() = " + record1.d());

    }
}
