package com.example.admin.tinkerdemo;

import android.os.Environment;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setText("已修复");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //进行补丁的操作
                TinkerInstaller.onReceiveUpgradePatch(MainActivity.this, Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch.apk");
            }
        });

    }
}
