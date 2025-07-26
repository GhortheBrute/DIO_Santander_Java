package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe03;

public class MaquinaDeBanho {
    private boolean ocupado;
    private boolean limpo;
    private int agua;
    private int shampoo;

    public MaquinaDeBanho() {
        ocupado = false;
        limpo = true;
        agua = 0;
        shampoo = 0;
    }

    private void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    private boolean isLimpo() {
        return limpo;
    }

    private void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }

    private int getAgua() {
        return agua;
    }

    private int getShampoo() {
        return shampoo;
    }

    //    Dar banho no pet;
    public void darBanho(){
        if (!isOcupado()) System.out.println("Máquina vazia.");
        else if (agua < 10 || shampoo < 2) {
            System.out.println("Abastecer com água e shampoo.");
            verificarNiveis();
        } else {
            System.out.println("Banho realizado");
            setLimpo(true);
            agua -= 10;
            shampoo -= 2;
        }
    }
    //    Abastecer com água;
    public void abastecerAgua(){
        if (agua == 30) System.out.println("Água na capacidade máxima.");
        else if (agua >28) {
            agua = 30;
            System.out.println("Água abastecida.");
        }
        else {
            agua += 2;
            System.out.println("Água abastecida.");
        }
        verificarNiveis();
    }
    //    Abastecer com shampoo;
    public void abastecerShampoo(){
        if (shampoo == 10) System.out.println("Shampoo na capacidade máxima.");
        else if (shampoo > 8) {
            shampoo = 10;
            System.out.println("Shampoo abastecido.");
        }
        else {
            shampoo += 2;
            System.out.println("Shampoo abastecido.");
        }
        verificarNiveis();
    }
    //    verificar nivel de água;
    public void verificarAgua(){
        System.out.printf("Nível de água: %d litros.\n", agua);
    }
    //    verificar nivel de shampoo;
    public void verificarShampoo(){
        System.out.printf("Nível de shampoo: %d litros.\n", shampoo);
    }

    private void verificarNiveis(){
        verificarAgua();
        verificarShampoo();
    }
    //    verificar se tem pet no banho;
    private boolean isOcupado() {
        return ocupado;
    }

    //    colocar pet na maquina;
    public void colocarPet(){
        if (isOcupado()) System.out.println("Máquina ocupada.");
        else if (!isLimpo()) System.out.println("Máquina está suja. Necessário efetuar limpeza antes de adicionar o pet.");
        else {
            setOcupado(true);
            setLimpo(false);
            System.out.println("Pet colocado na máquina.");
        }
    }
    //    retirar pet da máquina;
    public void retirarPet(){
        if (!isOcupado()) System.out.println("Máquina vazia.");
        else if (isLimpo()) {
            setOcupado(false);
            System.out.println("Pet retirado.");
        }
        else {
            setOcupado(false);
            if (!isLimpo()) System.out.println("Máquina está suja. Necessário efetuar limpeza.");
        }
    }

    //    limpar maquina.
    public void limpar(){
        if (isOcupado()) System.out.println("Máquina ocupada.");
        else if(isLimpo()) System.out.println("Maquina já se encontra limpa.");
        else {
            setLimpo(true);
            agua -= 3;
            shampoo -= 1;
            System.out.println("Máquina limpa.");
        }
    }

    public void verificarOcupacao(){
        if (isOcupado()) System.out.println("Maquina ocupada.");
        else System.out.println("Máquina vazia.");
    }
}
