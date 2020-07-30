package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameScreen extends AppCompatActivity {
    private int gameMap[] = {0,0,0,0,0,0,0,0,0};
    private int currentSign = 0; // -1 = "O" , 1 = "X", 0 ="none"
    private boolean inGame = false; // True если игра начата и не завершена, а в остальных случаях False
    private int sideWinner = 0;  // -1 = "O" , 1 = "X", 0 ="none"
    private int lines[][] = {{0, 1, 2},  {3, 4, 5},  {6, 7, 8}, {0, 3, 6}, {1, 4, 7},  {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
    private int lastMove[] = {0,0,0,0,0,0,0,0,0}; // массив из последовательности ходов (нужен для отмены хода)

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);

        //  начальные установки
        resetGameMap();

    }

    private void resetGameMap() {
        for (int k = 0; k < 9 ; k++) {
            gameMap[k] = 0;
        }
    }

    protected void undoMove (int index) {
        // снять метку для заданного индекса и внести изменения в массиве
        // сменить право хода
        // сменить счётчик ходов
        // если отменять не чего, тогда считать что это начало игры
    }

    private void putSign (int index, int sign) {
        // вычислить знак и положить его в массивы. Показать изменения на поле
    }

    private int getSign (int index) {
        // показать знак по заданному индексу
        return 0;
    }

    private int generateMove (boolean rndMove ) {
        // если  rndMove == false, тогда осмысленный ход выдать, иначе случайный
        int index = 0;
        return index;
    }



    // Метод обработки нажатия на кнопку
    public void onBackClick(View view) {
        // действия, совершаемые после нажатия на кнопку
        setContentView(R.layout.activity_main);
    }
}