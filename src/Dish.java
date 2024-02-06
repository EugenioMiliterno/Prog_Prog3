package src;

import java.util.Observer;

public class Dish implements Observer{
    private String nome,descrizione;
    private double costo;
    Dish(String nome, String descrizione, double costo){
        this.nome = nome;
        this.descrizione = descrizione;
        this.costo = costo;
    }
    public String getNome(){
        return nome;
    }
    public String getDescrizione(){
        return descrizione;
    }
    public double getCosto(){
        return costo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    public void setCosto(float costo){
        this.costo = costo;
    }
    public void update(java.util.Observable o, Object arg){
        System.out.println("Il piatto " + nome + " è stato aggiornato");
    }
    public String toString(){
        return "Nome: " + nome + "\nDescrizione: " + descrizione + "\nCosto: " + costo;
    }
    public void addObserver(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }
    public void deleteObserver(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteObserver'");
    }
}
