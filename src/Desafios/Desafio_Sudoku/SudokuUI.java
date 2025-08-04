package Desafios.Desafio_Sudoku;

import javax.swing.*;
import java.awt.*;

public class SudokuUI {
    private JFrame frame;
    private JTextField[][] cells = new JTextField[9][9];
    private int[][] board;

    public SudokuUI(int[][] initialBoard) {
        this.board = initialBoard;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JPanel panel = new JPanel(new GridLayout(9, 9));
        Font font = new Font("SansSerif", Font.BOLD, 20);

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(font);

                if (board[row][col] != 0) {
                    cell.setText(String.valueOf(board[row][col]));
                    cell.setEditable(false);
                    cell.setBackground(Color.LIGHT_GRAY);
                }

                cells[row][col] = cell;
                panel.add(cell);
            }
        }

        JButton verifyButton = new JButton("Verificar");
        verifyButton.addActionListener(e -> verificarSolucao());

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(verifyButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private void verificarSolucao() {
    int[][] userInput = new int[9][9];

    for (int row = 0; row < 9; row++) {
        for (int col = 0; col < 9; col++) {
            String text = cells[row][col].getText().trim();
            try {
                userInput[row][col] = Integer.parseInt(text);
            } catch (NumberFormatException e) {
                userInput[row][col] = 0; // Trata campo vazio ou inválido
            }
        }
    }

    // Integrando com sua classe lógica
    SudokuBoard jogo = new SudokuBoard(userInput);

    if (jogo.isValid()) {
        JOptionPane.showMessageDialog(frame, "Tudo certo! Você completou corretamente 😄");
    } else {
        JOptionPane.showMessageDialog(frame, "Oops... tem algo errado 😓");
    }
}

    public static void main(String[] args) {
        // Exemplo de tabuleiro inicial
        int[][] board = {
            {8, 0, 6, 0, 0, 9, 3, 0, 1},
            {9, 0, 4, 0, 3, 0, 2, 0, 5},
            {0, 7, 0, 0, 0, 5, 0, 9, 0},
            {2, 0, 7, 0, 0, 0, 0, 0, 0},
            {0, 8, 0, 0, 0, 0, 0, 2, 0},
            {0, 0, 0, 0, 0, 0, 5, 0, 7},
            {0, 6, 0, 7, 0, 0, 0, 1, 0},
            {7, 0, 1, 0, 9, 0, 6, 0, 8},
            {4, 0, 9, 6, 0, 0, 7, 0, 3}};
        };

        new SudokuUI(board);
    }
}
