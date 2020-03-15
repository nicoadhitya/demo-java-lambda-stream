package com.example.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {

  public static void main(String[] args) {
    Stream<String> data = Stream.of("Java", "Stream", "is", "Super", "Fun");

    data.map(String::toLowerCase)
        .map(value -> value.split(""))
        .flatMap(value -> Arrays.stream(value))
        .distinct()
        .sorted()
        .forEach(System.out::println);
  }
}
