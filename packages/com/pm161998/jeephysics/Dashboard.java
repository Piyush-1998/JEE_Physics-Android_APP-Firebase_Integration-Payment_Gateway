package com.pm161998.jeephysics;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.ads.InterstitialAd;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import hotchemi.android.rate.AppRate;
import maes.tech.intentanim.CustomIntent;

/* loaded from: classes.dex */
public class Dashboard extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    Button btn_book;
    Button btn_cheatbook;
    Button btn_flt;
    Button btn_formula;
    Button btn_mock;
    Button btn_physics;
    Button btn_question;
    Button btn_syllabus;
    InterstitialAd mInterstitialAd;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_dashboard);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        this.btn_syllabus = (Button) findViewById(R.id.buttonSyllabus);
        this.btn_formula = (Button) findViewById(R.id.buttonFormula);
        this.btn_cheatbook = (Button) findViewById(R.id.buttonCheat);
        this.btn_book = (Button) findViewById(R.id.buttonBook);
        this.btn_question = (Button) findViewById(R.id.buttonQuestion);
        this.btn_physics = (Button) findViewById(R.id.buttonPhysics);
        this.btn_mock = (Button) findViewById(R.id.buttonMock);
        this.btn_flt = (Button) findViewById(R.id.buttonFlt);
        checkConnection();
        AppRate.with(this).setInstallDays(1).setLaunchTimes(3).setRemindInterval(2).monitor();
        AppRate.showRateDialogIfMeetsConditions(this);
        AppRate.with(this).clearAgreeShowDialog();
        this.btn_syllabus.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), Syllabus_View_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "left-to-right");
            }
        });
        this.btn_formula.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), Formula_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "right-to-left");
            }
        });
        this.btn_cheatbook.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), CheatBook_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "bottom-to-up");
            }
        });
        this.btn_book.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), Books_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "up-to-bottom");
            }
        });
        this.btn_question.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), Questions_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "bottom-to-up");
            }
        });
        this.btn_physics.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), PhysicsTest_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "up-to-bottom");
            }
        });
        this.btn_mock.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), MockTest_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "right-to-left");
            }
        });
        this.btn_flt.setOnClickListener(new View.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Dashboard.this.startActivity(new Intent(Dashboard.this.getApplicationContext(), Flt_view_pdf_files.class));
                CustomIntent.customType(Dashboard.this, "left-to-right");
            }
        });
    }

    public void checkConnection() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getType() == 1) {
                StyleableToast.makeText(this, "You are online!!", R.style.positivexampleToast).show();
            }
            if (activeNetworkInfo.getType() == 0) {
                StyleableToast.makeText(this, "You are online!!", R.style.positivexampleToast).show();
                return;
            }
            return;
        }
        StyleableToast.makeText(this, "Oops!! No Internet Connection", R.style.negativexampleToast).show();
    }

    private void showStartDialog() {
        new AlertDialog.Builder(this).setTitle("Good News!!").setMessage("Content within this app gets updated automatically as per availability.").setPositiveButton("Ok Fine", new DialogInterface.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create().show();
        SharedPreferences.Editor edit = getSharedPreferences("prefs", 0).edit();
        edit.putBoolean("firstStart", false);
        edit.apply();
    }

    private void showsecondStartDialog() {
        new AlertDialog.Builder(this).setTitle("Welcome to the App!").setMessage("Just getting started? This app needs INTERNET CONNECTION for proper functioning.Keep Studying!!!").setPositiveButton("Let's go", new DialogInterface.OnClickListener() { // from class: com.pm161998.jeephysics.Dashboard.10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create().show();
        SharedPreferences.Editor edit = getSharedPreferences("prefs", 0).edit();
        edit.putBoolean("firstStart", false);
        edit.apply();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.backPressedTime + 2000 > System.currentTimeMillis()) {
            this.backToast.cancel();
            super.onBackPressed();
            return;
        }
        Toast makeText = Toast.makeText(getBaseContext(), "Press back again to exit", 0);
        this.backToast = makeText;
        makeText.show();
        this.backPressedTime = System.currentTimeMillis();
    }
}
