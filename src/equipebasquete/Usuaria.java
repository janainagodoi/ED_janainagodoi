/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equipebasquete;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuaria 
{
       
    public static void main(String[] args) 
    {
        int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              Estrutura arr = new Estrutura(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              Scanner entradaint = new Scanner (System.in);
              Scanner entradaFloat = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
              
              System.out.println("Bem Vindo ao Programa de Vetores de Jogadores!!!");
              
              for (int i = 1; i <= 3; i++) 
              {
                 System.out.println("Digite o " + i + "o nome:");
                 String nome = entrada.nextLine();
                 System.out.println("Digite a idade do(a) " + nome);
                 int idade = entradaint.nextInt();
                 System.out.println("Digite a altura do(a) " + nome);
                 float altura = entradaFloat.nextFloat();
                 
                 arr.insert(nome, idade, altura);
              }

              System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma idade");

              //verificar se o valor retornado é maior que 100
              arr.findByIdade(entrada.nextInt());
                      
             //System.out.println("Digite um nome para buscar");
                    if (!arr.find(entrada.nextLine()))
                    
                    arr.display();
    }
    
}




