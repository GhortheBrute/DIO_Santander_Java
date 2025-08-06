package Desafios.Desafio_Sudoku;

import javax.swing.*;
import java.awt.*;

public class Sudoku {
    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();
        board.inicializar();
        board.jogar();
    }
}
