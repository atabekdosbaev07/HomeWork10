package com.company;

import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Days day = Days.valueOf(scan.next());
        System.out.println(day);

    }
}