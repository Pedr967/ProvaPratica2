package Observer;

// Classe principal para testar o Observer
public class Main {
    public static void main(String[] args) {
        // Criando o objeto Acao (o "subject")
        Acao acao = new Acao("Petrobras", 30.50);

        // Criando observadores (investidores)
        Investidor investidor1 = new Investidor("Carlos");
        Investidor investidor2 = new Investidor("Maria");

        // Adicionando observadores ao subject
        acao.adicionarObservador(investidor1);
        acao.adicionarObservador(investidor2);

        // Alterando o preço da ação e notificando os observadores
        System.out.println("Alterando preço da ação Petrobras...");
        acao.setPreco(35.70); // Todos os observadores serão notificados

        // Removendo um investidor e alterando o preço novamente
        acao.removerObservador(investidor1);
        System.out.println("\nAlterando preço da ação novamente...");
        acao.setPreco(40.00); // Apenas Maria será notificada
    }
}