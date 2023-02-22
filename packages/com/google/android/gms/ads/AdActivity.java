package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzwe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzaql zzacp;

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaql zzb = zzwe.zzpr().zzb(this);
        this.zzacp = zzb;
        if (zzb == null) {
            zzbbd.zze("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzb.onCreate(bundle);
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            if (this.zzacp != null) {
                this.zzacp.onRestart();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            if (this.zzacp != null) {
                this.zzacp.onStart();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            if (this.zzacp != null) {
                this.zzacp.onResume();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            if (this.zzacp != null) {
                this.zzacp.onPause();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzacp != null) {
                this.zzacp.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            if (this.zzacp != null) {
                this.zzacp.onStop();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            if (this.zzacp != null) {
                this.zzacp.onDestroy();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    private final void zzdo() {
        zzaql zzaqlVar = this.zzacp;
        if (zzaqlVar != null) {
            try {
                zzaqlVar.zzdo();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zzdo();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzdo();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzdo();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzacp != null) {
                z = this.zzacp.zzuq();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzacp.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzacp.zzad(ObjectWrapper.wrap(configuration));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
