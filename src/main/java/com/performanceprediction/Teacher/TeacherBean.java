/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Teacher;


/**
 *
 * @author sanji
 */
public class TeacherBean {
    private int teacherid;
    private String fullname;
    private String address;
    private String contact;
    private String email;
    private String assignedsubject;
    private String tpassword;
    private String role;

    public  TeacherBean()
    {
        
    }

    public TeacherBean(int teacherid, String fullname, String address, String contact, String email, String assignedsubject, String tpassword, String role) {
        this.teacherid = teacherid;
        this.fullname = fullname;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.assignedsubject = assignedsubject;
        this.tpassword = tpassword;
        this.role = role;
    }

 

    /**
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * @return the assignedsubject
     */
    public String getAssignedsubject() {
        return assignedsubject;
    }

    /**
     * @param assignedsubject the assignedsubject to set
     */
    public void setAssignedsubject(String assignedsubject) {
        this.assignedsubject = assignedsubject;
    }

    /**
     * @return the tpassword
     */
    public String getTpassword() {
        return tpassword;
    }

    /**
     * @param tpassword the tpassword to set
     */
    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the teacherid
     */
    public int getTeacherid() {
        return teacherid;
    }

    /**
     * @param teacherid the teacherid to set
     */
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }
   
    
}
