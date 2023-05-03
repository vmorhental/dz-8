import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group{
    private Student headman;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();
    private final Map<String, List<Student>> mapOfStudentsCompletedTasks = new HashMap<>();

    Group(Student studentHeadman){
        this.headman = studentHeadman;
        students.add(studentHeadman);
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void addTaskCompleted(String task, Student student) {
        List<Student> studentsCompletedTask = this.mapOfStudentsCompletedTasks.get(task);
        studentsCompletedTask.add(student);

    }

    public void removeStudent(Student student){
        students.remove(student);
    }
    public void renameStudent(int id, String name, String surname) {
        for (Student student : students) {
            if (student.getId()== id) {
                student.setName(name);
                student.setSurname(surname);
            }
        }
    }

    public void changeHeadman(Student student){
        headman = student;
        students.add(student);
    }
    public void addTask(String task){
        tasks.add(task);
        mapOfStudentsCompletedTasks.put(task, new ArrayList<>());
    }

    public Student getHeadman() {
        return headman;
    }

    public void setHeadman(Student headman) {
        this.headman = headman;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }
}
