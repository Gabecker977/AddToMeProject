/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cg3017443
 */
public class Test {
    
    public static void main(String[] args) {
        String nome="Gabriel";
        String senha="";
        ConnectionFactory c=new ConnectionFactory();
        if(c.loginTest(nome,senha)){
            System.out.println("Deu certo");
        }
    else{System.out.println("Deu ruim");
        }
        Cadastro ca = c.getCadastro(1);
        System.out.println(ca.getName()+" tel: "+ca.getPhone());
    }
}
