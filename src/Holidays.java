public class Holidays {

  public void list(Holiday[] holidays) {
    for (Holiday i : holidays) {
      System.out.println(i.getDate() + ": " + i.getName());
    }
  }
}
