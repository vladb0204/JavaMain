package src;

class Patient {

  public String patient_id;
  public String name;
  public int age;
  public float height;
  public int days_in_hospital;
  public int conditions;

  public static String get_conditions(String conditions) {
    this.conditions = conditions;
    switch (conditions) {
      case 0:
        return "Very bad";
        break;
      case 1:
        return "Bad";
        break;
      case 2:
        return "Fine";
        break;
      case 3:
        return "Good";
        break;
      case 4:
        return "Very good";
        break;
      case 5:
        return "Excellent";
        break;
    }
  }
}