package Clase2.PracticaTT.Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSimple extends Password{

    @Override
    public void setValue(String pwd){
        //Al menos un numero
        //Sin espacios en blanco
        //Al menos 8 caracteres
        String regex = "^(?=.*[0-9])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if(matcher.matches())
            super.setPwd(pwd);
        else
            throw new IllegalArgumentException("Por favor ingresa una contraseña mas segura\n"+
                    "Debe tener al menos 8 caracteres, sin espaacios en blanco y al menos un "+
                    "numero");

    }

}