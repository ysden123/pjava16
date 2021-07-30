/*
 * Copyright (c) 2021. StulSoft
 */

package com.stulsoft.pjava16.pswitch;

/**
 * @author Yuriy Stul
 */
public class SwitchEx1 {
    public static void main(String[] args) {
        System.out.println("==>main");
        test1();
        test2();
        test3();
        test4();
    }

    private static void test1() {
        System.out.println("==>test1");
        var param = 2;
        switch (param) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                throw new IllegalArgumentException("Unsupported param " + param);
        }
    }

    private static void test2() {
        System.out.println("==>test2");
        var param = 2;
        switch (param) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> throw new IllegalArgumentException("Unsupported param " + param);
        }
    }

    private static void test3() {
        System.out.println("==>test3");
        var param = 2;
        switch (param) {
            case 1 -> {
                System.out.println("One");
                System.out.println("1");
            }
            case 2 -> {
                System.out.println("Two");
                System.out.println("2");
            }
            case 3 -> System.out.println("Three");
            default -> throw new IllegalArgumentException("Unsupported param " + param);
        }
    }
    private static void test4() {
        System.out.println("==>test4");
        var param = 2;

        var result = switch (param){
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> throw new IllegalStateException("Unexpected value: " + param);
        };
        System.out.printf("result=%s%n", result);
    }
}
