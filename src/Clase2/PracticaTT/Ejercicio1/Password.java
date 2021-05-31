package Clase2.PracticaTT.Ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String value;
    private String regex;

    public Password(){}
    public Password(String regex){
        this.regex = regex;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String pwd) {
        //Al menos una minuscula
        regex = ".*[a-z]+.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if(matcher.matches())
            value = pwd;
        else
            throw new IllegalArgumentException("Por favor ingresa una contraseña mas segura\n"+
                    "Debe tener al menos una minuscula");
    }

    // Ya chequie si cumple con la exp reg
    public void setPwd(String pwd){
        value = pwd;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
