/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Parent;

/**
 *
 * @author sanji
 */
public class ParentInputBean {

    private  int student_id;
    private int famsize;
    private int pstatus;
    private int traveltime;
    private int studytime;
    private int failures;
    private int schoolsup;
    private int famsup;
    private int paid;
    private int internet;
    private int famrel;
    private int freetime;
    private int goout;
    private int health;
    

    public ParentInputBean() {

    }

    public ParentInputBean(int student_id, int famsize, int pstatus, int traveltime, int studytime, int failures, int schoolsup,
            int famsup, int paid, int internet, int famrel,int freetime, int goout, int health) {
      this.student_id =student_id;
        this.famsize = famsize;
        this.pstatus = pstatus;
        this.traveltime = traveltime;
        this.studytime = studytime;
        this.failures = failures;
        this.schoolsup = schoolsup;
        this.famsup = famsup;
        this.paid = paid;
        this.internet = internet;
        this.famrel = famrel;
        this.freetime =freetime;
        this.goout = goout;
        this.health = health;
        
       
    }

    /**
     * @return the famsize
     */
    public int getFamsize() {
        return famsize;
    }

    /**
     * @param famsize the famsize to set
     */
    public void setFamsize(int famsize) {
        this.famsize = famsize;
    }

    /**
     * @return the pstatus
     */
    public int getPstatus() {
        return pstatus;
    }

    /**
     * @param pstatus the pstatus to set
     */
    public void setPstatus(int pstatus) {
        this.pstatus = pstatus;
    }

    /**
     * @return the traveltime
     */
    public int getTraveltime() {
        return traveltime;
    }

    /**
     * @param traveltime the traveltime to set
     */
    public void setTraveltime(int traveltime) {
        this.traveltime = traveltime;
    }

    /**
     * @return the studytime
     */
    public int getStudytime() {
        return studytime;
    }

    /**
     * @param studytime the studytime to set
     */
    public void setStudytime(int studytime) {
        this.studytime = studytime;
    }

    /**
     * @return the failures
     */
    public int getFailures() {
        return failures;
    }

    /**
     * @param failures the failures to set
     */
    public void setFailures(int failures) {
        this.failures = failures;
    }

    /**
     * @return the schoolsup
     */
    public int getSchoolsup() {
        return schoolsup;
    }

    /**
     * @param schoolsup the schoolsup to set
     */
    public void setSchoolsup(int schoolsup) {
        this.schoolsup = schoolsup;
    }

    /**
     * @return the famsup
     */
    public int getFamsup() {
        return famsup;
    }

    /**
     * @param famsup the famsup to set
     */
    public void setFamsup(int famsup) {
        this.famsup = famsup;
    }

    /**
     * @return the paid
     */
    public int getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(int paid) {
        this.paid = paid;
    }

    /**
     * @return the internet
     */
    public int getInternet() {
        return internet;
    }

    /**
     * @param internet the internet to set
     */
    public void setInternet(int internet) {
        this.internet = internet;
    }

    /**
     * @return the famrel
     */
    public int getFamrel() {
        return famrel;
    }

    /**
     * @param famrel the famrel to set
     */
    public void setFamrel(int famrel) {
        this.famrel = famrel;
    }

    /**
     * @return the goout
     */
    public int getGoout() {
        return goout;
    }

    /**
     * @param goout the goout to set
     */
    public void setGoout(int goout) {
        this.goout = goout;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the freetime
     */
    public int getFreetime() {
        return freetime;
    }

    /**
     * @param freetime the freetime to set
     */
    public void setFreetime(int freetime) {
        this.freetime = freetime;
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

  

}
