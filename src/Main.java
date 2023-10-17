
import java.util.ArrayList;
import model.Student;
import repository.StudentRepository;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        StudentRepository sr = new StudentRepository();

        sr.addStudent(list);
        sr.display(list);

    }
}
