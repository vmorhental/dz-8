public class Student {
    private static int baseId = 0;
    private int id;
    private String name;
    private String surname;

    Student(String name, String surname) {
        this.surname = surname;
        this.name = name;
        baseId++;
        this.id = baseId;
    }

    public int getBaseId() {
        return baseId;
    }

    public static void setBaseId(int baseId) {
        Student.baseId = baseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
