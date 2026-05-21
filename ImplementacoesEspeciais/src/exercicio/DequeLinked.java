package exercicio;

public class DequeLinked implements MeuDeque<Object>{
    private int tamanho;
    private Node<T> head;
    private Node<T> tail;
    

    @Override
    public boolean inserirInicio(T valor){
        Node<T> novo = new Node<T>(valor);
        if(head == null){
            head = novo;
            tail = novo;
            tamanho++;
            return true;
        }
        novo.proximo = head;
        head = novo;
        return true;
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
