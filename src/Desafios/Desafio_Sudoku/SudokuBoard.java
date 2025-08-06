package Desafios.Desafio_Sudoku;

import java.util.Scanner;

public class SudokuBoard {
    private int[][] board;
    private final int[][] originalBoard = new int[9][9];
    private int[][] solution;
    private String message;
    private boolean status = false;
    private Scanner scanner = new Scanner(System.in);

    public void initialize() {
        if (status) {
            System.out.println("Jogo já iniciado. Para iniciar um novo jogo, use o comando 'clear'.");
            return;
        }

        board = new int[][]{
                {2, 0, 0, 6, 9, 0, 8, 0, 1},
                {0, 0, 0, 0, 0, 3, 6, 0, 0},
                {0, 1, 3, 8, 0, 2, 5, 4, 0},
                {7, 0, 5, 0, 8, 0, 3, 9, 6},
                {8, 3, 0, 4, 0, 0, 0, 0, 0},
                {1, 0, 6, 0, 0, 5, 0, 0, 0},
                {3, 7, 0, 9, 0, 6, 0, 1, 0},
                {0, 2, 9, 1, 0, 8, 0, 0, 0},
                {5, 6, 0, 3, 0, 0, 0, 2, 0}};
        for (int i = 0; i < 9; i++) {
            System.arraycopy(board[i], 0, originalBoard[i], 0, 9);
        }
        solution = new int[][]{
                {2, 5, 7, 6, 9, 4, 8, 3, 1},
                {9, 8, 4, 5, 1, 3, 6, 7, 2},
                {6, 1, 3, 8, 7, 2, 5, 4, 9},
                {7, 4, 5, 2, 8, 1, 3, 9, 6},
                {8, 3, 2, 4, 6, 9, 1, 5, 7},
                {1, 9, 6, 7, 3, 5, 2, 8, 4},
                {3, 7, 8, 9, 2, 6, 4, 1, 5},
                {4, 2, 9, 1, 5, 8, 7, 6, 3},
                {5, 6, 1, 3, 4, 7, 9, 2, 8}};

        status = true;
    }

    public void play() {
        while (!isComplete()) {
            try {
                menu();
                int option = scanner.nextInt();

                switch (option) {
                    case 1 -> initialize();
                    case 2 -> inputNumber();
                    case 3 -> removeNumber();
                    case 4 -> printBoard();
                    case 5 -> showGameStatus();
                    case 6 -> clearGame();
                    case 7 -> System.exit(0);
//                printBoard();
//                System.out.println("Digite a linha.(1-9): ");
//                int row = scanner.nextInt() - 1;
//
//                System.out.println("Digite a coluna.(1-9): ");
//                int col = scanner.nextInt() - 1;
//
//                System.out.println("Digite o valor.(1-9)");
//                int val = scanner.nextInt();
//
//                if (isValidMove(row, col, val)) {
//                    board[row][col] = val;
//                } else {
//                    System.out.println("Jogada inválida! " + message);
//                }
                }
            } catch (Exception e) {
                System.out.println("Erro: Insira um valor válido de 1 à 9.");
                scanner.nextLine();
            }
        }
        System.out.println("Parabéns! Você completou o Sudoku.");
    }

    // TODO: Adicionar método para checar se por remover (apenas checar original board, sem o val)
    private boolean isValidMove(int row, int col, int val) {
        // Impede alteração de células já preenchidas originalmente
        if (originalBoard[row][col] != 0) {
            message = "Proibido alterar valor original.";
            return false;
        }

        // Verifica a linha
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) {
                message = "Valor já existente na linha " + (row + 1) + ".";
                return false;
            }
        }

        // Verifica a coluna
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val) {
                message = "Valor já existente na coluna " + (col + 1) + ".";
                return false;
            }
        }

        // Verifica o bloco 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == val) {
                    message = "Valor já existente no bloco " + (row / 3 + 1) + "," + (col / 3 + 1) + ".";
                    return false;
                }
            }
        }

        // Se passou por todas as verificações, a jogada é válida.
        return true;

    }

    private boolean isComplete() {
        // Verifica se o tabuleiro está completamente preenchido
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != solution[i][j]) return false;
            }
        }
        return true;
    }

    private void printBoard() {
        System.out.println("    1 2 3   4 5 6   7 8 9");
        System.out.println("  +-------+-------+-------+");

        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " | ");

            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];
                System.out.print((val == 0 ? "." : val) + " ");

                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();

            if ((i + 1) % 3 == 0) System.out.println("  +-------+-------+-------+");
        }
    }

    private void inputNumber(){
        // Lógica de inserir número na casa correspondente
        System.out.println("Digite a linha.(1-9): ");
        int row = scanner.nextInt() - 1;

        System.out.println("Digite a coluna.(1-9): ");
        int col = scanner.nextInt() - 1;

        System.out.println("Digite o valor.(1-9)");
        int val = scanner.nextInt();

        if (isValidMove(row, col, val)) {
            board[row][col] = val;
        } else {
            System.out.println("Jogada inválida! " + message);
        }
    }

    private void removeNumber(){
        // Lógica de remover número na casa correspondente
        System.out.println("Digite a linha.(1-9): ");
        int row = scanner.nextInt() - 1;

        System.out.println("Digite a coluna.(1-9): ");
        int col = scanner.nextInt() - 1;

        // TODO: Remover linha
        System.out.println("Digite o valor.(1-9)");
        int val = scanner.nextInt();

        if (isValidMove(row, col, val)) {
            board[row][col] = val;
        } else {
            System.out.println("Jogada inválida! " + message);
        }
    }

    private void showGameStatus(){
        // retorna se o jogo está completo ou não.
    }

    private void clearGame(){
        // Lógica de recomeçar o jogo
    }

    private void menu(){
        System.out.println("\n╔══════════════════════╗");
        System.out.println("║     MENU DO JOGO     ║");
        System.out.println("╠══════════════════════╣");
        System.out.println("║ 1 - Iniciar o jogo   ║");
        System.out.println("║ 2 - Colocar número   ║");
        System.out.println("║ 3 - Remover número   ║");
        System.out.println("║ 4 - Visualiza jogo   ║");
        System.out.println("║ 5 - Verificar status ║");
        System.out.println("║ 6 - Limpar jogo      ║");
        System.out.println("║ 7 - Sair             ║");
        System.out.println("╚══════════════════════╝");
        System.out.print("Escolha uma opção: ");
    }
}
