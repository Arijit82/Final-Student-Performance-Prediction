/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.Student.PredictedOutput;

/**
 *
 * @author sanji
 */
public class PredictedOutputBean {
    private int poid;
    private int stdid;
    private String stdname;
    private String parname;
    private double regout;
    private String idout;

    public PredictedOutputBean(){
        
    }

    public PredictedOutputBean( int stdid, String stdname, String parname, double regout, String idout) {
      //  this.poid = poid;
        this.stdid = stdid;
        this.stdname = stdname;
        this.parname = parname;
        this.regout = regout;
        this.idout = idout;
    }
    
  

    /**
     * @return the poid
     */
    public int getPoid() {
        return poid;
    }

    /**
     * @param poid the poid to set
     */
    public void setPoid(int poid) {
        this.poid = poid;
    }

    /**
     * @return the stdid
     */
    public int getStdid() {
        return stdid;
    }

    /**
     * @param stdid the stdid to set
     */
    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    /**
     * @return the regout
     */
    public double getRegout() {
        return regout;
    }

    /**
     * @param regout the regout to set
     */
    public void setRegout(double regout) {
        this.regout = regout;
    }

    /**
     * @return the idout
     */
    public String getIdout() {
        return idout;
    }

    /**
     * @param idout the idout to set
     */
    public void setIdout(String idout) {
        this.idout = idout;
    }

    /**
     * @return the stdname
     */
    public String getStdname() {
        return stdname;
    }

    /**
     * @param stdname the stdname to set
     */
    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    /**
     * @return the parname
     */
    public String getParname() {
        return parname;
    }

    /**
     * @param parname the parname to set
     */
    public void setParname(String parname) {
        this.parname = parname;
    }
    
    
    
}
