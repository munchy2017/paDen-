package com.example.prosp.paden.miGate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.prosp.paden.R;
import com.example.prosp.paden.miGate.visitors.Visitors;

public class mainGate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gate);

        TextView fam=(TextView)findViewById(R.id.family);
        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting a dialog
                LayoutInflater li = LayoutInflater.from(mainGate.this);
                View dialogView = li.inflate(R.layout.family, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(mainGate.this);

                //setting dialog title

                alertDialogBuilder.setTitle("miFamily");
                alertDialogBuilder.setIcon(R.drawable.pad);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("Add New", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                Intent intent = new Intent( mainGate.this,addFamily.class);
                                startActivity(intent);

                            }
                        })



                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogBox, int id) {
                                        dialogBox.cancel();
                                    }
                                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        TextView visitors=(TextView)findViewById(R.id.visitors);
        visitors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //setting a dialog
                LayoutInflater li = LayoutInflater.from(mainGate.this);
                View dialogView = li.inflate(R.layout.add_visitor, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(mainGate.this);

                //setting dialog title

                alertDialogBuilder.setTitle("Pre-Invite Visitor");
                alertDialogBuilder.setIcon(R.drawable.pad);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("Invite Visitor", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                //Intent intent = new Intent( mainGate.this,addFamily.class);
                                //startActivity(intent);

                            }
                        })



                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogBox, int id) {
                                        dialogBox.cancel();
                                    }
                                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        TextView reports=(TextView)findViewById(R.id.report);
        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent report= new Intent(mainGate.this, Visitors.class);
                startActivity(report);
            }
        });
    }
}
