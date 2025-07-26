package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe03;


import java.util.function.Consumer;

public enum Menu {
//    Dar banho no pet;
    DAR_BANHO(MaquinaDeBanho::darBanho),
//    Abastecer com água;
    ABASTECER_AGUA(MaquinaDeBanho::abastecerAgua),
//    Abastecer com shampoo;
    ABASTECER_SHAMPOO(MaquinaDeBanho::abastecerShampoo),
//    verificar nivel de água;
    VERIFICAR_AGUA(MaquinaDeBanho::verificarAgua),
//    verificar nivel de shampoo;
    VERIFICAR_SHAMPOO(MaquinaDeBanho::verificarShampoo),
//    verificar se tem pet no banho;
    VERIFICAR_OCUPACAO(MaquinaDeBanho::verificarOcupacao),
//    colocar pet na maquina;
    COLOCAR_PET(MaquinaDeBanho::colocarPet),
//    retirar pet da máquina;
    RETIRAR_PET(MaquinaDeBanho::retirarPet),
//    limpar maquina.
    LIMPAR(MaquinaDeBanho::limpar),
    SAIR(maquina -> System.exit(0));

    private final Consumer<MaquinaDeBanho> acao;

    Menu(Consumer<MaquinaDeBanho> acao) {
        this.acao = acao;
    }

    public void executar(MaquinaDeBanho maquinaDeBanho) {
        acao.accept(maquinaDeBanho);
    }
}
