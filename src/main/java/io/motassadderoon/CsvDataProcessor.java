package io.motassadderoon;

public class CsvDataProcessor extends DataProcessor {
    public CsvDataProcessor() {
        super("data.csv");
    }

    @Override
    protected void openFile() {
        System.out.println("Opening CSV file: " + fileName);
        // CSV-specific opening logic
    }

    @Override
    protected void transformData() {
        System.out.println("Parsing CSV columns...");
        // CSV-specific transformation
    }
}