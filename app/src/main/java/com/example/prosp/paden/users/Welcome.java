package com.example.prosp.paden.users;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.prosp.paden.Dashboard;
import com.example.prosp.paden.R;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button log=(Button)findViewById(R.id.button5);
        Button sign=(Button)findViewById(R.id.button6);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //setting a dialog
                LayoutInflater li = LayoutInflater.from(Welcome.this);
                View dialogView = li.inflate(R.layout.login_dialog, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Welcome.this);

                //setting dialog title

                alertDialogBuilder.setTitle("Login Form");

                alertDialogBuilder.setIcon(R.drawable.aspin_logo);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("Login", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                Intent intent = new Intent(Welcome.this, Dashboard.class);
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

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //setting a dialog
                LayoutInflater li = LayoutInflater.from(Welcome.this);
                View dialogView = li.inflate(R.layout.register_dialog, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Welcome.this);

                //setting dialog title

                alertDialogBuilder.setTitle("Signin Form");
                alertDialogBuilder.setIcon(R.drawable.aspin_logo);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("Register", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                Intent intent = new Intent( Welcome.this,Welcome.class);
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
    }
}

