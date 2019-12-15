/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Find the View that shows the family category
        TextView lagu = (TextView) findViewById(R.id.lagu);

        // Set a click listener on that View
        lagu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LaguActivity}
                // Set the content of the activity to use the activity_main.xml layout file
                setContentView(R.layout.activity_main);

                // Find the View that shows the family category


                Intent laguIntent = new Intent(MainActivity.this, LaguActivity.class);

                // Start the new activity
                startActivity(laguIntent);
            }
        });

        // Find the View that shows the colors category
        TextView bahasa = (TextView) findViewById(R.id.bahasa);

        // Set a click listener on that View
        bahasa.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BahasaActivity}
                Intent bahasaIntent = new Intent(MainActivity.this, BahasaActivity.class);

                // Start the new activity
                startActivity(bahasaIntent);
            }
        });


        ImageButton pesan = (ImageButton) findViewById(R.id.pesan);

        // Set a click listener on that View
        pesan.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BahasaActivity}
                Intent pesanIntent = new Intent(MainActivity.this, PesanActivity.class);

                // Start the new activity
                startActivity(pesanIntent);
            }
        });

        // Find the View that shows the colors category
        TextView coba = (TextView) findViewById(R.id.coba);

        // Set a click listener on that View
        coba.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BahasaActivity}
                Intent cobaIntent = new Intent(MainActivity.this, CobaActivity.class);

                // Start the new activity
                startActivity(cobaIntent);
            }
        });
    }
}

