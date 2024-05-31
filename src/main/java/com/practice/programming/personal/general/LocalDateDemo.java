package com.practice.programming.personal.general;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String args[]){
        LocalDate localDateFeb = LocalDate.of(2023, 2, 28);
        localDateFeb = localDateFeb.plusDays(30);
        System.out.println(localDateFeb);

        LocalDate localDateJan = LocalDate.of(2023, 1, 1);
        localDateJan = localDateJan.plusDays(-3);
        System.out.println(localDateJan);
    }
}