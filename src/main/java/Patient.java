import javax.persistence.*;

@Entity
@Table(name = "Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    private MedicalFile medicalFile;

    public Patient() {
    }

    public Patient(String name, MedicalFile medicalFile) {
        this.name = name;
        this.medicalFile = medicalFile;
    }

    public long getId() {
        return id;
    }

    public Patient setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public Patient setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
        return this;
    }
}
