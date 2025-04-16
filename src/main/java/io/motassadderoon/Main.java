package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new ComputerBuilder()
                                    .cpu("Intel i7")
                .ram("16GB")
                .storage("512GB SSD")
                .graphicsCard("NVIDIA RTX 3070")
                .HasWifi(true)
                .hasBluetooth(true).build();
        System.out.println(computer1);

        Computer computer2 = new Computer("AMD Ryzen 5", "8GB", "256GB SSD", null, false, false);
        System.out.println(computer2);

        Computer computer3 = new Computer("Intel i5", "8GB", "1TB HDD", "Integrated", true, false);
        System.out.println(computer3);
    }
}