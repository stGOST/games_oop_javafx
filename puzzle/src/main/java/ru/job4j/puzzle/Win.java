package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][cell] == 1) {
                rsl = checkHorizontal(board, cell) || checkVertical(board, cell);
                break;
            }
        }
        return rsl;
    }

    private static boolean checkHorizontal(int[][] board, int index) {
        boolean result = true;
        for (int i = 0; i < board[index].length; i++) {
            if (board[index][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    private  static boolean checkVertical(int[][] board, int index) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
