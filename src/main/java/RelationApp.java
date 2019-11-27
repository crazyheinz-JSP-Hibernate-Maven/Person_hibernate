import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RelationApp {

    //one to one relatie

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();

        MedicalFile medicalFile = new MedicalFile();
        medicalFile.setHeight(180);
        medicalFile.setWeight(280);
        /**

        Patient patient = new Patient();
        patient.setName("Hannes");
        patient.setMedicalFile(medicalFile);

         */

        Patient patient = em.find(Patient.class,1L);
        //em.remove(patient);



        medicalFile.setPatient(patient);

        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        em.persist(patient);
        em.persist(medicalFile);
        entityTransaction.commit();
        emf.close();
    }
}
