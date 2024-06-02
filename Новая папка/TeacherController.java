public class TeacherController {
    private TeacherService service;
    private TeacherView view;

    public TeacherController(TeacherService service, TeacherView view) {
        this.service = service;
        this.view = view;
    }

    public void addTeacher(Teacher teacher) {
        service.addTeacher(teacher);
    }

    public void editTeacher(int teacherId, Teacher newTeacherData) {
        boolean success = service.editTeacher(teacherId, newTeacherData);
        if (success) {
            System.out.println("Учитель успешно отредактирован.");
        } else {
            System.out.println("Учитель не найден.");
        }
    }

    public void displayAllTeachers() {
        view.displayAllTeachers(service.getAllTeachers());
    }

    public void displayTeacher(int teacherId) {
        Teacher teacher = service.getTeacherById(teacherId);
        if (teacher != null) {
            view.displayTeacher(teacher);
        } else {
            System.out.println("Учитель не найден.");
        }
    }
}
