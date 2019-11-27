import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class PersonApp {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();

        em.persist(new Person(1, "Hannes","De Backer", LocalDate.of(1988,10,29),
                GenderType.MALE, null, "toffe kerel", true, 32, "www.hannesdebacker.be"));
        entityTransaction.commit();
        emf.close();

        Person person = new Person();
        person.setAge(32);
        person.setBirthDay(LocalDate.of(1988,10,29));





    }
}
