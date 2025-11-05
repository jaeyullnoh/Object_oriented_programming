class PersonalComputer {
    Computer computer = new Computer();
    Monitor monitor = new Monitor();

    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor {
    private String monitorSize = "24 inch";
    private String color = "Black";
    private String power = "45W";

    public void turnOn() {
        System.out.printf("Turning on the monitor.\n");
    }
    public void printInfo() {
        System.out.printf("The spec of the monitor\n");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class Computer {
    private String cpu = "Core i7";
    private String memory = "16GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "500W";

    public void turnOn() {
        System.out.printf("Turning on the computer.\n");
    }
    public void printInfo() {
        System.out.printf("The spec of the computer\n");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer();
        pc.turnOn();
        pc.printInfo();
    }
}