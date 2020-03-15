package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo2 {

  public static void main(String[] args) {
    List<Integer> scores = new ArrayList<>();
    scores.add(10);
    scores.add(15);
    scores.add(20);
    scores.add(30);
    scores.add(50);

    for (int i = 0; i < scores.size(); i++) {
      System.out.println(scores.get(i));
    }

    //printAll(scores);
    //printAllSimplified(scores);

    for (int i = 0; i < scores.size(); i++) {
      Integer value = scores.get(i) * 2;
      System.out.println(value);
    }

    //multiplyThenPrintAll(scores);
  }

  // print using foreach
  private static void printAll(List<Integer> input) {
    Consumer<Integer> printConsumer = System.out::println;
    input.forEach(printConsumer);
  }

  // print using foreach, simplified
  private static void printAllSimplified(List<Integer> input) {
    input.forEach(System.out::println);
    //input.forEach(value -> System.out.println(value));
  }

  // multiply, then print
  private static void multiplyThenPrintAll(List<Integer> input) {
    input.forEach(value -> System.out.println(value * 2));
  }
}
