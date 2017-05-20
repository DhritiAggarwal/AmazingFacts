package com.example.admin.amazingfact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FactActivity1 extends AppCompatActivity {
    ListView factListView;
    TextView fact;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact1);
        fact=(TextView)findViewById(R.id.textviewfact);
        int n=getIntent().getIntExtra("position",-1);
        if(n==1){
            String[] output = getIntent().getStringArrayExtra("fact_info");
            int day = Integer.parseInt(output[0]);
            int month = Integer.parseInt(output[1]);
            FactApiInterface apiService = Client.getService();
            Call<FactInfo> call = apiService.getdate(month, day, true);


            call.enqueue(new Callback<FactInfo>() {
                @Override
                public void onResponse(Call<FactInfo> call, Response<FactInfo> response) {
                    if (response.isSuccessful()) {
                        String factText = response.body().getText();
                        fact.setText(factText);
                    }
                }

                @Override
                public void onFailure(Call<FactInfo> call, Throwable t) {


                    Log.i("error", t.getMessage());
                }

            });
        }
        else if(n==2){
            String output=getIntent().getStringExtra("fact_info");
            int num=Integer.parseInt(output);
            FactApiInterface apiService = Client.getService();
            Call<FactInfo> call = apiService.getmath(num, true);


            call.enqueue(new Callback<FactInfo>() {
                @Override
                public void onResponse(Call<FactInfo> call, Response<FactInfo> response) {
                    if (response.isSuccessful()) {
                        String factText = response.body().getText();
                        fact.setText(factText);
                    }
                }

                @Override
                public void onFailure(Call<FactInfo> call, Throwable t) {


                    Log.i("error", t.getMessage());
                }

            });
        }
         else if(n==3){
            String output=getIntent().getStringExtra("fact_info");

            FactApiInterface apiService = Client.getService();
            Call<FactInfo> call = apiService.getrandom(output, true);


            call.enqueue(new Callback<FactInfo>() {
                @Override
                public void onResponse(Call<FactInfo> call, Response<FactInfo> response) {
                    if (response.isSuccessful()) {
                        String factText = response.body().getText();
                        fact.setText(factText);
                    }
                }

                @Override
                public void onFailure(Call<FactInfo> call, Throwable t) {


                    Log.i("error", t.getMessage());
                }

            });

             }
        else if(n==4){
            String output=getIntent().getStringExtra("fact_info");
            int num=Integer.parseInt(output);
            FactApiInterface apiService = Client.getService();
            Call<FactInfo> call = apiService.gettrivia(num, true);


            call.enqueue(new Callback<FactInfo>() {
                @Override
                public void onResponse(Call<FactInfo> call, Response<FactInfo> response) {
                    if (response.isSuccessful()) {
                        String factText = response.body().getText();
                        fact.setText(factText);
                    }
                }

                @Override
                public void onFailure(Call<FactInfo> call, Throwable t) {


                    Log.i("error", t.getMessage());
                }

            });

        }
        else {
            String output=getIntent().getStringExtra("fact_info");
            int year=Integer.parseInt(output);
            FactApiInterface apiService = Client.getService();
            Call<FactInfo> call = apiService.getyear(year, true);


            call.enqueue(new Callback<FactInfo>() {
                @Override
                public void onResponse(Call<FactInfo> call, Response<FactInfo> response) {
                    if (response.isSuccessful()) {
                        String factText = response.body().getText();
                        fact.setText(factText);
                    }
                }

                @Override
                public void onFailure(Call<FactInfo> call, Throwable t) {


                    Log.i("error", t.getMessage());
                }

            });
        }

b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setClass(FactActivity1.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
