package com.pm161998.jeephysics;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class formula_pdf_opener extends AppCompatActivity {
    InterstitialAd mInterstitialAd;
    DatabaseReference mref2 = FirebaseDatabase.getInstance().getReference().child("formulas");
    private PDFView pdfView;
    private TextView text1;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_formula_pdf_opener);
        MobileAds.initialize(this, "ca-app-pub-9421094793250690/2664145375");
        new AdRequest.Builder().build();
        prepareAd();
        this.pdfView = (PDFView) findViewById(R.id.pdfView);
        this.text1 = (TextView) findViewById(R.id.text1);
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.progressBar2);
        this.mref2.addValueEventListener(new ValueEventListener() { // from class: com.pm161998.jeephysics.formula_pdf_opener.1
            @Override // com.google.firebase.database.ValueEventListener
            public void onCancelled(DatabaseError databaseError) {
            }

            @Override // com.google.firebase.database.ValueEventListener
            public void onDataChange(DataSnapshot dataSnapshot) {
                formula_pdf_opener.this.text1.setText(formula_pdf_opener.this.getIntent().getStringExtra("EXTRA_MESSAGE"));
                StyleableToast.makeText(formula_pdf_opener.this, "Loading Please Wait!!!", R.style.exampleToast).show();
                lottieAnimationView.playAnimation();
                formula_pdf_opener.this.pdfView.setVisibility(4);
                new RetrivePdfStream().execute(formula_pdf_opener.this.text1.getText().toString());
            }
        });
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
            formula_pdf_opener.this.pdfView.fromStream(inputStream).defaultPage(0).enableAnnotationRendering(true).scrollHandle(new DefaultScrollHandle(formula_pdf_opener.this)).spacing(2).swipeHorizontal(false).onLoad(this).load();
        }

        @Override // com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener
        public void loadComplete(int i) {
            formula_pdf_opener.this.pdfView.setVisibility(0);
            ((LottieAnimationView) formula_pdf_opener.this.findViewById(R.id.progressBar2)).cancelAnimation();
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
            this.mInterstitialAd.setAdListener(new AdListener() { // from class: com.pm161998.jeephysics.formula_pdf_opener.2
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                    formula_pdf_opener.this.finish();
                }
            });
            return;
        }
        super.onBackPressed();
    }
}
