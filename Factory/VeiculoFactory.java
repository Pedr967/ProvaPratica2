package Factory;

// Classe VeiculoFactory: Fábrica abstrata que define o método de criação
abstract class VeiculoFactory {

    // Método Factory: este é o Factory Method
    public abstract Veiculo criarVeiculo();
}