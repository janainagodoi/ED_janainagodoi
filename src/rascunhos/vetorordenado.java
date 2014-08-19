package topico1_vetores;
// vetorordenado.java
// demonstra a utilização de um ordenado com pesquisa binária
////////////////////////////////////////////////////////////////
 //--------------------------------------------------------------
//Iniciamos aqui a classe VetorOrdenado! Nossa nova Estrutura de Dados!!
//--------------------------------------------------------------
class VetorOrdenado 
// nossa classe conteiner // porque ela tem tudo que precisa para se manipular os dados
   {
   private long[] a;                 // cria a referência a para um vetor long
   private int nElems;               // variavel para controlar o numero de elementos
//privado para que ninguém consiga chegar direto e mexer nele
   //-----------------------------------------------------------
   public VetorOrdenado(int max)          // metodo construtor 
//determina o numero de posições que o vetor vai ser criado
      {
      a = new long[max];             // cria o array
      nElems = 0;
      }
   //--------------------------------------------------------------
//Método para retornar quantos elementos tem no vetor
//--------------------------------------------------------------
   public int size() 
// metodo para saber quantos itens tem dentro do vetor
      { return nElems; }
   // se tem 10 itens no vetor retorna 10
//--------------------------------------------------------------
//Método de pesquisa binária ....
//--------------------------------------------------------------
   public int find(long searchKey)
           //recebe os limites inferior e superior e faz o processo de busca (binária neste caso)
      {
      int lowerBound = 0; 
//limite inferior do vetor
      int upperBound = nElems-1; 
//limite superior do vetor (máximo)
      int curIn; 
      //posição

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn]==searchKey)
            return curIn;              // encontrei!
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()
//--------------------------------------------------------------
//Método de inserção ORDENADA!!! ....
//--------------------------------------------------------------
   public void insert(long value)    // insere o elemento no vetor
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
         if(a[j] > value)            // OBS: Usando aqui busca linear!!! Poderia ser binária!
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         a[k] = a[k-1];
      a[j] = value;                  // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção
 //--------------------------------------------------------------
//Método de remoção!!! ....
//--------------------------------------------------------------
   public boolean delete(long value)
      {
      int j = find(value);           //Utiliza a busca binária para remover!!!
      if(j==nElems)                  // caso não encontre, retorna false!
         return false;
      else                           // caso encontre...
         {
         for(int k=j; k<nElems; k++) // move os elementos uma posição pra tras
            a[k] = a[k+1];
         nElems--;                   // decrementa o tamanho
         return true;
         }
      }  // finaliza remoção
 //--------------------------------------------------------------
//Método de visualização!!! ....
//--------------------------------------------------------------
   public void display()  
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(a[j] + " "); 
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // fim da classe VetorOrdenado
////////////////////////////////////////////////////////////////
 //--------------------------------------------------------------
//Começamos aqui a classe AppOrdenada! Aquela que usará nossa nova Estrutura de Dados
//--------------------------------------------------------------
class AppOrdenada
//classe estrutura de dados (usuario)
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // coloca em uma constante o tamanho do vetor
      VetorOrdenado arr;                  // criar referência para a estrutura de dados
      arr = new VetorOrdenado(maxSize);   // instancia a estrutura de dados

      arr.insert(77);                // insere 10 itens
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      int searchKey = 55;            // buscar pelo item 55
      if( arr.find(searchKey) != arr.size() )
         System.out.println("Encontrei o item " + searchKey);
      else
         System.out.println("Não encontrei o item " + searchKey);

      arr.display();                 // mostra o item

      arr.delete(00);                // deleta 3 itens
      arr.delete(55);
      arr.delete(99);

      arr.display();                 // mostra os itens da estrutura de novo
      }  // finaliza o método main()
   }  // finaliza a classe AppOrdenada


// o que mudou na classe usuária comparada aos demais programas?

// aúnica diderença é que se não for enconrado o item retorna o tamanho de nelemts
// se a busca foi diferente de nelements então encontrou o iten e se for igual não encontrou
// poderia ser feito de outra forma, não achando retornaria um valor falso, mas teria um problema
//que se precisasse ver a posição do item n~ão saberia onde está
// então aqui tem que fazer o programa dar a posição em que a busca está ao invés de simplesmente falar verdadeiro ou falso