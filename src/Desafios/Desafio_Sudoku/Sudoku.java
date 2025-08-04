package Desafios.Desafio_Sudoku;

import javax.swing.*;
import java.awt.*;

public class Sudoku {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel(new GridLayout(9, 9));
        JTextField[][] cells = new JTextField[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new JTextField();
                cells[i][j].setHorizontalAlignment(JTextField.CENTER);
                panel.add(cells[i][j]);
            }
        }

        frame.add(panel);
        frame.setVisible(true);
//        SudokuBoard board = new SudokuBoard();
//        board.inicializar();
//        board.jogar();
    }
}
