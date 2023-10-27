import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Самсонова");
        Student student2 = new Student(2, "Егоров");
        Student student3 = new Student(3, "Романова");
        Teacher teacher = new Teacher(101, "преподаватель Иванов");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        StudyGroup studyGroup = controller.createStudyGroupWithTeacherAndStudents(teacher, students);

        System.out.println();
        System.out.println("Учебная группа с преподавателем: " + studyGroup.getTeacher().getName());
        System.out.println();
        System.out.println("Студенты в группе:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName());
        }
    }
}