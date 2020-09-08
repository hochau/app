package com.test.gradlerepodemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.test.commonlibrary.CommonTestUtil;
import com.test.library1.Library1TestUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CommonTestUtil.log("这是主页面的日志打印");
        Library1TestUtil.log();
        ((TextView)findViewById(R.id.content)).setText(CommonTestUtil.getTag() + "\n" + Library1TestUtil.getTag());
    }
}