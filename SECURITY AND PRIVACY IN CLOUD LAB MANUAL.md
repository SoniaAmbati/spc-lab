# Cloud Security and Privacy Lab Manual

## Index

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

---

## Experiment 1: Cloud Scheduling Simulation

### Aim
Simulate a cloud scenario using CloudSim and implement a custom scheduling algorithm that is not available by default in CloudSim.

### Procedure
1. Set up the development environment:
   - Install Java Development Kit (JDK).
   - Download CloudSim library version 3.0.3 or later and add it to the project.
2. Import the required packages:
   - `org.cloudbus.cloudsim.*`
   - `org.cloudbus.cloudsim.core.CloudSim`
   - `java.util.*`
3. Create a Java class, e.g. `CustomSchedulingSimulation`.
4. Implement a custom scheduling algorithm:
   - Define objectives such as minimizing makespan, improving response time, or maximizing resource utilization.
   - Consider task prioritization, resource availability, dependencies, and load balancing.
5. Create a datacenter:
   - Define host properties: MIPS, RAM, storage, bandwidth.
   - Use `DatacenterCharacteristics`, `Host`, and VM provisioning policies.
6. Create a broker:
   - Use `DatacenterBroker` to manage cloudlets and submit them to the datacenter.
7. Create and submit cloudlets:
   - Define cloudlet length, utilization models, file size, and output size.
   - Use `Cloudlet` and submit to the broker.
8. Implement the custom allocation policy:
   - Extend `VmAllocationPolicy` and override `allocateHostForVm()`.
9. Start the simulation with `CloudSim.startSimulation()` and stop it with `CloudSim.stopSimulation()`.
10. Process results:
   - Retrieve finished cloudlets from the broker.
   - Print execution details and performance metrics.

### Output
- Total simulation time
- Datacenter details: number of hosts, VMs, cloudlets
- Scheduling decisions and cloudlet execution summary

---

## Experiment 2: Resource Management Simulation

### Aim
Simulate resource management in CloudSim and optimize allocation and utilization of cloud resources.

### Procedure
1. Set up the development environment:
   - Install JDK.
   - Add CloudSim library to the project.
2. Import required packages:
   - `org.cloudbus.cloudsim.*`
   - `org.cloudbus.cloudsim.core.CloudSim`
   - `java.util.*`
3. Create a Java class, e.g. `ResourceManagementSimulation`.
4. Initialize CloudSim:
   - `CloudSim.init(numUsers, calendar, false)`.
5. Create a datacenter.
6. Create a broker.
7. Create VMs and cloudlets:
   - Define VM characteristics: MIPS, RAM, storage, bandwidth.
   - Define cloudlet characteristics: length, utilization model, file size, output size.
8. Submit VM and cloudlet lists to the broker.
9. Run the simulation.
10. Stop the simulation and collect results.
11. Analyze output.

### Output
- Total simulation time
- Number of hosts, VMs, and cloudlets
- Resource utilization and performance metrics

---

## Experiment 3: Log Forensics Simulation

### Aim
Simulate log forensics in a cloud environment to detect suspicious activity and security incidents.

### Procedure
1. Set up the development environment and Java project.
2. Load or simulate log data entries.
3. Implement log analysis rules:
   - Detect failed login attempts.
   - Detect injection attempts.
   - Detect suspicious IP or traffic patterns.
4. Process each log entry and categorize events as alerts or information.
5. Print suspicious activities and forensic findings.

### Output
- Detected suspicious activities
- Alerts for failed logins, injections, and anomalies
- Forensic summary table

---

## Experiment 4: Secure File Sharing Simulation

### Aim
Simulate secure file sharing in a cloud environment with authentication and access control.

### Procedure
1. Set up the Java project and add CloudSim if required.
2. Create a secure file-sharing class.
3. Define users, roles, and permissions.
4. Implement authentication and authorization checks.
5. Simulate file upload and download operations.
6. Validate access control decisions and print results.

### Output
- Access granted or denied messages
- User and file-sharing activity summary

---

## Experiment 5: Data Anonymization Techniques

### Aim
Implement data anonymization techniques such as masking and k-anonymity on a sample dataset.

### Procedure
1. Identify sensitive attributes in the dataset (e.g., name, email).
2. Apply masking to replace sensitive fields with placeholders.
3. Optionally implement generalization or k-anonymity.
4. Output the anonymized dataset.

### Output
- Anonymized dataset with masked or generalized values
- Preserved data structure and format

---

## Experiment 6: Image Encryption

### Aim
Encrypt image data to protect it from unauthorized access.

### Procedure
1. Choose an encryption algorithm such as AES.
2. Generate or define an encryption key.
3. Read the image data and encrypt it.
4. Optionally store or transmit encrypted data.
5. Decrypt to verify the output.

### Output
- Encrypted image data
- Decrypted image to verify correctness

---

## Experiment 7: Image Obfuscation

### Aim
Implement an image obfuscation mechanism to make images less recognizable.

### Procedure
1. Choose an obfuscation method (blurring, masking, pixelation).
2. Read the image content.
3. Apply the obfuscation transformation.
4. Save or display the obfuscated output.

### Output
- Obfuscated image file
- Path or display of transformed image

---

## Experiment 8: Role-Based Access Control (RBAC)

### Aim
Implement RBAC to enforce access control policies based on user roles.

### Procedure
1. Define roles and permissions (e.g., admin, developer, end user).
2. Assign roles to users.
3. Implement policy checks based on role and requested action.
4. Enforce authorization decisions.

### Output
- Access decisions by role
- Example results for read/write/delete operations

---

## Experiment 9: Attribute-Based Access Control (ABAC)

### Aim
Implement ABAC to enforce access control based on user attributes.

### Procedure
1. Identify relevant attributes such as role, department, location, and time.
2. Define access control policies that use those attributes.
3. Create an attribute authority or lookup method.
4. Perform access checks based on policy rules.

### Output
- Access granted or denied based on attributes
- Policy evaluation results

---

## Experiment 10: Log Monitoring and Incident Management

### Aim
Develop a log monitoring and incident management system for cloud logs.

### Procedure
1. Choose a logging and monitoring platform.
2. Configure log sources and forwarding.
3. Define monitoring rules and alerts.
4. Implement incident generation and response workflows.
5. Simulate event detection and incident creation.

### Output
- Logged incidents and alerts
- Incident title, description, severity, and response actions

---

## Notes

- All experiments assume use of Java and CloudSim where relevant.
- The manual is organized by aim, procedure, and expected outputs.
- Replace placeholder values with the actual environment setup and library paths.
