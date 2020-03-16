package com.example.demo;

import java.util.function.Consumer;

public class DemoApplication {

  private static void print(String input) {
    System.out.println(input);
  }

  private static void toLowerCaseThenPrint(String input) {
    input = "Mr. " + input;
    input = input.toLowerCase();
    System.out.println(input);
  }

	public static void main(String[] args) {

	  String name = "John";
	  Integer score = 10;

		Consumer<String> printConsumer =
        value -> {
          value = "Mr. " + value;
          value = value.toLowerCase();
          System.out.println(value);
        };

    Consumer<String> printConsumerWithFunction =
        value -> toLowerCaseThenPrint(value);

    Consumer<String> printConsumerWithFunctionWithReference =
        DemoApplication::toLowerCaseThenPrint;

    printConsumer.accept(name);
    printConsumerWithFunction.accept(name);
    printConsumerWithFunctionWithReference.accept(name);
	}
}
