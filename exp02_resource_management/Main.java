import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Vm {
        String name;
        int cpu;
        int ram;
        int bandwidth;

        Vm(String name, int cpu, int ram, int bandwidth) {
            this.name = name;
            this.cpu = cpu;
            this.ram = ram;
            this.bandwidth = bandwidth;
        }
    }

    public static void main(String[] args) {
        List<Vm> vms = new ArrayList<>();
        vms.add(new Vm("VM-1", 6, 8, 5));
        vms.add(new Vm("VM-2", 4, 6, 7));
        vms.add(new Vm("VM-3", 5, 5, 6));

        System.out.println("Resource Management Simulation");
        System.out.println("==============================");

        int totalCpu = 0;
        int totalRam = 0;
        int totalBw = 0;

        for (Vm vm : vms) {
            totalCpu += vm.cpu;
            totalRam += vm.ram;
            totalBw += vm.bandwidth;
            System.out.printf("%s -> CPU:%d RAM:%d BW:%d%n",
                    vm.name, vm.cpu, vm.ram, vm.bandwidth);
        }

        System.out.printf("\nAverage CPU usage: %.1f%%%n", totalCpu * 100.0 / (vms.size() * 10));
        System.out.printf("Average RAM usage: %.1f%%%n", totalRam * 100.0 / (vms.size() * 10));
        System.out.printf("Average Bandwidth usage: %.1f%%%n", totalBw * 100.0 / (vms.size() * 10));
    }
}
