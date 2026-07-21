# Cloud Security and Privacy Lab Experiments

This workspace contains 10 runnable Java experiment folders derived from the lab manual.

## Prerequisites

Install a Java Development Kit (JDK) 21 or later.

On Windows, you can install it with:

```powershell
winget install --id Oracle.JDK.21 -e --source winget
```

## How to run

Run each experiment directly with Java from its own folder.

If you already have `javac` on your PATH, use:

```cmd
cd exp01_cloud_scheduling
javac Main.java
java Main
```

If `javac` is not on your PATH, compile and run with the installed JDK directly:

```cmd
cd exp01_cloud_scheduling
"C:\Program Files\Java\jdk-21.0.11\bin\javac.exe" Main.java
"C:\Program Files\Java\jdk-21.0.11\bin\java.exe" Main
```

Repeat for any experiment folder you need.

## Experiments

1. Experiment 1 - Cloud Scheduling Simulation
2. Experiment 2 - Resource Management Simulation
3. Experiment 3 - Log Forensics Simulation
4. Experiment 4 - Secure File Sharing Simulation
5. Experiment 5 - Data Anonymization Techniques
6. Experiment 6 - Image Encryption
7. Experiment 7 - Image Obfuscation
8. Experiment 8 - Role-Based Access Control
9. Experiment 9 - Attribute-Based Access Control
10. Experiment 10 - Log Monitoring and Incident Management
