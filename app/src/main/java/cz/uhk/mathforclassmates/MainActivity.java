package cz.uhk.mathforclassmates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void introduction(View view) {
        Intent intent = new Intent(this, IntroductionActivity.class);
        startActivity(intent);
    }

    public void books(View view) {
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }

    public void eShop(View view) {
        Intent intent = new Intent(this, EShopActivity.class);
        startActivity(intent);
    }

    public void aboutUs(View view) {
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }

    public void contact(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}