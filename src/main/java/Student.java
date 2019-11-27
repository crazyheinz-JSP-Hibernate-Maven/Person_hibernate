import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    @ManyToOne
    private School school;

    public School getSchool() {
        return school;
    }

    public Student setSchool(School school) {
        this.school = school;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
