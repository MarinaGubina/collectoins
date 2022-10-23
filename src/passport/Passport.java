package passport;

import java.time.LocalDate;

public class Passport {

    private int passportNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private int dateOfBirth;

    public Passport(int passportNumber, String firstName, String lastName, String middleName,int dateOfBirth) {
        if(passportNumber <= 0){
            throw new RuntimeException("Введите номер паспорта");
        }
        else {
            this.passportNumber = passportNumber;
        }
        if(isNullOrEmpty(firstName)){
            throw new RuntimeException("Введите имя");
        }
        else {
            this.firstName = firstName;
        }
        if (isNullOrEmpty(lastName)) {
            throw new RuntimeException("Введите фамилию");
        }
        else{
            this.lastName = lastName;
        }
        this.middleName = middleName;
        if(dateOfBirth <= 1900 || dateOfBirth > LocalDate.now().getYear()){
            throw new RuntimeException("Введите дату рождения");
        }
        else{
            this.dateOfBirth = dateOfBirth;
        }
    }

    public Passport(int passportNumber, String firstName, String lastName, int dateOfBirth) {
        this.passportNumber = passportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber=" + passportNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
