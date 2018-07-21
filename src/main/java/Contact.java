

import org.joda.time.LocalDate;
import org.joda.time.Years;
import java.time.Period;
import java.util.Date;


public class Contact {

    private String name;
    private String surname;
    private LocalDate dateofbirth;
    private Long homephone;
    private Long cellphone;
    private Gender gender;






    private String email;
    private String [] jobarea;


    public Contact(String name, String surname, LocalDate dateofbirth, Long homephone, Long cellphone, String email, String[] jobarea,
                   Gender gender) {
        this.name = name;
        this.surname = surname;
        this.dateofbirth=dateofbirth;
        this.homephone = homephone;
        this.cellphone = cellphone;
        this.email = email;
        this.jobarea = jobarea;
        this.gender=gender;


    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSurname() {

        return surname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public Long getHomephone() {
        return homephone;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public String[] getJobarea() {
        return jobarea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setHomephone(Long homephone) {
        this.homephone = homephone;
    }

    public void setCellphone(Long cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobarea(String[] jobarea) {
        this.jobarea = jobarea;
    }

    public int calculateAge(LocalDate birthDate) {
        LocalDate currentDate=LocalDate.now();
        Years diff = Years.yearsBetween(birthDate, currentDate);
        int age=diff.getYears();
        return age;
    }
}
