import employee.Employee;
import services.CredentialService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CredentialService credService = new CredentialService();
        Employee employee = new Employee("Deepanshu", "Sinha");
        credService.setEmployee(employee);
        Scanner sc = new Scanner(System.in);
        String email, password;

        boolean quit = false;
        do {
            System.out.println("1 - Technical");
            System.out.println("2 - Admin");
            System.out.println("3 - Human Resource");
            System.out.println("4 - Legal");
            System.out.println("Choose an Option");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    credService.setDepartmentName("Tech");
                    credService.setCompany("GL");
                    email = credService.generateEmail();
                    employee.setEmail(email);
                    password = credService.generatePasswd();
                    employee.setPassword(password);
                    credService.showCredential();
                    break;
                case 2:
                    credService.setDepartmentName("Admin");
                    credService.setCompany("GL");
                    email = credService.generateEmail();
                    employee.setEmail(email);
                    password = credService.generatePasswd();
                    employee.setPassword(password);
                    credService.showCredential();
                    break;
                case 3:
                    credService.setDepartmentName("HR");
                    credService.setCompany("GL");
                    email = credService.generateEmail();
                    employee.setEmail(email);
                    password = credService.generatePasswd();
                    employee.setPassword(password);
                    credService.showCredential();
                    break;
                case 4:
                    credService.setDepartmentName("Legal");
                    credService.setCompany("GL");
                    email = credService.generateEmail();
                    employee.setEmail(email);
                    password = credService.generatePasswd();
                    employee.setPassword(password);
                    credService.showCredential();
                    break;
                default:
                    System.out.println("\nInvalid Choice");
                    quit = true;
                    break;

            }
        } while (!quit);
        System.out.println("The Application terminated");
    }
}
