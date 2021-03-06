package cz.uhk.mathforclassmates;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class EShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eshop);
    }

    int PriceSB = 70;
    int PriceWB = 35;
    int Quantity1 = 0;
    int Quantity2 = 0;
    int Quantity3 = 0;
    int Quantity4 = 0;

    public void pricePlus1(View view) {
        Quantity1 = Quantity1 + 1;
        displayQuantity1(Quantity1);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    public void priceMinus1(View view) {
        Quantity1 = Quantity1 - 1;

        if (Quantity1 < 0) {
            Quantity1 = Quantity1 + 1;
        }

        displayQuantity1(Quantity1);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    private void displayQuantity1(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity1);

        quantityTextView.setText("" + number);
    }

    public void pricePlus2(View view) {
        Quantity2 = Quantity2 + 1;
        displayQuantity2(Quantity2);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    public void priceMinus2(View view) {
        Quantity2 = Quantity2 - 1;

        if (Quantity2 < 0) {
            Quantity2 = Quantity2 + 1;
        }

        displayQuantity2(Quantity2);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    private void displayQuantity2(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity2);

        quantityTextView.setText("" + number);
    }

    public void pricePlus3(View view) {
        Quantity3 = Quantity3 + 1;
        displayQuantity3(Quantity3);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    public void priceMinus3(View view) {
        Quantity3 = Quantity3 - 1;

        if (Quantity3 < 0) {
            Quantity3 = Quantity3 + 1;
        }

        displayQuantity3(Quantity3);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    private void displayQuantity3(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity3);

        quantityTextView.setText("" + number);
    }

    public void pricePlus4(View view) {
        Quantity4 = Quantity4 + 1;
        displayQuantity4(Quantity4);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    public void priceMinus4(View view) {
        Quantity4 = Quantity4 - 1;

        if (Quantity4 < 0) {
            Quantity4 = Quantity4 + 1;
        }

        displayQuantity4(Quantity4);
        displayPrice(Quantity1 * PriceSB + Quantity2 * PriceWB + Quantity3 * PriceSB + Quantity4 * PriceWB);
    }

    private void displayQuantity4(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity4);

        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.finalPrice);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void openOrder(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra("PriceSB", PriceSB);
        intent.putExtra("PriceWB", PriceWB);
        intent.putExtra("Quantity1", Quantity1);
        intent.putExtra("Quantity2", Quantity2);
        intent.putExtra("Quantity3", Quantity3);
        intent.putExtra("Quantity4", Quantity4);

        EditText name = (EditText) findViewById(
                R.id.idName);
        EditText surname = (EditText) findViewById(
                R.id.idSurname);
        EditText email = (EditText) findViewById(
                R.id.idEmail);
        EditText street = (EditText) findViewById(
                R.id.idStreet);
        EditText city = (EditText) findViewById(
                R.id.idCity);
        EditText zip = (EditText) findViewById(
                R.id.idZIP);

        intent.putExtra("name", name.getText().toString());
        intent.putExtra("surname", surname.getText().toString());
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("street", street.getText().toString());
        intent.putExtra("city", city.getText().toString());
        intent.putExtra("zip", zip.getText().toString());

        startActivity(intent);
    }
}

