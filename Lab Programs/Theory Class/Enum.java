
public class Enum {

    enum Day {
        SUNDAY("Holiday"), MONDAY("WorkDay");

        String type;

        Day(String type_in) {
            this.type = type_in;
        }

        public String getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today.getType());
    }
}
