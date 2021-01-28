package lab1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee.Builder().setLastName("Illya").setFirstName("Kol").setPosition(Position.SINGER).setBirthday(LocalDate.of(1999,8,1));
        Employee em2 = new Employee.Builder().setLastName("Valenntyn").setFirstName("Moch").setPosition(Position.SINGER).setBirthday(LocalDate.of(1999,12,8));



    }
}

