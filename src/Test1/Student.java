package Test1;

public class Student {
    String name;
    String surnmae;
    int age;
    int course;

    public Student(String name, String surname, int age, int course) {
        this.name = name;
        this.surnmae = surname;
        this.age = age;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Sudent{" +
                "name='" + name + '\'' +
                ", surnmae='" + surnmae + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnmae() {
        return surnmae;
    }

    public void setSurnmae(String surnmae) {
        this.surnmae = surnmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
