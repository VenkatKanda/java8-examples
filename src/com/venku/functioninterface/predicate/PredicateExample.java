package com.venku.functioninterface.predicate;

import java.util.Scanner;

public class PredicateExample {

    public static void main(String[] args) {

        callMethod();

    }

    private static void callMethod() {

        PredicateLogic logic = new PredicateLogic();

        System.out.println("Please enter a string");

        Scanner scanner = new Scanner(System.in);

        String given = scanner.next();

        if(logic.Atvalidation.and(logic.lengthValidation).test(given)){
            System.out.println("validationd  on back end");
        } else{
            System.out.println("Not valid please check");
        }
    }
}
