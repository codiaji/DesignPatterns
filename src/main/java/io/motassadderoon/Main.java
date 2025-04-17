package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        DataProcessor jsonProcessor = new JsonDataProcessor();
        jsonProcessor.processData();

        System.out.println("-----");

        DataProcessor csvProcessor = new CsvDataProcessor();
        csvProcessor.processData();
    }
}