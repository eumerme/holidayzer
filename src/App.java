import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Holiday[] holidays = new Holiday[] {
      new Holiday("01/01/2023", "Confraternização mundial"),
      new Holiday("21/02/2023", "Carnaval"),
      new Holiday("17/04/2023", "Páscoa"),
      new Holiday("21/04/2023", "Tiradentes"),
      new Holiday("01/05/2023", "Dia do trabalho"),
      new Holiday("08/06/2023", "Corpus Christi"),
      new Holiday("07/09/2023", "Independência do Brasil"),
      new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
      new Holiday("02/11/2023", "Finados"),
      new Holiday("15/11/2023", "Proclamação da República"),
      new Holiday("25/12/2023", "Natal"),
    };

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma data (dd/mm/aaaa): ");
    String date = scanner.next();
    // System.out.println(new IsHoliday().compare(holidays, date));

    // new Holidays().list(holidays);
  }
}
