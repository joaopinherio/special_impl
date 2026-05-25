package exercicio;

public class DequeLinked<T> implements MeuDeque<T>{
    private int tamanho;
    private Node head;
    private Node tail;
    
    class Node{
        T data;
        Node proximo;
        
        Node(T data){
            this.data = data;
            this.proximo = null;
        }

        public void proximo(Node valor){
            this.proximo = valor;
        }

        public T getData(){
            return this.data;
        }
    }

    
    @Override
    public boolean inserirInicio(T valor){
        Node novo = new Node(valor);
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
        Node novo = new Node(valor);
        if(head == null){
            inserirInicio(valor);
            return false;
        }
        tail.proximo(novo);
        tail = novo;
        tamanho++;
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
        if(head != null){
            return head.getData();
        }
        return null;
    }
    @Override
    public T consultarFim(){
        if(tail != null){
            return tail.getData();
        }
        return null;
    }

    @Override
    public int tamanho(){ 
        return this.tamanho;
    }
    
}
