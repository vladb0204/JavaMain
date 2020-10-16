public class Hospital_1 extends Patient {

  public String patient_id;
  public String name;
  public int age;
  public double height;
  public int days_in_hospital;

  public Hospital_1(String patient_id, String name, int age, double height, int days_in_hospital) {
    
    this.set_id(patient_id);
    this.name = name;
    this.age = age;
    this.height = height;
    this.days_in_hospital = days_in_hospital;

  }
}