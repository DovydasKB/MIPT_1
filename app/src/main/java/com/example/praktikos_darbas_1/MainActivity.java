package com.example.praktikos_darbas_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onBtnClickChangeText(View view){
        TextView textView = findViewById(R.id.textView);
        textView.setText(".............");
    }
    /// https://stackoverflow.com/questions/6177273/textview-settextcolor-not-working
    public void onBtnClickChangeColor (View view){
        TextView textView = findViewById(R.id.textView);
        textView.setTextColor(Color.parseColor("#0048ba"));
    }
    public void onBtnClickChangeBackground (View view){
        TextView textView = findViewById(R.id.textView);
        textView.setBackgroundColor(Color.parseColor("#e32636"));
    }
}