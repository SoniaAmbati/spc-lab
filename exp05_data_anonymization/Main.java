package exp05_data_anonymization;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice Johnson", "Bob Smith", "Carol Lee"};

        System.out.println("Data Anonymization Simulation");
        System.out.println("=============================");
        System.out.println("Original data:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nAnonymized data:");
        for (String name : names) {
            System.out.println("[REDACTED] (" + name.length() + " chars)");
        }
    }
}
