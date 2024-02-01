package lanchonete.atendimento.cozinha;

import lanchonete.Atendente;

public class Cozinheiro {

    public void adicionarLancheBalcao(){
        System.out.println("Adicionado Lanche Natural.");
    }
    private void fritarIngredientes(){
        System.out.println("Fritando a carne e o ovo.");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes.");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador.");
    }
    private void pedirPraTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
    private void preparaLanche(){
        System.out.println("Preparando o lanche.");
    }

}
