package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

  @Data
  @AllArgsConstructor
  private static class Student {
    private String name;
    private Integer score;
    private String gender;
  }

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Bob", 55, "M"));
    students.add(new Student("Alice", 65, "F"));
    students.add(new Student("John", 30, "M"));

    groupStudentByTheirGender1(students);
    groupStudentByTheirGender2(students);
  }

  private static void groupStudentByTheirGender1(List<Student> input) {
    Map<String, List<Student>> result = input.stream()
        .collect(Collectors.groupingBy(Student::getGender));
    result.get("M").forEach(student -> System.out.println(student.getName()));
  }

  private static void groupStudentByTheirGender2(List<Student> input) {
    Map<String, List<String>> result = input.stream()
        .collect(
            Collectors.groupingBy(
                Student::getGender,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));
    result.get("M").forEach(System.out::println);
  }
}
