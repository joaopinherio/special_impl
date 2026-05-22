package exercicio;

public class DequeLinked<T> implements MeuDeque<T>{
    private int tamanho;
    private Node head;
    private Node tail;
    
    class Node<T>{
        T data;
        Node proximo;
        
        Node(T data){
            this.data = data;
            this.proximo = null;
        }
    }

    
    @Override
    public boolean inserirInicio(T valor){
        Node<Pessoa> novo = new Node(valor);
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
        if(tail != null){
            return tail;
        }
        return null;
    }

    @Override
    public int tamanho(){ 
        return this.tamanho;
    }
    
}
