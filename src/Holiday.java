public class Holiday {

  private String date;
  private String name;

  Holiday(String date, String name) {
    this.date = date;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getDate() {
    return date;
  }
}
