package Clase2.PracticaTT.Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordFuerte extends Password{

    @Override
    public void setValue(String pwd){
        // Al menos un numero
        // Al menos una minuscula
        // Al menos una mayuscula
        // Al menos un caracter especial
        // Al menos 8 caracteres
        // Sin espacios en blanco
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.!@#&()–{}:;',?/*~$^+=<>])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if(matcher.matches())
            super.setPwd(pwd);
        else
            throw new IllegalArgumentException("Por favor ingresa una contraseña mas segura\n"+
                    "Debe tener al menos 8 caracteres sn espacios en blanco, al menos un "+
                    "numero, una minuscula, una mayuscula y un caracter especial");

    }
}
