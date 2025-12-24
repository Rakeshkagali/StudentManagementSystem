import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    service.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    Student s = service.searchStudent(sc.nextInt());
                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Student Not Found!");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Course: ");
                    String newCourse = sc.nextLine();

                    service.updateStudent(uid, newName, newAge, newCourse);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
