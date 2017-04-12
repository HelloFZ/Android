package com.example.hellofz.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by hellofz on 2017/4/12.
 */

public class second extends Activity {
    private Button Bt1;
    private String con = "ninini";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Bt1 = (Button)findViewById(R.id.button3);
        Bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent();

                data.putExtra("data",con);
                setResult(2,data);
                finish();

                

            }
        });

    }


}
