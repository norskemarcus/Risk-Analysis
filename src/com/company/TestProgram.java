package com.company;

public class TestProgram {


  public void mainMenu(){

    // Hardcoded risks
    Risk risk1 = new Risk("Risk number 1", 1, 1);
    Risk risk2 = new Risk("Risk number 2", 1, 2);
    Risk risk3 = new Risk("Risk number 3", 2, 2);
    Risk risk4 = new Risk("Risk number 4", 3, 2);
    Risk risk5 = new Risk("Risk number 5", 3, 3);
    Risk risk6 = new Risk("Risk number 6", 4, 4);
    Risk risk7 = new Risk("Risk number 7", 4, 5);
    Risk risk8 = new Risk("Risk number 8", 5, 5);

    Risk[] risks = {risk1, risk2, risk3, risk4, risk5, risk6, risk7, risk8};

    new RiskAnalysis().displayRiskAnalysis(risks);

  }




    public static void main(String[] args) {

      new TestProgram().mainMenu();


    }
}
