package com.example.prosp.paden;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.prosp.paden.gallery.Gallery;
import com.example.prosp.paden.miGate.mainGate;
import com.example.prosp.paden.news.News;
import com.example.prosp.paden.services.Services;

public class Dashboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView services=(ImageView)findViewById(R.id.imageView4);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting a dialog
                LayoutInflater li = LayoutInflater.from(Dashboard.this);
                View dialogView = li.inflate(R.layout.services, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dashboard.this);

                //setting dialog title

                alertDialogBuilder.setTitle("My Services");
                alertDialogBuilder.setIcon(R.drawable.pad);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        /*.setCancelable(false)
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                Intent intent = new Intent( Dashboard.this,Dashboard.class);
                                startActivity(intent);

                            }
                        })*/



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

        ImageView bills=(ImageView)findViewById(R.id.imageView);
        bills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting a dialog
                LayoutInflater li = LayoutInflater.from(Dashboard.this);
                View dialogView = li.inflate(R.layout.bills, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dashboard.this);

                //setting dialog title

                alertDialogBuilder.setTitle("Bill Payments");
                alertDialogBuilder.setIcon(R.drawable.pad);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        /*.setCancelable(false)
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                Intent intent = new Intent( Dashboard.this,Dashboard.class);
                                startActivity(intent);

                            }
                        })*/



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

        ImageView migate=(ImageView)findViewById(R.id.imageView5);
        migate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent news= new Intent(Dashboard.this,mainGate.class);
                startActivity(news);
            }
        });

        ImageView emerg=(ImageView)findViewById(R.id.imageView6);
        emerg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting a dialog
                LayoutInflater li = LayoutInflater.from(Dashboard.this);
                View dialogView = li.inflate(R.layout.emergency, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dashboard.this);

              ImageView btn1= (ImageView)dialogView.findViewById(R.id.imageView11);
                ImageView btn2= (ImageView)dialogView.findViewById(R.id.imageView8);
                ImageView btn3= (ImageView)dialogView.findViewById(R.id.imageView10);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0775688386"));

                        if (ActivityCompat.checkSelfPermission(Dashboard.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(callIntent);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:0775688386"));

                        if (ActivityCompat.checkSelfPermission(Dashboard.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(callIntent);
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:0775688386"));

                        if (ActivityCompat.checkSelfPermission(Dashboard.this,
                                Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            return;
                        }
                        startActivity(callIntent);
                    }
                });


                //setting dialog title

                alertDialogBuilder.setTitle("Emergency Access");
                alertDialogBuilder.setIcon(R.drawable.pad);
                alertDialogBuilder.setView(dialogView);



                alertDialogBuilder
                        /*.setCancelable(false)
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                                Intent intent = new Intent( Dashboard.this,Dashboard.class);
                                startActivity(intent);

                            }
                        })*/



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




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent ser= new Intent(Dashboard.this,Services.class);
            startActivity(ser);


        } else if (id == R.id.nav_gallery) {

            Intent news= new Intent(Dashboard.this,News.class);
            startActivity(news);

        } else if (id == R.id.nav_manage) {
            Intent gal= new Intent(Dashboard.this, Calender.class);
            startActivity(gal);

        }
        else if (id==R.id.nav_slideshow){

            //setting a dialog
            LayoutInflater li = LayoutInflater.from(Dashboard.this);
            View dialogView = li.inflate(R.layout.sug_dialog, null);
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Dashboard.this);

            //setting dialog title

            alertDialogBuilder.setTitle("Suggestions Form");
            alertDialogBuilder.setIcon(R.drawable.pad);
            alertDialogBuilder.setView(dialogView);



            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //Uri uri = Uri.parse("http://" + current.getPrice()); // missing 'http://' will cause crashed
                            Intent intent = new Intent( Dashboard.this,Dashboard.class);
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

        else if (id == R.id.gallery) {
            Intent gal= new Intent(Dashboard.this, Gallery.class);
            startActivity(gal);

        }
        else if (id == R.id.nav_share) {


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
