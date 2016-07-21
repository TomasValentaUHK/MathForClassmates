package cz.uhk.mathforclassmates;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            int PriceSB = extras.getInt("PriceSB", 70);
            int PriceWB = extras.getInt("PriceWB", 35);
            int Quantity1 = extras.getInt("Quantity1", 0);
            int Quantity2 = extras.getInt("Quantity2", 0);
            int Quantity3 = extras.getInt("Quantity3", 0);
            int Quantity4 = extras.getInt("Quantity4", 0);
            String Name = extras.getString("name");
            String Surname = extras.getString("surname");
            String Email = extras.getString("email");
            String Street = extras.getString("street");
            String City = extras.getString("city");
            String ZIP = extras.getString("zip");

            int finalPrice = Quantity1*PriceSB + Quantity2*PriceWB + Quantity3*PriceSB + Quantity4*PriceWB;

            setContentView(R.layout.activity_order);
            Intent intent = getIntent();

            TextView nameTV = (TextView) findViewById(
                    R.id.idName);
            nameTV.setText(Name);

            TextView surnameTV = (TextView) findViewById(
                    R.id.idSurname);
            surnameTV.setText(Surname);

            TextView emailTV = (TextView) findViewById(
                    R.id.idEmail);
            emailTV.setText(Email);

            TextView streetTV = (TextView) findViewById(
                    R.id.idStreet);
            streetTV.setText(Street);

            TextView cityTV = (TextView) findViewById(
                    R.id.idCity);
            cityTV.setText(City);

            TextView zipTV = (TextView) findViewById(
                    R.id.idZIP);
            zipTV.setText(ZIP);

            TextView quantity1TV = (TextView) findViewById(
                    R.id.quantity1);
            quantity1TV.setText("" + Quantity1);

            TextView quantity2TV = (TextView) findViewById(
                    R.id.quantity2);
            quantity2TV.setText("" + Quantity2);

            TextView quantity3TV = (TextView) findViewById(
                    R.id.quantity3);
            quantity3TV.setText("" + Quantity3);

            TextView quantity4TV = (TextView) findViewById(
                    R.id.quantity4);
            quantity4TV.setText("" + Quantity4);

            TextView finalPriceTV = (TextView) findViewById(
                    R.id.finalPrice);
            finalPriceTV.setText("$ " + finalPrice);

        }
    }

    public void submitOrder(View view) {
        Button buttonOrder = (Button) findViewById(
                R.id.buttonOrder);

        try {
            Thread.sleep(750);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        buttonOrder.setText("SUCCESSFUL");
        buttonOrder.setBackgroundColor(Color.parseColor("#F0E209"));
        buttonOrder.setTextColor(Color.parseColor("#858585"));
        buttonOrder.setClickable(false);
    }
}
