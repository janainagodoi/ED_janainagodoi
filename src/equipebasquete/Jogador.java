/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equipebasquete;

/**
 *
 * @author Aluno
 */
public class Jogador
{
      
    private String nome;
    private int idade;
    private float altura;
    
    public Jogador (String name, int age, float height)
    {
        nome = name;
        idade = age;
        altura = height;
    }
    
    public void displayJogador()
    {
        System.out.println("  Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println(" Idade: " + idade);
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public float getAltura()
    {
        return altura;
    }
}




