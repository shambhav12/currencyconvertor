package com.example.shambhav.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
         imageView.setImageResource(R.drawable.currency);

        EditText currency_edit = (EditText) findViewById(R.id.currency_edit);
        Double dollar_amount = Double.parseDouble(currency_edit.getText().toString());
        Double rupeesamount = dollar_amount * 68.74;
          Toast.makeText(MainActivity.this, "₹" + rupeesamount.toString(), Toast.LENGTH_SHORT).show();


          Log.i("amount",rupeesamount.toString());





    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
