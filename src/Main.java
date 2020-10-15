package src;

import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {

    Patient patient_1 = new Pastient()
    patient_1.id = "id1929476240";
    patient_1.name = "Mark";
    patient_1.age = 20;
    patient_1.height = 1.98;
    patient_1.days_in_hospital = 20;
    patient_1.conditions = 5;

    System.out.println(patient_1.id + " " + patient_1.name + " " + patient_1.age + " " + patient_1.height + " " + patient_1.days_in_hospital + " " + patient_1.get_conditions(patient_1.conditions));
  }
}