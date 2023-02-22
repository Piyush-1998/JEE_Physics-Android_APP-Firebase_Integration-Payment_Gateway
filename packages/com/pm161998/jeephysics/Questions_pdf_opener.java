package com.pm161998.jeephysics;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class Questions_pdf_opener extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    InterstitialAd mInterstitialAd;
    private PDFView pdfView;
    private TextView text1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_questions_pdf_opener);
        MobileAds.initialize(this, "ca-app-pub-9421094793250690/2664145375");
        new AdRequest.Builder().build();
        prepareAd();
        this.pdfView = (PDFView) findViewById(R.id.pdfView);
        this.text1 = (TextView) findViewById(R.id.text1);
        String stringExtra = getIntent().getStringExtra("pdfFileName");
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.progressBar2);
        checkConnection();
        if (stringExtra.equals("Sample_Calorimetry&ThermalExpansion_Advanced_Pdfs")) {
            this.database.getReference("Advanced_Calorimetry&ThermalExpansion_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.1
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_CurrentElectricity_Advanced_Pdfs")) {
            this.database.getReference("Advanced_CurrentElectricity_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.2
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_FluidMechancis_Advanced_Pdfs")) {
            this.database.getReference("Advanced_FluidMechanics_ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.3
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_MathematicalTools_Advanced_Pdfs")) {
            this.database.getReference("Advanced_MathematicalTools_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.4
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_MeasurementError_Advanced_Pdfs")) {
            this.database.getReference("Advanced_MeasurementError&Experiment_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.5
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_ProjectileMotion_Advanced_Pdfs")) {
            this.database.getReference("Advanced_ProjectileMotion_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.6
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_POC_Advanced_Pdfs")) {
            this.database.getReference("Advanced_PrincipleofCommunication_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.7
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Sample_Units&Dimension_Advanced_Pdfs")) {
            this.database.getReference("Advanced_Units&Dimension_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.8
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced Question Pdfs - 1")) {
            startActivity(new Intent(this, paidpdfs.class));
            finish();
        }
        if (stringExtra.equals("Advanced Question Pdfs - 2")) {
            startActivity(new Intent(this, paidpdfs2.class));
            finish();
        }
        if (stringExtra.equals("Advanced Question Pdfs - 3")) {
            startActivity(new Intent(this, paidpdfs3.class));
            finish();
        }
        if (stringExtra.equals("Advanced Question Pdfs - 4")) {
            startActivity(new Intent(this, paidpdfs4.class));
            finish();
        }
        if (stringExtra.equals("Advanced Question Pdfs - 5")) {
            startActivity(new Intent(this, paidpdfs5.class));
            finish();
        }
        if (stringExtra.equals("Advanced Question Pdfs - 6")) {
            startActivity(new Intent(this, paidpdfs6.class));
            finish();
        }
        if (stringExtra.equals("Advanced Question Pdfs - 7")) {
            startActivity(new Intent(this, paidpdfs7.class));
            finish();
        }
        if (stringExtra.equals("Simple_AlternatingCurrent_Ex_1")) {
            this.database.getReference("Simple_AlternatingCurrent_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.9
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_AlternatingCurrent_Ex_2")) {
            startActivity(new Intent(this, paidpdfs.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_AlternatingCurrent_Ex_3")) {
            this.database.getReference("Yearwise_AlternatingCurrent_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.10
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("AlternatingCurrent_Solutions")) {
            this.database.getReference("AlternatingCurrent_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.11
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Calorimetry&ThermalExpansion_Ex_1")) {
            this.database.getReference("Simple_Calorimetry&ThermalExpansion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.12
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Calorimetry&ThermalExpansion_Ex_2")) {
            this.database.getReference("Advanced_Calorimetry&ThermalExpansion_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.13
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_Calorimetry&ThermalExpansion_Ex_3")) {
            this.database.getReference("Yearwise_Calorimetry&ThermalExpansion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.14
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Calorimetry&ThermalExpansion_Solutions")) {
            this.database.getReference("Calorimetry&ThermalExpansion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.15
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Capacitance_Ex_1")) {
            this.database.getReference("Simple_Capacitance_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.16
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Capacitance_Ex_2")) {
            startActivity(new Intent(this, paidpdfs.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_Capacitance_Ex_3")) {
            this.database.getReference("Yearwise_Capacitance_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.17
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Capacitance_Solutions")) {
            this.database.getReference("Capacitance_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.18
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_CenterofMass_Ex_1")) {
            this.database.getReference("Simple_CenterofMass_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.19
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_CenterofMass_Ex_2")) {
            startActivity(new Intent(this, paidpdfs.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_CenterofMass_Ex_3")) {
            this.database.getReference("Yearwise_CenterofMass_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.20
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("CenterofMass_Solutions")) {
            this.database.getReference("CenterofMass_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.21
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_CircularMotion_Ex_1")) {
            this.database.getReference("Simple_CircularMotion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.22
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_CircularMotion_Ex_2")) {
            startActivity(new Intent(this, paidpdfs.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_CircularMotion_Ex_3")) {
            this.database.getReference("Yearwise_CircularMotion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.23
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("CircularMotion_Solutions")) {
            this.database.getReference("CircularMotion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.24
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_CurrentElectricity_Ex_1")) {
            this.database.getReference("Simple_CurrentElectricity_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.25
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_CurrentElectricity_Ex_2")) {
            this.database.getReference("Advanced_CurrentElectricity_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.26
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_CurrentElectricity_Ex_3")) {
            this.database.getReference("Yearwise_CurrentElectricity_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.27
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("CurrentElectricity_Solutions")) {
            this.database.getReference("CurrentElectricity_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.28
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_ElectromagneticInduction_Ex_1")) {
            this.database.getReference("Simple_ElectromagneticInduction_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.29
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_ElectromagneticInduction_Ex_2")) {
            startActivity(new Intent(this, paidpdfs2.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_ElectromagneticInduction_Ex_3")) {
            this.database.getReference("Yearwise_ElectromagneticInduction_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.30
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("ElectromagneticInduction_Solutions")) {
            this.database.getReference("ElectromagneticInduction_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.31
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_ElectromagneticWave_Ex_1")) {
            this.database.getReference("Simple_ElectromagneticWave_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.32
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_ElectromagneticWave_Ex_2")) {
            startActivity(new Intent(this, paidpdfs2.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_ElectromagneticWave_Ex_3")) {
            this.database.getReference("Yearwise_ElectromagneticWave_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.33
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("ElectromagneticWave_Solutions")) {
            this.database.getReference("ElectromagneticWave_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.34
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Electrostatics_Ex_1")) {
            this.database.getReference("Simple_Electrostatics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.35
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Electrostatics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs2.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_Electrostatics_Ex_3")) {
            this.database.getReference("Yearwise_Electrostatics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.36
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Electrostatics_Solutions")) {
            this.database.getReference("Electrostatics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.37
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_FluidMechanics_ex_1")) {
            this.database.getReference("Simple_FluidMechanics_ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.38
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_FluidMechanics_ex_2")) {
            this.database.getReference("Advanced_FluidMechanics_ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.39
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_FluidMechanics_ex_3")) {
            this.database.getReference("Yearwise_FluidMechanics_ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.40
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("FluidMechanics_Solutions")) {
            this.database.getReference("FluidMechanics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.41
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Friction_Ex_1")) {
            this.database.getReference("Simple_Friction_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.42
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Friction_Ex_2")) {
            startActivity(new Intent(this, paidpdfs2.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_Friction_Ex_3")) {
            this.database.getReference("Yearwise_Friction_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.43
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Friction_Solutions")) {
            this.database.getReference("Friction_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.44
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_GeometricalOptics_Ex_1")) {
            this.database.getReference("Simple_GeometricalOptics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.45
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_GeometricalOptics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs3.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_GeometricalOptics_Ex_3")) {
            this.database.getReference("Yearwise_GeometricalOptics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.46
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("GeometricalOptics_Solutions")) {
            this.database.getReference("GeometricalOptics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.47
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Gravitation_Ex_1")) {
            this.database.getReference("Simple_Gravitation_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.48
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Gravitation_Ex_2")) {
            startActivity(new Intent(this, paidpdfs3.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_Gravitation_Ex_3")) {
            this.database.getReference("Yearwise_Gravitation_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.49
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Gravitation_Solutions")) {
            this.database.getReference("Gravitation_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.50
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_HeatTransfer_Ex_1")) {
            this.database.getReference("Simple_HeatTransfer_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.51
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_HeatTransfer_Ex_2")) {
            startActivity(new Intent(this, paidpdfs3.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_HeatTransfer_Ex_3")) {
            this.database.getReference("Yearwise_HeatTransfer_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.52
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("HeatTransfer_Solutions")) {
            this.database.getReference("HeatTransfer_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.53
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_KTG&Thermodynamics_Ex_1")) {
            this.database.getReference("Simple_KTG&Thermodynamics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.54
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_KTG&Thermodynamics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs3.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_KTG&Thermodynamics_Ex_3")) {
            this.database.getReference("Yearwise_KTG&Thermodynamics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.55
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("KTG&Thermodynamics_Solutions")) {
            this.database.getReference("KTG&Thermodynamics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.56
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_MagneticEffectofCurrent_Ex_1")) {
            this.database.getReference("Simple_MagneticEffectofCurrent_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.57
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_MagneticEffectofCurrent_Ex_2")) {
            startActivity(new Intent(this, paidpdfs4.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_MagneticEffectofCurrent_Ex_3")) {
            this.database.getReference("Yearwise_MagneticEffectofCurrent_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.58
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("MagneticEffectofCurrent_Solutions")) {
            this.database.getReference("MagneticEffectofCurrent_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.59
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_MathematicalTools_Ex_1")) {
            this.database.getReference("Simple_MathematicalTools_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.60
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_MathematicalTools_Ex_2")) {
            this.database.getReference("Advanced_MathematicalTools_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.61
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_MathematicalTools_Ex_3")) {
            this.database.getReference("Yearwise_MathematicalTools_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.62
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("MathematicalTools_Solutions")) {
            this.database.getReference("MathematicalTools_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.63
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_MeasurementError&Experiment_Ex_1")) {
            this.database.getReference("Simple_MeasurementError&Experiment_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.64
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_MeasurementError&Experiment_Ex_2")) {
            this.database.getReference("Advanced_MeasurementError&Experiment_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.65
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_MeasurementError&Experiment_Ex_3")) {
            this.database.getReference("Yearwise_MeasurementError&Experiment_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.66
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("MeasurementError&Experiment_Solutions")) {
            this.database.getReference("MeasurementError&Experiment_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.67
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_ModernPhysics_Ex_1")) {
            this.database.getReference("Simple_ModernPhysics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.68
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_ModernPhysics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs4.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_ModernPhysics_Ex_3")) {
            this.database.getReference("Yearwise_ModernPhysics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.69
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("ModernPhysics_Solutions")) {
            this.database.getReference("ModernPhysics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.70
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_NewtonsLawofMotion_Ex_1")) {
            this.database.getReference("Simple_NewtonsLawofMotion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.71
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_NewtonsLawofMotion_Ex_2")) {
            startActivity(new Intent(this, paidpdfs4.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_NewtonsLawofMotion_Ex_3")) {
            this.database.getReference("Yearwise_NewtonsLawofMotion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.72
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("NewtonsLawofMotion_Solutions")) {
            this.database.getReference("NewtonsLawofMotion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.73
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_NuclearPhysics_Ex_1")) {
            this.database.getReference("Simple_NuclearPhysics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.74
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_NuclearPhysics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs4.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_NuclearPhysics_Ex_3")) {
            this.database.getReference("Yearwise_NuclearPhysics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.75
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("NuclearPhysics_Solutions")) {
            this.database.getReference("NuclearPhysics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.76
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_PrincipleofCommunication_Ex_1")) {
            this.database.getReference("Simple_PrincipleofCommunication_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.77
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_PrincipleofCommunication_Ex_2")) {
            this.database.getReference("Advanced_PrincipleofCommunication_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.78
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_PrincipleofCommunication_Ex_3")) {
            this.database.getReference("Yearwise_PrincipleofCommunication_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.79
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("PrincipleofCommunication_Solutions")) {
            this.database.getReference("PrincipleofCommunication_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.80
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_ProjectileMotion_Ex_1")) {
            this.database.getReference("Simple_ProjectileMotion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.81
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_ProjectileMotion_Ex_2")) {
            this.database.getReference("Advanced_ProjectileMotion_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.82
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_ProjectileMotion_Ex_3")) {
            this.database.getReference("Yearwise_ProjectileMotion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.83
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("ProjectileMotion_Solutions")) {
            this.database.getReference("ProjectileMotion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.84
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_RectilinearMotion_Ex_1")) {
            this.database.getReference("Simple_RectilinearMotion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.85
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_RectilinearMotion_Ex_2")) {
            startActivity(new Intent(this, paidpdfs5.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_RectilinearMotion_Ex_3")) {
            this.database.getReference("Yearwise_RectilinearMotion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.86
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("RectilinearMotion_Solutions")) {
            this.database.getReference("RectilinearMotion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.87
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_RelativeMotion_Ex_1")) {
            this.database.getReference("Simple_RelativeMotion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.88
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_RelativeMotion_Ex_2")) {
            startActivity(new Intent(this, paidpdfs5.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_RelativeMotion_Ex_3")) {
            this.database.getReference("Yearwise_RelativeMotion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.89
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("RelativeMotion_Solutions")) {
            this.database.getReference("RelativeMotion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.90
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_RigidBodyDynamics_Ex_1")) {
            this.database.getReference("Simple_RigidBodyDynamics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.91
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_RigidBodyDynamics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs5.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_RigidBodyDynamics_Ex_3")) {
            this.database.getReference("Yearwise_RigidBodyDynamics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.92
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("RigidBodyDynamics_Solutions")) {
            this.database.getReference("RigidBodyDynamics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.93
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_SimpleHarmonicMotion_Ex_1")) {
            this.database.getReference("Simple_SimpleHarmonicMotion_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.94
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_SimpleHarmonicMotion_Ex_2")) {
            startActivity(new Intent(this, paidpdfs5.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_SimpleHarmonicMotion_Ex_3")) {
            this.database.getReference("Yearwise_SimpleHarmonicMotion_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.95
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("SimpleHarmonicMotion_Solutions")) {
            this.database.getReference("SimpleHarmonicMotion_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.96
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Solid&SemiconductorDevices_Ex_1")) {
            this.database.getReference("Simple_Solid&SemiconductorDevices_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.97
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Solid&SemiconductorDevices_Ex_2")) {
            startActivity(new Intent(this, paidpdfs6.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_Solid&SemiconductorDevices_Ex_3")) {
            this.database.getReference("Yearwise_Solid&SemiconductorDevices_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.98
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Solid&SemiconductorDevices_Solutions")) {
            this.database.getReference("Solid&SemiconductorDevices_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.99
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_SoundWave_Ex_1")) {
            this.database.getReference("Simple_SoundWave_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.100
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_SoundWave_Ex_2")) {
            startActivity(new Intent(this, paidpdfs6.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_SoundWave_Ex_3")) {
            this.database.getReference("Yearwise_SoundWave_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.101
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("SoundWave_Solutions")) {
            this.database.getReference("SoundWave_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.102
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_SurfaceTension_Ex_1")) {
            this.database.getReference("Simple_SurfaceTension_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.103
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_SurfaceTension_Ex_2")) {
            startActivity(new Intent(this, paidpdfs6.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_SurfaceTension_Ex_3")) {
            this.database.getReference("Yearwise_SurfaceTension_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.104
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("SurfaceTension_Solutions")) {
            this.database.getReference("SurfaceTension_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.105
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_Units&Dimension_Ex_1")) {
            this.database.getReference("Simple_Units&Dimension_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.106
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_Units&Dimension_Ex_2")) {
            this.database.getReference("Advanced_Units&Dimension_Ex_2").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.107
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Yearwise_Units&Dimension_Ex_3")) {
            this.database.getReference("Yearwise_Units&Dimension_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.108
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Units&Dimension_Solutions")) {
            this.database.getReference("Units&Dimension_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.109
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_WaveOnaString_Ex_1")) {
            this.database.getReference("Simple_WaveOnaString_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.110
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_WaveOnaString_Ex_2")) {
            startActivity(new Intent(this, paidpdfs6.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_WaveOnaString_Ex_3")) {
            this.database.getReference("Yearwise_WaveOnaString_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.111
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("WaveOnaString_Solutions")) {
            this.database.getReference("WaveOnaString_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.112
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_WaveOptics_Ex_1")) {
            this.database.getReference("Simple_WaveOptics_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.113
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_WaveOptics_Ex_2")) {
            startActivity(new Intent(this, paidpdfs7.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_WaveOptics_Ex_3")) {
            this.database.getReference("Yearwise_WaveOptics_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.114
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("WaveOptics_Solutions")) {
            this.database.getReference("WaveOptics_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.115
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Simple_WorkPower&Energy_Ex_1")) {
            this.database.getReference("Simple_WorkPower&Energy_Ex_1").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.116
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("Advanced_WorkPower&Energy_Ex_2")) {
            startActivity(new Intent(this, paidpdfs7.class));
            finish();
        }
        if (stringExtra.equals("Yearwise_WorkPower&Energy_Ex_3")) {
            this.database.getReference("Yearwise_WorkPower&Energy_Ex_3").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.117
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
        if (stringExtra.equals("WorkPower&Energy_Solutions")) {
            this.database.getReference("WorkPower&Energy_Solutions").addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.118
                @Override // com.google.firebase.database.ValueEventListener
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Questions_pdf_opener.this.text1.setText((String) dataSnapshot.getValue(String.class));
                    StyleableToast.makeText(Questions_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                    lottieAnimationView.playAnimation();
                    Questions_pdf_opener.this.pdfView.setVisibility(4);
                    new RetrivePdfStream().execute(Questions_pdf_opener.this.text1.getText().toString());
                }

                @Override // com.google.firebase.database.ValueEventListener
                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(Questions_pdf_opener.this, "Failed", 0).show();
                }
            });
        }
    }

    public void checkConnection() {
        if (((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            StyleableToast.makeText(this, "Oops!! No Internet Connection", R.style.negativexampleToast).show();
        }
    }

    /* loaded from: classes.dex */
    class RetrivePdfStream extends AsyncTask<String, Void, InputStream> implements OnLoadCompleteListener {
        RetrivePdfStream() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public InputStream doInBackground(String... strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
                if (httpURLConnection.getResponseCode() == 200) {
                    return new BufferedInputStream(httpURLConnection.getInputStream());
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(InputStream inputStream) {
            Questions_pdf_opener.this.pdfView.fromStream(inputStream).defaultPage(0).enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(Questions_pdf_opener.this)).spacing(2).swipeHorizontal(false).onLoad(this).load();
        }

        @Override // com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener
        public void loadComplete(int i) {
            Questions_pdf_opener.this.pdfView.setVisibility(0);
            ((LottieAnimationView) Questions_pdf_opener.this.findViewById(R.id.progressBar2)).cancelAnimation();
        }
    }

    public void prepareAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        this.mInterstitialAd = interstitialAd;
        interstitialAd.setAdUnitId("ca-app-pub-9421094793250690/2664145375");
        this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.mInterstitialAd.isLoaded()) {
            this.mInterstitialAd.show();
            this.mInterstitialAd.setAdListener(new AdListener() { // from class: com.pm161998.jeephysics.Questions_pdf_opener.119
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    Questions_pdf_opener.this.finish();
                }
            });
            return;
        }
        super.onBackPressed();
    }
}
