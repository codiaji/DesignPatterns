package io.motassadderoon;

public class JsonDataProcessor extends DataProcessor {
    public JsonDataProcessor() {
        super("data.json");
    }

    @Override
    protected void openFile() {
        System.out.println("Opening JSON file: " + fileName);
        // JSON-specific opening logic
    }

    @Override
    protected void transformData() {
        System.out.println("Parsing JSON data...");
        // JSON-specific transformation
    }
}