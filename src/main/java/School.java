import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class School {


    @Id
    @GeneratedValue //zodat er een nieuwe value wordt gegenereerd
    private long id;
    private String name;

    @OneToMany
    private List<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }

    public School setName(String name) {
        this.name = name;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public School setStudents(List<Student> students) {
        this.students = students;
        return this;
    }
}
