package collection;

import java.util.*;

public class collectionquestion3 {

    private static Map<Integer, String> employeeMap = new HashMap<>();
    private static int thresholdSize;

    public static void setThresholdSize(int size) {
        thresholdSize = size;
    }

    public static void addEmployee(int employeeId, String employeeName) {
        employeeMap.put(employeeId, employeeName);
        checkAndPrintClearMap();
    }

    private static void checkAndPrintClearMap() {
        if (employeeMap.size() >= thresholdSize) {
            System.out.println("Map content before clearing:");
            printEmployees();
            employeeMap.clear();
            System.out.println("Map cleared!");
        }
    }

    public static void printEmployees() {
        System.out.println("Employee Map Content:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Employee Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        setThresholdSize(3);

        addEmployee(101, "Yazz");
        addEmployee(102, "Kane");
        addEmployee(103, "Johnny");
        addEmployee(104, "Kane");
        addEmployee(105, "Arun");

        printEmployees();
    }
}
