package services;

import employee.Employee;

import java.util.Random;

public class CredentialService {
    private String departmentName;
    private String company;
    public Employee employee;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String generateEmail() {
        String email;
        email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + this.getDepartmentName().toLowerCase() + "." + this.getCompany().toLowerCase() + ".com";
        return email;
    }

    public String generatePasswd() {
        String password = "";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String spl = "~!@#$%^&*()_-+~`{}[]";

        Random random = new Random();
        password += upper.charAt(random.nextInt(upper.length()));
        password += upper.charAt(random.nextInt(upper.length()));

        password += lower.charAt(random.nextInt(lower.length()));
        password += lower.charAt(random.nextInt(lower.length()));

        password += number.charAt(random.nextInt(number.length()));
        password += number.charAt(random.nextInt(number.length()));

        password += spl.charAt(random.nextInt(spl.length()));
        password += spl.charAt(random.nextInt(spl.length()));

        return password;
    }

    public void showCredential() {
        System.out.println("Dear" + " " + employee.getFirstName() + " " + "your credential are as follows");
        System.out.println("Email    --->" + generateEmail());
        System.out.println("Password --->" + generatePasswd());
    }
}
