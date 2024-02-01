package lanchonete.atendimento.cozinha;

public class Almoxarife {
    public void controlarEntrada(){
        System.out.println("Controlando entrada de produtos.");
    }

    public void controlarSaida(){
        System.out.println("Controlando saida de produtos.");
    }
    void entregarIngredientes(){
        System.out.println("Cntregando ingredientes.");
        controlarSaida();
    }
    void trocarGas() {
        System.out.println("Almoxarife trocando o gás.");
    }

}
