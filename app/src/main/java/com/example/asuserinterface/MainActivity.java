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
    String thank = "Thank you for ordering"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     This method is called when the order is clicked.
     */
    public void submitOrder(View view) {
        displayPrice(numberOfCoffees * 5);
        TextView TY = (TextView)
        TY.setText(thank + numberOfCoffees + "Coffes");
    }
    public void increment(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);

    }
    public void decrement(View view) {
        if(numberOfCoffees < 1){
            display(0);
        }else{
            numberOfCoffees--;
            display(numberOfCoffees);

        }

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