package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzm extends zzxn {
    private zzaim zzckn;

    @Override // com.google.android.gms.internal.ads.zzxk
    public final String getVersionString() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void setAppMuted(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void setAppVolume(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(zzamu zzamuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(zzzw zzzwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzch(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzci(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final float zzqd() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final boolean zzqe() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzqg() {
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void initialize() throws RemoteException {
        zzbbd.zzfc("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzbat.zzaah.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzzl
            private final zzzm zzckm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzckm = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzckm.zzqv();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(zzaim zzaimVar) throws RemoteException {
        this.zzckn = zzaimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final List<zzaif> zzqf() throws RemoteException {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzqv() {
        zzaim zzaimVar = this.zzckn;
        if (zzaimVar != null) {
            try {
                zzaimVar.zze(Collections.emptyList());
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onComplete event.", e);
            }
        }
    }
}
