package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqk;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzu extends zzaqk {
    private Activity zzaas;
    private AdOverlayInfoParcel zzdpb;
    private boolean zzdnu = false;
    private boolean zzdpc = false;

    public zzu(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdpb = adOverlayInfoParcel;
        this.zzaas = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onBackPressed() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onRestart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onStart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void zzdo() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final boolean zzuq() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdpb;
        if (adOverlayInfoParcel == null) {
            this.zzaas.finish();
        } else if (z) {
            this.zzaas.finish();
        } else {
            if (bundle == null) {
                if (adOverlayInfoParcel.zzcgq != null) {
                    this.zzdpb.zzcgq.onAdClicked();
                }
                if (this.zzaas.getIntent() != null && this.zzaas.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && this.zzdpb.zzdor != null) {
                    this.zzdpb.zzdor.zzuj();
                }
            }
            com.google.android.gms.ads.internal.zzp.zzkn();
            if (zzb.zza(this.zzaas, this.zzdpb.zzdoq, this.zzdpb.zzdov)) {
                return;
            }
            this.zzaas.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onResume() throws RemoteException {
        if (this.zzdnu) {
            this.zzaas.finish();
            return;
        }
        this.zzdnu = true;
        if (this.zzdpb.zzdor != null) {
            this.zzdpb.zzdor.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdnu);
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onPause() throws RemoteException {
        if (this.zzdpb.zzdor != null) {
            this.zzdpb.zzdor.onPause();
        }
        if (this.zzaas.isFinishing()) {
            zzva();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onStop() throws RemoteException {
        if (this.zzaas.isFinishing()) {
            zzva();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onDestroy() throws RemoteException {
        if (this.zzaas.isFinishing()) {
            zzva();
        }
    }

    private final synchronized void zzva() {
        if (!this.zzdpc) {
            if (this.zzdpb.zzdor != null) {
                this.zzdpb.zzdor.zzui();
            }
            this.zzdpc = true;
        }
    }
}
