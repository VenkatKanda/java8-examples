package com.venku.functioninterface.predicate;

import java.util.function.Predicate;

public class PredicateLogic {

    Predicate<String> Atvalidation = input -> (input.contains("@"));

    Predicate<String> lengthValidation = input -> (input.length() == 10);


}
