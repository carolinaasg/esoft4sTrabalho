package Projeto2020.Trabalho;

import javax.management.RuntimeErrorException;

public class cpf {

        private String cpf;

    public cpf (String cpf)
    {
        if (!CPF(cpf)) {
            throw new RuntimeException("Cpf invalido!");
        }
        this.cpf = cpf;
    }

public static boolean CPF(String CPF ){ 
        
    if (CPF.equals("00000000000") ||
        CPF.equals("11111111111") ||
        CPF.equals("22222222222") || CPF.equals("33333333333") ||
        CPF.equals("44444444444") || CPF.equals("55555555555") ||
        CPF.equals("66666666666") || CPF.equals("77777777777") ||
        CPF.equals("88888888888") || CPF.equals("99999999999") ||
        (CPF.length() != 11))
        return(false);

    char dig10, dig11;
    int a, i, r, num, peso;

   
        a = 0;
        peso = 10;
        for (i=0; i<9; i++) {
   
        num = (int)(CPF.charAt(i) - 48);
        a = a + (num * peso);
        peso = peso - 1;
        }

        r = 11 - (a % 11);
        if ((r == 10) || (r == 11))
            dig10 = '0';
        else dig10 = (char)(r + 48); 

        a = 0;
        peso = 11;
        for(i=0; i<10; i++) {
        num = (int)(CPF.charAt(i) - 48);
        a = a + (num * peso);
        peso = peso - 1;
        }

        r = 11 - (a % 11);
        if ((r == 10) || (r == 11))
             dig11 = '0';
        else dig11 = (char)(r + 48);

        if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
             return(true);
        else return(false);
     
    }

    public static String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    @Override
    public String toString() {
    return " " + cpf + " "; 
    }
}