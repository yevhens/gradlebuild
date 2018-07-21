import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

public class Main {

   public static void main(String[] args) {

      Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1956,6,17),445678999L,
              675677878L,"hjhj@mail.ru",new JobArea[]{JobArea.AGRICULTURE,JobArea.PRODUCTION},Gender.MALE);

      System.out.println(contact.calculateAge());



   }




}
