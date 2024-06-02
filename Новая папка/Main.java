public class Main {
    public static void main(String[] args) {
        // Создание экземпляров сервисов и видов
        TeacherService service = new TeacherService();
        TeacherView view = new TeacherView();
        TeacherController controller = new TeacherController(service, view);

        // Добавление учителей
        controller.addTeacher(new Teacher(1, "Иван Иванов", "Математика"));
        controller.addTeacher(new Teacher(2, "Мария Петрова", "Физика"));

        // Отображение всех учителей
        controller.displayAllTeachers();

        // Редактирование учителя
        controller.editTeacher(1, new Teacher(1, "Иван Иванович", "Информатика"));

        // Отображение конкретного учителя
        controller.displayTeacher(1);

        // Отображение всех учителей после редактирования
        controller.displayAllTeachers();
    }
}
