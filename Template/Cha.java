class Cha extends Bebida {

    // Implementação específica para adicionar o ingrediente (chá)
    @Override
    protected void adicionarIngrediente() {
        System.out.println("Adicionando folhas de chá...");
    }
}