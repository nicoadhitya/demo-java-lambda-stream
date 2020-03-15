package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

  @Data
  @AllArgsConstructor
  private static class Student {
    private String name;
    private Integer score;
  }

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Bob", 55));
    students.add(new Student("Alice", 65));
    students.add(new Student("John", 30));

    //getStudentsWithScoreMoreThan50(students);
    //sortStudentsByTheirScore(students);
    //checkIfAnyStudentPassScore(students, 60);
  }

  private static void getStudentsWithScoreMoreThan50(List<Student> input) {
    List<Student> result = input.stream()
        .filter(student -> student.getScore() > 50)
        .collect(Collectors.toList());
    result.forEach(System.out::println);
  }

  private static void sortStudentsByTheirScore(List<Student> input) {
    List<Student> result = input.stream()
        .sorted(Comparator.comparing(Student::getScore))
        .collect(Collectors.toList());
    result.forEach(System.out::println);
  }

  private static void checkIfAnyStudentPassScore(List<Student> input, Integer benchmark) {
    boolean anyonePass = input.stream()
        .anyMatch(student -> student.getScore() >= benchmark);
    if (anyonePass) {
      System.out.println("Someone has score >= " + benchmark);
    } else {
      System.out.println("No one has score >= " + benchmark);
    }
  }
}
