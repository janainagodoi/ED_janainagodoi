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
public class Usuaria
{
     public static void main(String[] args)
      {
      ListaEncadeada lista = new ListaEncadeada();  // criamos uma nova lista

      lista.insertFirst("Janaina", "Jasmin");      // inserimos quatro itens nela
      lista.insertFirst("Roberto", "Jasmin");
      lista.insertFirst("Cristiane", "Gratidao");
      lista.insertFirst("Ewerton", "Sabedoria");
         
      
          if(lista.find("Janaina") != null)
          {
          System.out.println("Encontrei o nome: Janaina" );
      }
      else
      {
          System.out.println("Não encontrei o nome!!" );
      }
      }  // final do método main()
   }  // final da classe usuária
    

