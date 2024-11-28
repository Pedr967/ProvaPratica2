package Observer;

import java.util.ArrayList;
import java.util.List;

class Acao {

    private String nome;
    private double preco;
    private List<Observer> observadores = new ArrayList<>();

    // Construtor
    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Adicionar um observador
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    // Remover um observador
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    // Notificar todos os observadores sobre a mudança de preço
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(nome, preco);
        }
    }

    // Atualizar o preço da ação e notificar os observadores
    public void setPreco(double preco) {
        this.preco = preco;
        notificarObservadores(); // Notifica todos os observadores
    }

    // Obter o nome da ação
    public String getNome() {
        return nome;
    }

    // Obter o preço da ação
    public double getPreco() {
        return preco;
    }
}