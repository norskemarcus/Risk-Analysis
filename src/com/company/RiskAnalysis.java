package com.company;


import java.util.Random;

public class RiskAnalysis {

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";



  public void displayRiskAnalysis(Risk[] risks) {
    System.out.println("No.  Risk name \t\t Pro  Con\tSev\t Level");

    for (int i = 0; i < risks.length; i++) {

      String name = risks[i].getName();
      int probability = risks[i].getProbability();
      int consequence = risks[i].getConsequence();
      int severity = risks[i].getSeverity();

      // # - no. - name - pro - con - sev - level
      System.out.printf("#%2d %3s\t %d \t %2d \t%2d", i+1, name, probability, consequence, severity);
      int degreeOfSeverity = risks[i].getSeverity();
      displaySeverityLevel(degreeOfSeverity);
      System.out.println("");
    }
  }

    public void displaySeverityLevel(int degreeOfSeverity) {
      if (degreeOfSeverity < 5) {
        System.out.print("\t" + ANSI_GREEN + " Very_Low" + ANSI_RESET);
      } else if (degreeOfSeverity >= 5 && degreeOfSeverity < 10) {
        System.out.print("\t" + ANSI_GREEN + " Low" + ANSI_RESET);
      } else if (degreeOfSeverity >= 10 && degreeOfSeverity < 15) {
        System.out.print("\t" + ANSI_YELLOW + " Medium" + ANSI_RESET);
      } else if (degreeOfSeverity >= 15 && degreeOfSeverity < 20) {
        System.out.print("\t" + ANSI_RED + " High" + ANSI_RESET);
      } else {
        System.out.print("\t" + ANSI_RED + " Very_High" + ANSI_RESET);
      }




}


}
