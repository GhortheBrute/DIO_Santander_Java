package Exercicios.E03_Java_e_a_arte_da_abstracao_com_classes_e_encapsulamento.Exe02;

public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        ligado = false;
        velocidade = 0;
        marcha = 0;
    }

    private boolean isLigado() {
        return ligado;
    }

    private int verificarVelocidade() {
        return velocidade;
    }

    private void aumentarVelocidade() {
        this.velocidade++;
        exibirVelocidade();
    }

    private void reduzirVelocidade() {
        this.velocidade--;
        exibirVelocidade();
    }

    private int getMarcha() {
        return marcha;
    }

    private void aumentarMarcha() {
        marcha++;
    }

    private void reduzirMarcha() {
        marcha--;
    }

    private void exibirVelocidade(){
        System.out.printf("Velocidade atual: %d\n", this.velocidade);
    }

    public void ligar(){
        if (isLigado()) System.out.println("Veículo já se encontra ligado.");
        else {
            ligado = true;
            System.out.println("Veículo ligado.");
        }

    }

    public void desligar(){
        if (isLigado()) {
            if (verificarVelocidade() == 0) {
                ligado = false;
                System.out.println("Veículo desligado.");
            }
            else System.out.println("Necessário reduzir a velocidade a 0 para desligar.");
        } else System.out.println("Veículo já se encontra desligado.");
    }

    public void acelerar() {
        if (isLigado()) {
            switch (getMarcha()) {
                case 0 -> {
                    System.out.println("Marcha alterada para 1º.");
                    aumentarMarcha();
                    aumentarVelocidade();
                }
                case 1 -> {
                    if (velocidade == 20) {
                        System.out.println("Velocidade máxima da marcha atingida. Marcha alterada para a 2º.");
                        aumentarMarcha();
                        aumentarVelocidade();
                    } else {
                        aumentarVelocidade();
                    }
                }
                case 2 -> {
                    if (velocidade == 40) {
                        System.out.println("Velocidade máxima da marcha atingida. Marcha alterada para a 3º.");
                        aumentarMarcha();
                        aumentarVelocidade();
                    } else {
                        aumentarVelocidade();
                    }
                }
                case 3 -> {
                    if (velocidade == 60) {
                        System.out.println("Velocidade máxima da marcha atingida. Marcha alterada para a 4º.");
                        aumentarMarcha();
                        aumentarVelocidade();
                    } else {
                        aumentarVelocidade();
                    }
                }
                case 4 -> {
                    if (velocidade == 80) {
                        System.out.println("Velocidade máxima da marcha atingida. Marcha alterada para a 5º.");
                        aumentarMarcha();
                        aumentarVelocidade();
                    } else {
                        aumentarVelocidade();
                    }
                }
                case 5 -> {
                    if (velocidade == 100) {
                        System.out.println("Velocidade máxima da marcha atingida. Marcha alterada para a 6º.");
                        aumentarMarcha();
                        aumentarVelocidade();
                    } else {
                        aumentarVelocidade();
                    }
                }
                case 6 -> {
                    if (velocidade == 120) {
                        System.out.println("Velocidade máxima da marcha atingida.");
                    } else {
                        aumentarVelocidade();
                    }
                }
            }
        } else System.out.println("Veículo se encontra desligado.");
    }

    public void desacelerar(){
        if (isLigado()){
            switch (getMarcha()) {
                case 0 -> System.out.println("O carro se encontra parado.");
                case 1 -> {
                    if (velocidade == 1) {
                        System.out.println("Velocidade mínima da marcha atingida. Marcha alterada para ponto morto.");
                        reduzirMarcha();
                        reduzirVelocidade();
                    } else {
                        reduzirVelocidade();
                    }
                }
                case 2 -> {
                    if (velocidade == 21) {
                        System.out.println("Velocidade mínima da marcha atingida. Marcha alterada para a 1º.");
                        reduzirMarcha();
                        reduzirVelocidade();
                    } else {
                        reduzirVelocidade();
                    }
                }
                case 3 -> {
                    if (velocidade == 41) {
                        System.out.println("Velocidade mínima da marcha atingida. Marcha alterada para a 2º.");
                        reduzirMarcha();
                        reduzirVelocidade();
                    } else {
                        reduzirVelocidade();
                    }
                }
                case 4 -> {
                    if (velocidade == 61) {
                        System.out.println("Velocidade mínima da marcha atingida. Marcha alterada para a 3º.");
                        reduzirMarcha();
                        reduzirVelocidade();
                    } else {
                        reduzirVelocidade();
                    }
                }
                case 5 -> {
                    if (velocidade == 81) {
                        System.out.println("Velocidade mínima da marcha atingida. Marcha alterada para a 4º.");
                        reduzirMarcha();
                        reduzirVelocidade();
                    } else {
                        reduzirVelocidade();
                    }
                }
                case 6 -> {
                    if (velocidade == 101) {
                        System.out.println("Velocidade mínima da marcha atingida. Marcha alterada para a 5º.");
                        reduzirMarcha();
                        reduzirVelocidade();
                    } else {
                        reduzirVelocidade();
                    }
                }
            }
        } else System.out.println("Veículo se encontra desligado.");
    }

    public void virar(String direcao){
        if (isLigado()){
            if (velocidade >= 1 && velocidade <= 40) System.out.printf("Veículo virando à %s.\n", direcao);
            else if (velocidade == 0) System.out.println("Veículo se encontra parado.");
            else System.out.println("Velocidade acima da permitida, reduza para 40km/h para poder virar.");
        } else System.out.println("Veículo se encontra desligado.");
    }
}
