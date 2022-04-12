package com.company;

public class TestProgram {


  public void mainMenu(){

    // Hardcoded risks
    Risk risk1 = new Risk("Risk number 1", 1, 1);
    Risk risk2 = new Risk("Risk number 2", 1, 2);
    Risk risk3 = new Risk("Risk number 3", 3, 2);
    Risk risk4 = new Risk("Risk number 4", 3, 2);
    Risk risk5 = new Risk("Risk number 5", 3, 4);
    Risk risk6 = new Risk("Risk number 6", 3, 4);
    Risk risk7 = new Risk("Risk number 7", 4, 4);
    Risk risk8 = new Risk("Risk number 8", 4, 4);
    Risk risk9 = new Risk("Risk number 9", 5, 5);
    Risk risk10 = new Risk("Risk number 10", 5, 5);
    Risk risk11 = new Risk("Risk number 11", 5, 5);
    Risk risk12 = new Risk("Risk number 12", 5, 5);


    // Add risk into an array:
    Risk[] risks = {risk1, risk2, risk3, risk4, risk5, risk6, risk7, risk8, risk9, risk10, risk11, risk12};

    // Instantiate RiskAnalysis with the array risks:
    new RiskAnalysis().displayRiskAnalysis(risks);
  }


    public static void main(String[] args) {

      new TestProgram().mainMenu();

    }
}
