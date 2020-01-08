package com.example.asuserinterface;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Locale;

/**

 This app displays an order form to order coffee
 */
public class MainActivity extends AppCompatActivity {
    int numberOfCoffees = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     This method is called when the order is clicked.
     */
    public void submitOrder(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);
    }
    /**

     This method displays the given quantity value on screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.zero);
        quantityTextView.setText("" + number);
    }
    private void  displayPrice(int number){
        TextView PriceTextView=(TextView)findViewById(R.id.Price);
        PriceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(number));
    }
}