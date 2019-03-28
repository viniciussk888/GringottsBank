package gringottsbank;

import java.util.PriorityQueue;

public class Fila {
    PriorityQueue<String> fila = new PriorityQueue<>();
    
    public void adicionar(String x){
        fila.add(x);
    }    
}
