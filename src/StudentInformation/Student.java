/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInformation;

import util.MyToys;



/**
 *
 * @author admin
 */
public class Student {

    private String lastName;
    private String firstName;
    private int yearOfBirth;
    private String addressHome;
    private String phoneNumber;
    private String email;
    private String major;
    private double GPA;
    private String id;
    private String className;

    public Student(String lastName, String firstName, int yearOfBirth, String addressHome, String phoneNumber, String email, String major, double GPA, String id, String className) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.addressHome = addressHome;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.major = major;
        this.GPA = GPA;
        this.id = id;
        this.className = className;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddressHome() {
        return addressHome;
    }

    public void setAddressHome(String addressHome) {
        this.addressHome = addressHome;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullName() {
        return this.lastName + " " + this.firstName;
    }


    public int getDayOfBirth() {
        return MyToys.getCurrentYear() - this.yearOfBirth;
    }






    public void showProfiles() {
        System.out.printf("-%15s|-%7s|-%4s|-%5s|-%4.1f|-%10s|-%30s|\n"
        , getFullName(),className, major, id, GPA, phoneNumber, email);
    }

}
