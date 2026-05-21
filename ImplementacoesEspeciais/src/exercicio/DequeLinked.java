package exercicio;

public class DequeLinked<T> implements MeuDeque<T>{
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

    @Override
    public boolean inserirFim(T valor){
        return true;
    }
    
    @Override
    public T removerInicio(){
        return T;
    }

    @Override
    public T removerFim(){
        return T;
    }
    @Override
    public T consultarInicio(){
        return T;
    }
    @Override
    public T consultarFim(){
        return T;
    }

    @Override
    public int tamanho(){ 
        return this.tamanho;
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
