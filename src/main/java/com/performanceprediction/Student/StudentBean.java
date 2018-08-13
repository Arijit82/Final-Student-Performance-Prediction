/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student;

/**
 *
 * @author sanji
 */
public class StudentBean {

    private int student_id;
    private String studentname;
    private String Address;
    private String Gender;
    private String dob;
    private int age;
    private String doa;

    private String parentName;
    private String email;
    private String phoneNo;
    private int medu;
    private int fedu;
    
    private boolean more;

    public StudentBean() {
    }    

    public StudentBean(int student_id, String studentname, String Address, String Gender, String dob, int age, String doa, 
            String parentName, String email, String phoneNo, int medu, int fedu) {
        this.student_id = student_id;
        this.studentname = studentname;
        this.Address = Address;
        this.Gender = Gender;
        this.dob = dob;
        this.age = age;
        this.doa = doa;
        this.parentName = parentName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.medu = medu;
        this.fedu = fedu;
    }

    /**
     * @return the student_id
     */
    public int getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the studentname
     */
    public String getStudentname() {
        return studentname;
    }

    /**
     * @param studentname the studentname to set
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the doa
     */
    public String getDoa() {
        return doa;
    }

    /**
     * @param doa the doa to set
     */
    public void setDoa(String doa) {
        this.doa = doa;
    }

    /**
     * @return the parentName
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * @param parentName the parentName to set
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the medu
     */
    public int getMedu() {
        return medu;
    }

    /**
     * @param medu the medu to set
     */
    public void setMedu(int medu) {
        this.medu = medu;
    }

    /**
     * @return the fedu
     */
    public int getFedu() {
        return fedu;
    }

    /**
     * @param fedu the fedu to set
     */
    public void setFedu(int fedu) {
        this.fedu = fedu;
    }

    /**
     * @return the more
     */
    public boolean isMore() {
        return more;
    }

    /**
     * @param more the more to set
     */
    public void setMore(boolean more) {
        this.more = more;
    }
        

}
