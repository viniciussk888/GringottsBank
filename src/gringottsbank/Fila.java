package gringottsbank;

import java.util.PriorityQueue;

public class Fila {
    PriorityQueue<String> fila = new PriorityQueue<>();
    int A=1;
    int B=1;
    int C=1;
    int D=1;
    int E=1;
    
    public void adicionar(String x){
        fila.add(x);
    } 
    public String chamar(){
        return fila.poll();
    }
    public String verPrimeiro(){
        return fila.peek();
    }
}
