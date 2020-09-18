package Projeto2020.Trabalho;

import java.util.ArrayList;
import java.util.List; 
import javax.swing.JOptionPane;

public class CadastroCliente {

  public static void  main(String[] args) {
    List<clienteN> Cliente = new ArrayList<>();
    
      clienteN novoCliente = new clienteN("Maria Luiza", "09029594926", 19); 
      endereço endereçoInformado = new endereço("Paraná","Paranavaí", "Rua Jangada", "2555"); 
      Cliente.add(novoCliente);
      System.out.println(novoCliente.toString());
      
      } 
   
} 
