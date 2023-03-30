import java.util.Objects;

public class IsHoliday {

  public String compare(Holiday[] holidays, String date) {
    for (Holiday i : holidays) {
      boolean isEqual = Objects.equals(date, i.getDate());
      if (isEqual) {
        return "Essa data é referente ao feriado de: " + i.getName();
      }
    }
    return "Essa data não corresponde a nenhum feriado cadastrado";
  }
}
