import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void getAge() {

        LocalDate currentdate=LocalDate.now();

        Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1982,6,17),445678999L,
                675677878L,"hjhj@mail.ru",new String[]{"agro","production"},Gender.MALE);
        int agecalcualted= contact.calculateAge(contact.getDateofbirth());
        int age=36;
        assertEquals(agecalcualted,age);

    }


    @Test
    public void getGender() {
        Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1982,6,17),445678999L,
                675677878L,"hjhj@mail.ru",new String[]{"agro","production"},Gender.MALE);
        Gender gender=Gender.MALE;
        assertEquals(gender,contact.getGender());

    }
}