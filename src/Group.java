import java.util.ArrayList;
import java.util.List;

public class Group{
    private Student headman;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    Group(Student studentHeadman){
        this.headman = studentHeadman;
        students.add(studentHeadman);
    }

    public void addStudent(Student student){
        students.add(student);
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
