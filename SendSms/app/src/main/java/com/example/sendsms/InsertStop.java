package com.example.sendsms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertStop extends AppCompatActivity {

    EditText sn,cn,mo;
    Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_stop);
        sn=findViewById(R.id.stopname);
        cn=findViewById(R.id.childname);
        mo=findViewById(R.id.mobileno);
        sub=findViewById(R.id.submit);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                send();
            }
        });
    }
    public void send(){
        String a=sn.getText().toString();
        String b=cn.getText().toString();
        String c=mo.getText().toString();
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("users");

// Creating new user node, which returns the unique key value
// new user node would be /users/$userid/
        String userId = mDatabase.push().getKey();

// creating user object
        save user = new save("Ravi Tamada","hello", "ravi@androidhive.info");

// pushing user to 'users' node using the userId
        mDatabase.child(userId).setValue(user);
        Toast.makeText(InsertStop.this,a +" "+ b + " " + c,Toast.LENGTH_SHORT).show();

    }
}
