package se.aimaralopez.nilshotel;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.TextView;

import static se.aimaralopez.nilshotel.FontManager.FONTAWESOME;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface iconFont = FontManager.getTypeface(getApplicationContext(), FontManager.FONTAWESOME);
        FontManager.applyTypeFace(findViewById(R.id.icons_container), iconFont);



    }
}
