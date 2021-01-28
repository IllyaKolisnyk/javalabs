package validator;
import builder.*;
import builder.EmployeeBuilder;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.xml.validation.Validator;
import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EmployeeBuilder em1 = new EmployeeBuilder().setLastname("Kolisnyk").setFirstname("Illya").setBirthday(LocalDate.parse("01/08/1999"));
        EmployeeBuilder em2 = new EmployeeBuilder().setLastname("Valentyn").setFirstname("Moch").setBirthday(LocalDate.parse("12/08/1999"));

        Validator validator = (Validator) Validation.buildDefaultValidatorFactory().getValidator();
        Employee em = new Employee("Zag", "Emma", Position.DRESSER, LocalDate.parse("25/08/2000"));
        Set<ConstraintViolation<Employee>> constraintViolations = validator.validate(em);

        for(ConstraintViolation constraintViolation : constraintViolations) {
            String fieldName = constraintViolation.getPropertyPath().toString().toUpperCase();
            System.out.println(fieldName + " " + constraintViolation.getMessage());
        }

    }
}
