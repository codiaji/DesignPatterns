package io.motassadderoon;

class DataProcessor {
    public void processCSV() {
        openFile("data.csv");
        readData();
        transformData();
        closeFile();
    }

    public void processJSON() {
        openFile("data.json");
        readData();
        transformData();
        closeFile();
    }

    private void openFile(String filename) {
        System.out.println("Opening file: " + filename);
    }

    private void readData() {
        System.out.println("Reading raw data...");
    }

    private void transformData() {
        System.out.println("Transforming data...");
    }

    private void closeFile() {
        System.out.println("Closing file...");
    }
}
