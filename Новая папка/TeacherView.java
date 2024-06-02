import java.util.List;

public class TeacherView {
    public void displayTeacher(Teacher teacher) {
        System.out.println("ID: " + teacher.getId() + ", Имя: " + teacher.getName() + ", Предмет: " + teacher.getSubject());
    }

    public void displayAllTeachers(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            displayTeacher(teacher);
        }
    }
}
