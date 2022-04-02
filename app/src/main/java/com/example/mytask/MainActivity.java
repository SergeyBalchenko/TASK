package com.example.mytask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int go = 5;
        if (go > 4 ) {
            Log.v(TAG, "YES");
        } else if (go < 6) {
            Log.v(TAG, "YES");
        } else {
            Log.v(TAG, "LAST");
        }
    /* + Посчита{ть  от 10 до 1
       + Проверить четные
       + Если четное - вывести на экран
     */
//        int age = 10;
//        for (;;) { // Посчитать от 10 до 1
//            if (age % 2 == 0) {               // Проверить на четность
//                String msg = "2 * " + age + " = " + age * 2;
//                Log.v(TAG, msg);   // Вывести число на экран
//            }
//            if (age >= 1) {
//                age--;
//            }
//        }
        /*
        1. Узнал тему
        2. Прочитал про неё материал.
        3. Посмотрел ролики на ютубе.
        4. Нашел задачу на эту тему
        5. Без подсказок попробовал решить полностью задачу
            5.1 Если запнулся на чем-то - выписал вопрос.
            5.2 Попробовал найти ответ на этот вопрос
            5.3 Если нашел - иди дальше
            5.4 Если не нашел - напиши Кириллу!
        6. Я чувствую что разобрался во всей теме?
            6.1 Если да - перехожу к следующей теме.
            6.2 Если нет - перейти к шагу 4.
         */
//        Human human = new Human();
//        human.buyBread();
//        human.buyMilk();
//        Log.v(TAG, "Hello world");
//
//        int buyBread;
//        {
//            Log.v(TAG, "Buy Bread");
//        }
//         int buyMilk;
//        {
//            Log.v(TAG, "Buy Milk");
//        }
//
//        byte b = 0;
//        short s = 1234;
//        int i = 234232426;
//        long f = 346246846;
//        float k =
//                                boolean bool
//                                        char c =



    }

}




