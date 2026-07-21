package exp04_secure_file_sharing;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> permissions = new HashMap<>();
        permissions.put("alice", "read");
        permissions.put("bob", "write");

        String file = "project-report.pdf";
        String requester = "alice";
        String action = "read";

        System.out.println("Secure File Sharing Simulation");
        System.out.println("==============================");
        System.out.println("File: " + file);
        System.out.println("Requester: " + requester);
        System.out.println("Requested action: " + action);

        String allowed = permissions.getOrDefault(requester, "none");
        if (allowed.equals(action) || allowed.equals("read") && action.equals("read")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
