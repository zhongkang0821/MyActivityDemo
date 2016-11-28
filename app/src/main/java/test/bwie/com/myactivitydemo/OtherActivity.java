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
 * 3.这个是singleInstance一个activity只有一个实例，即使在别的地方调用，
 * 也是把当前这个实例拿到需要的地方用，不会new新的实例
 * */

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Button s = (Button) findViewById(R.id.s);
        Button dd= (Button) findViewById(R.id.ss);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(OtherActivity.this,MainActivity.class);
                startActivity(ii);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mm=new Intent(OtherActivity.this,ThreeActivity.class);
                startActivity(mm);
            }
        });
        Log.i("生命周期","B——————oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("生命周期","B——————onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("生命周期","B——————onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("生命周期","B——————onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("生命周期","B——————onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("生命周期","B——————onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("生命周期","B——————onDestroy");
    }
}
