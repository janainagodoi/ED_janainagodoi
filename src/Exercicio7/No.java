/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio7;

/**
 *
 * @author Multas
 */

    public class No 
    {
    public String nome;              // vai armazenar um valor numerico qualquer
    public String palavra;           // vai armazenar um valor numerico qualquer
   public No next;  
    
// referência para o próximo item da lista
// -------------------------------------------------------------
   public No(String nom, String pa) // metodo construtor
      {
      nome = nom;                 // initializa os dois atributos do No
      palavra = pa;                 // o No next a principio fica como null
      }                           // 
// -------------------------------------------------------------
   public void displayNo()      // mostra os valores do proprio nó
      {
      System.out.print("{" + nome + ", " + palavra + "} ");
      }
   
   public void setNext(No n){
       next = n;
   }
   
   public No getNext(){
       return next;
   }   
}
    
