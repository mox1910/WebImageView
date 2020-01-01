package com.webimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebImageView webImageView;
        final EditText editText;
        Button button;

        editText = (EditText)findViewById(R.id.edittext);
        button = (Button)findViewById(R.id.mbutton);
        webImageView=(WebImageView)findViewById(R.id.webimageview);

        webImageView.setImageURL("http://android-studio.org/images/partner/android-studio.jpg");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webImageView.setImageURL(editText.getText().toString());
            }
        });

    }
}
