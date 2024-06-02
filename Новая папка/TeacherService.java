import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean editTeacher(int teacherId, Teacher newTeacherData) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == teacherId) {
                teacher.setName(newTeacherData.getName());
                teacher.setSubject(newTeacherData.getSubject());
                return true;
            }
        }
        return false;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public Teacher getTeacherById(int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }
}
