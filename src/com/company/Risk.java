package com.company;

public class Risk {

  private String name;
  private int probability;
  private int consequence;
  private int severity;


  public Risk(String name, int probability, int consequence){
    this.name = name;
    this.probability= probability;
    this.consequence = consequence;
    severity = probability * consequence;
  }


  public String getName() {
    return name;
  }


  public int getProbability() {
    return probability;
  }


  public int getConsequence() {
    return consequence;
  }

  public int getSeverity() {
    return severity;
  }
}

