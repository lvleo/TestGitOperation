package com.useeinfo.testgitoperation;

import android.content.Intent;
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

        Log.e(TAG, "onCreate: 666666");


        Intent intent = new Intent(this, MainActivity.class);

        Log.e(TAG, "onCreate: --------------------------");

    }

    /**
     * @param s
     * @return
     */
    private boolean checkString(String s) {
        Log.e(TAG, "checkString: s=" + s);
        if (s == null || "".equals(s)) {
            return false;
        } else {
            return "ABC".equals(s);
        }
    }


}
