package collection;
import java.util.*;

public class question1 {

    private static Map<Integer, String> employeeMap = new HashMap<>();
    
    public static void add(int employeeId, String employeeName) {
        employeeMap.put(employeeId, employeeName);
    }
    
    public static void findEmployeesByName(String nameToSearch) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(nameToSearch)) {
                System.out.println("Employee ID: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
    
        add(101, "Ash");
        add(102, "Tarun");
        add(103, "Chris");
        add(104, "Yak"); 
        add(494,"Ash");
        
        String searchName = "Ash";
        System.out.println("Employees with name '" + searchName + "':");
        findEmployeesByName(searchName);
    }
}

