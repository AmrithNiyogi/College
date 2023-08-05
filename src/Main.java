import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an array of Faculty objects.
        System.out.println("Enter number size of array to be created: ");
        int num = sc.nextInt();
        Faculty[] faculties = new Faculty[num];

        System.out.println("Enter number of Faculty records to create: ");
        int n = sc.nextInt();
        // Create the Faculty objects.
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details of Faculty " + (i+1));
            System.out.println("Enter Faculty Name: ");
            String name = sc.next();
            System.out.println("Enter Faculty ID:");
            String id = sc.next();
            System.out.println("Enter Faculty Salary: ");
            double salary = sc.nextDouble();
            System.out.println("Enter Faculty Department: ");
            String department = sc.next();
            System.out.println("Enter Faculty Job Title: ");
            String jobTitle = sc.next();
            System.out.println("Enter Faculty Research Area: ");
            String researchArea = sc.next();
            System.out.println("Enter Faculty Office Hours: ");
            String officeHours = sc.next();

            faculties[i] = new Faculty(name, id, salary, department, jobTitle, researchArea,
                    officeHours);
        }
        // Print the Faculty objects.
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Faculty " + (i+1));
            System.out.println(faculties[i].toString());
        }
    }
}