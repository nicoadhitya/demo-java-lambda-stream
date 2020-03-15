package com.example.demo;

import java.util.stream.Stream;

public class StreamDemo1 {

  public static void main(String[] args) {
    //intStream();
    //stringStream();
  }

  private static void intStream() {
    Stream<Integer> scoreStream = Stream.of(10, 30, 50, 40, 20);

    scoreStream
        .map(value -> value * 2)
        .filter(value -> value > 50)
        .sorted()
        .forEach(System.out::println);
  }

  private static void stringStream() {
    Stream<String> nameStream = Stream.of("Nico", "Alice", "Bob", "John");

    nameStream
        //.filter(value -> value.contains("a"))
        .map(String::toUpperCase)
        .map(value -> "Mr./Mrs. " + value)
        .filter(value -> value.contains("A"))
        .forEach(System.out::println);
  }
}
