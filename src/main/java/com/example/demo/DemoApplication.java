package com.example.demo;

import java.util.function.Consumer;

public class DemoApplication {

	private static void toLowerCaseAndThenPrint(String data) {
		data = data.toLowerCase();
		System.out.println(data);
	}

	public static void main(String[] args) {
		String name = "Nico Adhitya Kurniawan";

		Consumer<String> printConsumer1 =
				value -> System.out.println(value);
		Consumer<String> printConsumer2 = System.out::println;
		Consumer<String> consumer3 =
				value -> {
					value = value.toLowerCase();
					System.out.println(value);
				};
		Consumer<String> consumer4 = DemoApplication::toLowerCaseAndThenPrint;

		consumer4.accept(name);
	}
}
