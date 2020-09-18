package Projeto2020.Trabalho;

public class clienteN {
            private String nome;
            private String cpf;
            private int idade; 
        
        public clienteN(String nome, String cpf, int idade) {
            setNome(nome); 
            setCpf(cpf);
            setIdade(idade);
        } 
        public  void setNome(String nome) {
             if ((nome.length()<4) || (nome.length()>30))
                 throw new IllegalArgumentException("Digite seu nome completo !");
            else
                 this.nome = nome;
        }
        public void setCpf(String cpf) {
            cpf aux = new cpf(cpf);
            this.cpf = aux.toString();
        }
        public void setIdade(int idade){
            if ((idade <= 0)|| (idade>=120 ))
               throw new IllegalArgumentException("Idade invalida ! ");
            else 
                this.idade = idade;
        }
        public String getNome(){
            return this.nome;
        }    
        public String getCpf(){
            return this.cpf;
        }
        public int getIdade(){
            return this.idade;

        }
            
            @Override
            public String toString() {
            return nome + cpf + idade; 
            }
}      
 
