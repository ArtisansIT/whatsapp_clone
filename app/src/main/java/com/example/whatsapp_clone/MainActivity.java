package com.example.whatsapp_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;
import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    private TextView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test = findViewById(R.id.name);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseObject test = new ParseObject("test");
                test.put("name","shimanta");
                test.put("age",20);
                test.saveInBackground(new SaveCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null){
                            FancyToast.makeText(MainActivity.this,"successfull",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,false).show();
                        }
                    }
                });
            }
        });



    }
}
