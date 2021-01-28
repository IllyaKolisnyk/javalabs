package main;

import classesLab5.Employee;
import connect.ConnectToBD;
import classesLab5.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee.Builder().setLastName("Illya").setFirstName("Kol").setPosition(Position.SINGER).setBirthday(LocalDate.of(1999,8,1));
        Employee em2 = new Employee.Builder().setLastName("Valentyn").setFirstName("Moch").setPosition(Position.SINGER).setBirthday(LocalDate.of(1999,8,12));

        ConnectToBD ob = new ConnectToBD();
        ob.conn();


    }
}

