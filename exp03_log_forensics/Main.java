import java.util.ArrayList;
import java.util.List;

public class Main {
    static class LogEntry {
        String source;
        String message;

        LogEntry(String source, String message) {
            this.source = source;
            this.message = message;
        }
    }

    public static void main(String[] args) {
        List<LogEntry> logs = new ArrayList<>();
        logs.add(new LogEntry("web-01", "User login failed for admin"));
        logs.add(new LogEntry("db-01", "SQL injection attempt detected"));
        logs.add(new LogEntry("web-02", "Normal access granted"));
        logs.add(new LogEntry("api-01", "Multiple failed logins from 10.0.0.9"));

        System.out.println("Log Forensics Simulation");
        System.out.println("=========================");

        for (LogEntry entry : logs) {
            if (entry.message.toLowerCase().contains("failed")
                    || entry.message.toLowerCase().contains("injection")
                    || entry.message.toLowerCase().contains("attempt")) {
                System.out.printf("[ALERT] %s -> %s%n", entry.source, entry.message);
            } else {
                System.out.printf("[INFO] %s -> %s%n", entry.source, entry.message);
            }
        }
    }
}
