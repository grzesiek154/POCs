package com.company.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        List<String> someBingoNumber = Arrays.asList(
                "N40", "N36",
                "B12","B6",
                "G53", "G49", "G60", "G50",
                "I26", "I17", "I29",
                "O71"
        );

        List<String> gNumbers = new ArrayList<>();

        someBingoNumber.stream()
                        .map(String::toUpperCase)// to samo co s-> s.toUpperCase
                        .filter(s->s.startsWith("G"))
                        .sorted()
                        .forEach(System.out::println);

        Stream<String> ioNumbersStream = Stream.of("I126", "I17", "I29");
        Stream<String> inNumbersStream = Stream.of("N40", "N36", "N77", "I17","I29");
        Stream<String> CONCATStream = Stream.concat(ioNumbersStream,inNumbersStream);
        System.out.println(CONCATStream.count());

    }
}
