/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cg3017443
 */
public class Cadastro {
    private int cod;
    private String nome;
    private String telefone;
    
    public Cadastro(int cod,String nome,String telefone){
    this.cod=cod;
    this.nome=nome;
    this.telefone=telefone;
    }
    public String getName(){
    return nome;
    }
    public String getPhone(){
    return telefone;}
    
}
