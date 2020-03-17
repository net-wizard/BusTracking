package com.example.sendsms;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;

import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    ImageView b1,b2,b3,b4,b5,b6;
    final String phoneNo[]={"8983281911","7721973272","9049035655","9420937208"};
    String message="hello how are";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.school);
        b2=findViewById(R.id.Hadcoo);
        b3=findViewById(R.id.delhigate);
        b4=findViewById(R.id.collector);
        b5=findViewById(R.id.jama);
        b6=findViewById(R.id.hospital);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               final String m1="Dear Parent, Please pickup your child from Hudcco stop Bus arrive in 2 Minetes";
               message=m1;
               sendSMSMessage(m1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String m2="Dear Parent, Please pickup your child from delhi gate stop Bus arrive in 2 Minetes";
                message=m2;
                sendSMSMessage(m2);            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String m3="Dear Parent, Please pickup your child from bUSSTAND stop, Bus arrives in 2 Minetes";
                message=m3;
                sendSMSMessage(m3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String m4="Dear Parent, Please pickup your child from bUSSTAND stop, Bus arrives in 2 Minetes";
                message=m4;
                sendSMSMessage(m4);            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String m5="Dear Parent, Please pickup your child from bUSSTAND stop, Bus arrives in 2 Minetes";
                message=m5;
                sendSMSMessage(m5);            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final String m6="Dear Parent, Please pickup your child from bUSSTAND stop, Bus arrives in 2 Minetes";
                message=m6;
                sendSMSMessage(m6);            }
        });

    }

    protected void sendSMSMessage(String x) {


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.SEND_SMS)) {
            } else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.SEND_SMS},
                        MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }
        else {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo[0], null, x, null, null);
            Toast.makeText(getApplicationContext(), "SMS Send 1", Toast.LENGTH_LONG).show();

            SmsManager smsManager1 = SmsManager.getDefault();
            smsManager1.sendTextMessage(phoneNo[1], null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent. 2" , Toast.LENGTH_LONG).show();

            SmsManager smsManager2 = SmsManager.getDefault();
            smsManager2.sendTextMessage(phoneNo[2], null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent 3." , Toast.LENGTH_LONG).show();

            SmsManager smsManager3 = SmsManager.getDefault();
            smsManager3.sendTextMessage(phoneNo[3], null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent. 4" , Toast.LENGTH_LONG).show();

            SmsManager smsManager4 = SmsManager.getDefault();
            smsManager4.sendTextMessage(phoneNo[0], null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent. 5" , Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                        SmsManager smsManager = SmsManager.getDefault();
                      smsManager.sendTextMessage(phoneNo[0], null, message, null, null);
                        Toast.makeText(getApplicationContext(), "SMS Send 1", Toast.LENGTH_LONG).show();

                    SmsManager smsManager1 = SmsManager.getDefault();
                    smsManager1.sendTextMessage(phoneNo[1], null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent. 2" , Toast.LENGTH_LONG).show();

                    SmsManager smsManager2 = SmsManager.getDefault();
                    smsManager2.sendTextMessage(phoneNo[2], null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent 3." , Toast.LENGTH_LONG).show();

                    SmsManager smsManager3 = SmsManager.getDefault();
                    smsManager3.sendTextMessage(phoneNo[3], null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent. 4" , Toast.LENGTH_LONG).show();

                    SmsManager smsManager4 = SmsManager.getDefault();
                    smsManager4.sendTextMessage(phoneNo[0], null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent. 5" , Toast.LENGTH_LONG).show();


                }
                else {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }
}