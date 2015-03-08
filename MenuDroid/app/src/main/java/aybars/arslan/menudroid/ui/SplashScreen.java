package aybars.arslan.menudroid.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import aybars.arslan.menudroid.MainActivity;
import aybars.arslan.menudroid.R;

public class SplashScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread timer = new Thread() {

            public void run() {
                try {
                    sleep(3000);// 3 second wait
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}

