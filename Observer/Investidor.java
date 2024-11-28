package Observer;

// Classe concreta Observer: Representa um Investidor que observa o preço da ação
class Investidor implements Observer {

    private String nome;

    public Investidor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String acao, double preco) {
        System.out.println(nome + " foi notificado. O preço da ação " + acao + " é agora R$ " + preco);
    }
}
