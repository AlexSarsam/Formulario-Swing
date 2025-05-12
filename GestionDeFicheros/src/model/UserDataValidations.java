package model;

import model.exceptions.EmptyFieldException;
import model.exceptions.InvalidEmailException;

public class UserDataValidations {

    public static void validateName(String name) throws EmptyFieldException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyFieldException("El nombre no puede estar vacío.");
        }
    }

    public static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("El correo electrónico no es válido.");
        }
    }
}
