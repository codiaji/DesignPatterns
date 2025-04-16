// io.motassadderoon.Main.java
package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new ComputerBuilder()
                .cpu("Intel i7")
                .ram("16GB")
                .storage("512GB SSD")
                .graphicsCard("NVIDIA RTX 3070")
                .hasWifi(true)
                .hasBluetooth(true)
                .build();
        System.out.println(computer1);

        Computer computer2 = new ComputerBuilder()
                .cpu("AMD Ryzen 5")
                .ram("8GB")
                .storage("256GB SSD")
                .build();
        System.out.println(computer2);

        Computer computer3 = new ComputerBuilder()
                .cpu("Intel i5")
                .ram("8GB")
                .storage("1TB HDD")
                .hasWifi(true)
                .build();
        System.out.println(computer3);
    }
}