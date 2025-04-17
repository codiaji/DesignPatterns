package io.motassadderoon;

public abstract class DataProcessor {
    protected String fileName;

    public DataProcessor(String fileName) {
        this.fileName = fileName;
    }

    // Template Method (final to prevent overriding)
    public final void processData() {
        openFile();
        readData();
        transformData();
        closeFile();
    }

    // Primitive operation (must be implemented by subclasses)
    protected abstract void openFile();

    // Concrete operations
    protected void readData() {
        System.out.println("Reading raw data from " + fileName + "...");
    }

    protected void transformData() {
        System.out.println("Transforming data...");
    }

    protected void closeFile() {
        System.out.println("Closing " + fileName + "...");
    }
}