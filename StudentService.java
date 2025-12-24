import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Available!");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    public void updateStudent(int id, String newName, int newAge, String newCourse) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(newName);
            s.setAge(newAge);
            s.setCourse(newCourse);
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    public void deleteStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student Not Found!");
        }
    }
}
