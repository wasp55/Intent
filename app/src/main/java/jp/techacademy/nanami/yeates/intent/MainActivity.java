package jp.techacademy.nanami.yeates.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
//onClick内でsecondActivityに遷移させるようIntentのインスタンスを作成
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);//第一引数はcontextなのでActivity自身を選択 第2引数は遷移させたいActivityのクラスを指定
        intent.putExtra("VALUE1",10);
        intent.putExtra("VALUE2",20);
        startActivity(intent);//生成したIntentを引数にしてstartActivityメソッドを呼び出す

    }
}
