package test.bwie.com.myactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * 1.仲康
 * 2.2016/11/28
 * 3.这个activity是singleTask模式，如果从1activity跳过来，
 * 再从这个activity调到3activity，再从3activity跳到这个
 * activity，3activity会执行销毁方法
 * */

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Button k= (Button) findViewById(R.id.k);
        Button kk= (Button) findViewById(R.id.skkk);
        kk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(ThreeActivity.this,OtherActivity.class);
                startActivity(ii);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ThreeActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        Log.i("生命周期","C——————onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("生命周期","C——————onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("生命周期","C——————onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("生命周期","C——————onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("生命周期","C——————onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("生命周期","C——————onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("生命周期","C——————onDestroy");
    }
}
