import entity.Contact;
import entity.Gender;
import entity.JobArea;
import entity.Product;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void getAge() {

        LocalDate currentdate=LocalDate.now();

        Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1956,6,17),445678999L,
                675677878L,Gender.MALE,"kjhjhjk@mail.ru",new JobArea[]{JobArea.AGRICULTURE,JobArea.PRODUCTION},
                new Product("технический углерод","ГОСТ-2234",144));
        int agecalcualted= contact.calculateAge();
        int age=62;
        assertEquals(agecalcualted,age);

    }


    @Test
    public void getGender() {
        Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1956,6,17),445678999L,
                675677878L,Gender.MALE,"kjhjhjk@mail.ru",new JobArea[]{JobArea.AGRICULTURE,JobArea.PRODUCTION},
                new Product("технический углерод","ГОСТ-2234",144));
        Gender gender=Gender.MALE;
        assertEquals(gender,contact.getGender());

    }


    @Test
    public void getJobarea() {
        Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1956,6,17),445678999L,
                675677878L,Gender.MALE,"kjhjhjk@mail.ru",new JobArea[]{JobArea.AGRICULTURE,JobArea.PRODUCTION},
                new Product("технический углерод","ГОСТ-2234",144));
        JobArea [] jobArea=new JobArea[] {JobArea.AGRICULTURE,JobArea.PRODUCTION};
        assertArrayEquals(jobArea,contact.getJobarea());



    }
}