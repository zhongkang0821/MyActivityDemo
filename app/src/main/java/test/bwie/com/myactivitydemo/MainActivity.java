package test.bwie.com.myactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * 1.仲康
 * 2.2016/11/28
 * 3.这个activity的启动模式是singleTop栈顶模式，
 * 在自身跳自身的时候，不会new新的实例，只会执行onpause
 * 方法再执行onresume方法
 * */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("生命周期","A——————create");

        TextView dd= (TextView) findViewById(R.id.dd);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(MainActivity.this,OtherActivity.class);
                startActivity(m);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("生命周期","A——————onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("生命周期","A——————onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("生命周期","A——————onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("生命周期","A——————onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("生命周期","A——————onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("生命周期","A——————onDestroy");
    }
}
