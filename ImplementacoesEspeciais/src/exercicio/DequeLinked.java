package exercicio;

public class DequeLinked implements MeuDeque<Object>{
    private int tamanho;
    private Node<T> head;
    private Node<T> tail;
    

    @Override
    public boolean inserirInicio(){
        
    }
    
    class Node<T>{
        T data;
        Node<T> proximo;
        
        Node(T data){
            this.data = data;
            this.proximo = null;
        }
    }
}
