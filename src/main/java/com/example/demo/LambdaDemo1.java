package com.example.demo;

import java.util.function.Consumer;

public class LambdaDemo1 {

  public static void main(String[] args) {
    String name = "Nico Adhtiya Kurniawan";

    System.out.println(name);

    //print(name);
    //printUsingMethodReference(name);

    String lowerCasedName = name.toLowerCase();
    System.out.println(lowerCasedName);

    //toLowerCaseThenPrint(name);
    //toLowerCaseThenPrintUsingMethod(name);
    //toLowerCaseThenPrintUsingMethodReference(name);
  }

  // print, using lambda
  private static void print(String input) {
    Consumer<String> printConsumer =
        value -> System.out.println(value);
    printConsumer.accept(input);
  }

  // print, using method reference
  private static void printUsingMethodReference(String input) {
    Consumer<String> printConsumer = System.out::println;
    printConsumer.accept(input);
  }

  // to lower case, then print using lambda
  private static void toLowerCaseThenPrint(String input) {
    Consumer<String> toLowerCaseThenPrintConsumer =
        value -> {
          value = value.toLowerCase();
          System.out.println(value);
        };
    toLowerCaseThenPrintConsumer.accept(input);
  }

  // to lower case, then print using other method
  private static void toLowerCaseThenPrintUsingMethod(String input) {
    Consumer<String> toLowerCaseThenPrintConsumer =
        value -> printLowerCased(value);
    toLowerCaseThenPrintConsumer.accept(input);
  }

  private static void printLowerCased(String input) {
    input = input.toLowerCase();
    System.out.println(input);
  }

  // to lower case, then print using method reference
  private static void toLowerCaseThenPrintUsingMethodReference(String input) {
    Consumer<String> toLowerCaseThenPrintConsumer = LambdaDemo1::printLowerCased;
    toLowerCaseThenPrintConsumer.accept(input);
  }
}
