public class Main {

    public static void main(String[] args) {
        Student studentOne = new Student("Ivan", "Ivanov");
        Student studentTwo = new Student("Petro", "Petrov");
        Student studentThree = new Student("Bob", "Bobster");
        //set up Head Man
        Group groupOfStudents = new Group(studentOne);
        //adding students to the list of students
        groupOfStudents.addStudent(studentTwo);
        // Change of Head man
        groupOfStudents.changeHeadman(studentThree);
        // Remove student from list
        groupOfStudents.removeStudent(studentOne);
        // Rename student
        groupOfStudents.renameStudent(2,"Alex","Test");
        // Addition of task to tasks list
        groupOfStudents.addTask("Позначити зроблене");


    }

}
