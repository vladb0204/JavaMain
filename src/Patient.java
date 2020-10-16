public class Patient {

  public String patient_id;
  public String name;
  public int age;
  public double height;
  public int days_in_hospital;
  public int conditions;

  public String get_id() {
    return this.patient_id;
  }

  public String get_conditions() {
    String[] types = {"Very bad", "Bad", "Intermediate", "Fine", "Good", "Very good"};
    return types[this.conditions];
  }

  public void set_id(String patient_id) {
    this.patient_id = patient_id;
  }

  public void set_conditions(int conditions) {
    this.conditions = conditions;
  }

}