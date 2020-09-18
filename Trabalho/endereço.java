package Projeto2020.Trabalho;

import javax.management.RuntimeErrorException;

public class endereço {
            private String estado;
            private String cidade;
            private String logradouro;
            private String numero; 


    public endereço (String estado, String cidade, String logradouro, String numero) {
            setEstado(estado);
            setCidade(cidade);
            setLogradouro(logradouro);
            setNumero(numero);    
    }

    public void setEstado(String estado) {
            if ((estado.length()< 2 )||(estado.length()>30))
                throw new IllegalArgumentException("Digite o nome do seu estado! " );
            else 
            this.estado = estado;
    }

    public void setCidade(String cidade) {
            if ((cidade.length()< 2 )||(cidade.length()>40))
                throw new IllegalArgumentException("Digite o nome da sua cidade! " );
            else 
            this.cidade = cidade;
    }

    public void setLogradouro(String logradouro) {
            if ((logradouro.length()< 2 )||(logradouro.length()>50))
                throw new IllegalArgumentException("Digite o logradouro! " );
            else 
            this.logradouro = logradouro;
    }
    public void setNumero(String numero ) {
            if ((numero.length()< 1 )||(numero.length()>6))
                throw new IllegalArgumentException("Digite o numero! " );
            else 
            this.numero = numero;
    }
    
    public String getEstado() {
        return this.estado;
    }
    public String getCidade(){
        return this.cidade;
    }
    public String getLogradouro() {
        return this.logradouro;
    }
    public String getNumero() {
        return this.numero;
    }
  
    
}

    
