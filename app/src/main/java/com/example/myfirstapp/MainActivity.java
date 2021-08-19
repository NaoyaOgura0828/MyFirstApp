package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*; // widgetのインスタンスをワイルドカードでimport
// import android.widget.TextView; // デフォルトのimportの為コメントアウト

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(android.view.View view) {
        /* ボタンが押された時の処理（buttonCalcでのみ使用） */
        TextView bmiScore = (TextView) this.findViewById(R.id.bmiScore); // TextViewでbmiScoreの値を取得する（リソース.ID.識別子）
        EditText heightForm = (EditText) this.findViewById(R.id.heightForm); // EditTextでheightFormの値を取得する（リソース.ID.識別子）
        EditText weightForm = (EditText) this.findViewById(R.id.weightForm); // EditTextでweightFormの値を取得する（リソース.ID.識別子）

        String strHeight, strWeight; // 入力された身長と体重の格納先を宣言
        strHeight = heightForm.getText().toString(); // 身長入力フォームの値を取得しString型で格納する
        strWeight = weightForm.getText().toString(); // 体重入力フォームの値を取得しString型で格納する

        double bmi, height, weight; // double型の値の格納先を宣言
        height = Double.parseDouble(strHeight); // String型で格納された値（身長）をdouble型へ変換して格納する
        weight = Double.parseDouble(strWeight); // String型で格納された値（体重）をdouble型へ変換して格納する

        height /= 100; // 身長をcmからmに変換し"height"へオーバーライド
        bmi = weight / (height * height); // BMIを算出する式
        String msg = "BMIスコア: " + bmi;// BMIスコア表示の為の文字列

        bmiScore.setText(msg); // bmiScoreへmsgをセットして結果を表示する
    }
}