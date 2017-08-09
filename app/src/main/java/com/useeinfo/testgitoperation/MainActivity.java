package com.useeinfo.testgitoperation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.e(TAG, "onCreate: 11111111");


        UserModel userModel = new UserModel();
        userModel.setName("leo");

        TextView tv = null;
        if (tv != null) {
            tv.setText(userModel.getName());
        }

    }

}
