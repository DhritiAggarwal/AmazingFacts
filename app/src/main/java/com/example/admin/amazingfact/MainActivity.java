package com.example.admin.amazingfact;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView factListView;
    EditText e1,e2;
    int position1;
    String[] listitems={"GET DATE FACT","GET MATH FACT","GET RANDOM FACT","GET TRIVIA FACT","GET YEAR FACT"};
    Integer[] image={R.drawable.calendar,R.drawable.math,R.drawable.randomicon,R.drawable.triviaicon,R.drawable.year};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter=new CustomList(MainActivity.this,listitems,image);
        factListView=(ListView)findViewById(R.id.listview1);
        factListView.setAdapter(adapter);
        factListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                if(position==0){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("GET YOUR FACT");
                v=getLayoutInflater().inflate(R.layout.dialog1,null);
                e1=(EditText)v.findViewById(R.id.enterday);
                e2=(EditText)v.findViewById(R.id.entermonth);


                builder.setView(v);
                builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent();
                        String day=e1.getText()+"";
                        String month=e2.getText()+"";

                        i.setClass(MainActivity.this,FactActivity1.class);
                        String carrier[]=new String[2];
                        carrier[0]=day;
                        carrier[1]=month;
                        i.putExtra("position",1);
                        i.putExtra("fact_info",carrier);

                        startActivity(i);
                    }
                });
                builder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
            }
               else if(position==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("GET YOUR FACT");
                v=getLayoutInflater().inflate(R.layout.dialog2,null);
                e1=(EditText)v.findViewById(R.id.enternumber);
                builder.setView(v);
                builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent();
                        String num=e1.getText()+"";


                        i.setClass(MainActivity.this,FactActivity1.class);
                        i.putExtra("position",2);
                        i.putExtra("fact_info",num);
                        startActivity(i);
                    }
                });
                builder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();


                }
               else if(position==2){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("GET YOUR FACT");
                v=getLayoutInflater().inflate(R.layout.dialog3,null);
                    e1=(EditText)v.findViewById(R.id.entertype);
                builder.setView(v);
                builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent();
                        String type=e1.getText()+"";
                        i.setClass(MainActivity.this,FactActivity1.class);
                        i.putExtra("position",3);
                        i.putExtra("fact_info",type);
                        startActivity(i);
                    }
                });
                builder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
                }
               else if(position==3){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("GET YOUR FACT");
                    v=getLayoutInflater().inflate(R.layout.dialog2,null);
                    e1=(EditText)v.findViewById(R.id.enternumber);
                    builder.setView(v);
                    builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent();
                            String num=e1.getText()+"";


                            i.setClass(MainActivity.this,FactActivity1.class);
                            i.putExtra("position",4);

                            i.putExtra("fact_info",num);
                            startActivity(i);
                        }
                    });
                    builder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.create().show();

                }
                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("GET YOUR FACT");
                v=getLayoutInflater().inflate(R.layout.dialog4,null);
                    e1=(EditText)v.findViewById(R.id.enteryear);
                builder.setView(v);
                builder.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i=new Intent();
                        String year=e1.getText()+"";
                        i.setClass(MainActivity.this,FactActivity1.class);
                        i.putExtra("position",5);
                        i.putExtra("fact_info",year);
                        startActivity(i);
                    }
                });
                builder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.create().show();
                }


                }

        });

    }
}

