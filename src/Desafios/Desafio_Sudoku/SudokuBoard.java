package Desafios.Desafio_Sudoku;

import java.util.Scanner;

public class SudokuBoard {
    private int[][] board;
    private int[][] originalBoard = new int[9][9];

    public void inicializar() {
        board = new int[][]{
                {8, 0, 6, 0, 0, 9, 3, 0, 1},
                {9, 0, 4, 0, 3, 0, 2, 0, 5},
                {0, 7, 0, 0, 0, 5, 0, 9, 0},
                {2, 0, 7, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 5, 0, 7},
                {0, 6, 0, 7, 0, 0, 0, 1, 0},
                {7, 0, 1, 0, 9, 0, 6, 0, 8},
                {4, 0, 9, 6, 0, 0, 7, 0, 3}};
        for (int i = 0; i < 9; i++) {
            System.arraycopy(board[i], 0, originalBoard[i], 0, 9);
        }

    }

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        while (!isComplete()) {
            try {
                printBoard();
                System.out.print("Digite linha, coluna e valor (1-9): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                int val = scanner.nextInt();

                if (isValidMove(row, col, val)) {
                    board[row][col] = val;
                } else {
                    System.out.println("Jogada inválida!");
                }
            }catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        }
        System.out.println("Parabéns! Você completou o Sudoku.");
    }

    private boolean isValidMove(int row, int col, int val) {
        // Impede alteração de células já preenchidas originalmente
        if (originalBoard[row][col] != 0) return false;

        // Verifica a linha
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) return false;
        }

        // Verifica a coluna
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val) return false;
        }

        // Verifica o bloco 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == val) return false;
            }
        }

        // Se passou por todas as verificações, a jogada é válida.
        return true;

    }

    private boolean isComplete() {
        // Verifica se o tabuleiro está completamente preenchido
        for (int[] row : board)
            for (int val : row)
                if (val == 0) return false;
        return true;
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int val : row)
                System.out.print((val == 0 ? "." : val) + " ");
            System.out.println();
        }
    }

}
