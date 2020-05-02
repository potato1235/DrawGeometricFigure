package com.example.asus.drawgeometricfigure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout myFrameLayout = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFrameLayout = (FrameLayout)findViewById(R.id.frameLayout);//绑定布局界面
        //2、给界面添加自定义的view
        myFrameLayout.addView(new MyView(this));
    }
}
