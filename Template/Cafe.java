class Cafe extends Bebida {

    // Implementação específica para adicionar o ingrediente (café)
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando pó de café...");
    }
}