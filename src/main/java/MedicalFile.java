import javax.persistence.*;

@Entity
public class MedicalFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "height")
    private float height;

    @Column(name = "weight")
    private float weight;

    @OneToOne(mappedBy = "medicalFile")
    private Patient patient;

    public MedicalFile() {
    }

    public MedicalFile(float height, float weight, Patient patient) {
        this.height = height;
        this.weight = weight;
        this.patient = patient;
    }

    public long getId() {
        return id;
    }

    public MedicalFile setId(long id) {
        this.id = id;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public MedicalFile setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public MedicalFile setWeight(float weight) {
        this.weight = weight;
        return this;
    }

    public Patient getPatient() {
        return patient;
    }

    public MedicalFile setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }
}
