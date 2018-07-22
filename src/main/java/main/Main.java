package main;

import entity.Contact;
import entity.Gender;
import entity.JobArea;
import entity.Product;

public class Main {

   public static void main(String[] args) {

      Contact contact=new Contact("Andrey","Baldis",new org.joda.time.LocalDate(1956,6,17),445678999L,
              675677878L,Gender.MALE,"kjhjhjk@mail.ru",new JobArea[]{JobArea.AGRICULTURE,JobArea.PRODUCTION},
              new Product("технический углерод","ГОСТ-2234",144));

      System.out.println(contact.calculateAge());



   }




}
