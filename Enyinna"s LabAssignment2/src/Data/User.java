/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Enyinna
 */
public class User {
    public static void main(String[] args) {
        Date startDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/DD/Y");
        System.out.println(dateForm.format(startDate));
    }
    String name;
    long employeeID;
    int age;
    String gender;
    Date startDate;
    int level;
    long cellPhoneNumber;
    String emailaddress;
    Icon photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
}
