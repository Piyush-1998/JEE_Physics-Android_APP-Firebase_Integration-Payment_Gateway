package com.pm161998.jeephysics;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Formula_view_pdf_files extends AppCompatActivity {
    DatabaseReference databaseReference;
    ListView myPDFListView;
    ProgressDialog progressDialog;
    List<uploadPDF> uploadPDFS;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_formula_view_pdf_files);
        checkConnection();
        this.myPDFListView = (ListView) findViewById(R.id.myListView);
        this.uploadPDFS = new ArrayList();
        viewAllFiles();
        this.myPDFListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.pm161998.jeephysics.Formula_view_pdf_files.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Intent intent = new Intent(Formula_view_pdf_files.this, formula_pdf_opener.class);
                intent.putExtra("EXTRA_MESSAGE", Formula_view_pdf_files.this.uploadPDFS.get(i).getUrl());
                Formula_view_pdf_files.this.startActivity(intent);
            }
        });
    }

    public void checkConnection() {
        if (((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            Toast.makeText(this, "No Internet Connection!!", 1).show();
        }
    }

    private void viewAllFiles() {
        DatabaseReference child = FirebaseDatabase.getInstance().getReference().child("formulas");
        this.databaseReference = child;
        child.addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Formula_view_pdf_files.2
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
                Formula_view_pdf_files.this.uploadPDFS.clear();
                for (DataSnapshot dataSnapshot2 : dataSnapshot.getChildren()) {
                    Formula_view_pdf_files.this.uploadPDFS.add((uploadPDF) dataSnapshot2.getValue(uploadPDF.class));
                }
                int size = Formula_view_pdf_files.this.uploadPDFS.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = Formula_view_pdf_files.this.uploadPDFS.get(i).getName();
                }
                Formula_view_pdf_files.this.myPDFListView.setAdapter((android.widget.ListAdapter) new ArrayAdapter<String>(Formula_view_pdf_files.this.getApplicationContext(), 17367043, strArr) { // from class: com.pm161998.jeephysics.Formula_view_pdf_files.2.1
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i2, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i2, view, viewGroup);
                        ((TextView) view2.findViewById(16908308)).setTextColor(ViewCompat.MEASURED_STATE_MASK);
                        return view2;
                    }
                });
            }
        });
    }
}
