/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.performanceprediction.LinearRegression;

/**
 *
 * @author sanji
 */
public class LinearRegression {

    
    public  double  LRpredictedvalue(int id){
          Observation[] inputVectors = FileHandler.read("R:\\WorkPlace\\New folder\\PerformancePrediction\\src\\main\\java\\com\\performanceprediction\\LinearRegression\\student_mat_dataset.csv");

        //    ParametersCoef pcof = new ParametersCoef();
        // Fits the model predicting the feature compressivestrength using gradient descent.        
        double alpha = 0.0001;
         System.out.println("\n\nFitting model using gradient descent, alpha = " + alpha + " ...");
        System.out.println("*************************************************************************\n");
        Model gradientFit = Fit.gradientDescent(inputVectors, "g3", 0.0001);
      //  System.out.println(gradientFit.toString());
        double predictedvalue = gradientFit.predictedValue(id);
         return predictedvalue;
    }
    
}
