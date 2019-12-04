package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Teacher;

import java.util.Date;

public class TeacherDto {
    private String id;

    private String name,address, phoneNumber,email;

    private Date birthDate;

    private String degreeType;

    public TeacherDto(){

    }

    public TeacherDto(String id, String name, String address, String phoneNumber, String email, Date birthDate, String degreeType) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.degreeType = degreeType;
    }

    public TeacherDto(Teacher teacher){
        this.id=teacher.getId();
        this.name=teacher.getName();
        this.address=teacher.getAddress();
        this.phoneNumber=teacher.getPhoneNumber();
        this.email=teacher.getEmail();
        this.birthDate=teacher.getBirthDate();
        this.degreeType=teacher.getDegreeType();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    @Override
    public String toString() {
        return "TeacherDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", degreeType='" + degreeType + '\'' +
                '}';
    }
}
