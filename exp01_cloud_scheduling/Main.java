import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static class Task {
        String name;
        int length;
        int priority;

        Task(String name, int length, int priority) {
            this.name = name;
            this.length = length;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>(Arrays.asList(
                new Task("Task-A", 70, 2),
                new Task("Task-B", 50, 1),
                new Task("Task-C", 90, 3),
                new Task("Task-D", 40, 2)
        ));

        List<String> vms = Arrays.asList("VM-1", "VM-2", "VM-3");
        int[] loads = new int[vms.size()];

        System.out.println("Cloud Scheduling Simulation");
        System.out.println("==========================");

        for (Task task : tasks) {
            int bestVm = 0;
            for (int i = 1; i < loads.length; i++) {
                if (loads[i] < loads[bestVm]) {
                    bestVm = i;
                }
            }
            loads[bestVm] += task.length + task.priority * 10;
            System.out.printf("Assigned %s to %s with load %d%n",
                    task.name, vms.get(bestVm), loads[bestVm]);
        }

        System.out.println("\nFinal VM load summary:");
        for (int i = 0; i < vms.size(); i++) {
            System.out.printf("%s -> %d%n", vms.get(i), loads[i]);
        }
    }
}
