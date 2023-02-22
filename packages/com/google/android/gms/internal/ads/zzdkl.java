package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkl extends zzauk {
    private final String zzbuo;
    private final zzdli zzfsl;
    private final Context zzgpr;
    private final zzdkd zzgzu;
    private final zzdje zzgzv;
    private zzchu zzgzw;

    public zzdkl(String str, zzdkd zzdkdVar, Context context, zzdje zzdjeVar, zzdli zzdliVar) {
        this.zzbuo = str;
        this.zzgzu = zzdkdVar;
        this.zzgzv = zzdjeVar;
        this.zzfsl = zzdliVar;
        this.zzgpr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final synchronized void zza(zzvc zzvcVar, zzaut zzautVar) throws RemoteException {
        zza(zzvcVar, zzautVar, zzdlf.zzhbi);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final synchronized void zzb(zzvc zzvcVar, zzaut zzautVar) throws RemoteException {
        zza(zzvcVar, zzautVar, zzdlf.zzhbj);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zza(iObjectWrapper, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final synchronized void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzgzw == null) {
            zzaxy.zzfe("Rewarded can not be shown before loaded");
            this.zzgzv.zzf(zzdmb.zza(zzdmd.zzhcw, null, null));
            return;
        }
        this.zzgzw.zzb(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgzw == null || this.zzgzw.zzaim() == null) {
            return null;
        }
        return this.zzgzw.zzaim().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final boolean isLoaded() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzchu zzchuVar = this.zzgzw;
        return (zzchuVar == null || zzchuVar.zzanh()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzaum zzaumVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgzv.zzb(zzaumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzauu zzauuVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgzv.zzb(zzauuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzxz zzxzVar) {
        if (zzxzVar == null) {
            this.zzgzv.zza(null);
        } else {
            this.zzgzv.zza(new zzdkk(this, zzxzVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzchu zzchuVar = this.zzgzw;
        return zzchuVar != null ? zzchuVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final zzaug zzqw() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzchu zzchuVar = this.zzgzw;
        if (zzchuVar != null) {
            return zzchuVar.zzqw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final synchronized void zza(zzavc zzavcVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdli zzdliVar = this.zzfsl;
        zzdliVar.zzdve = zzavcVar.zzdve;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcod)).booleanValue()) {
            zzdliVar.zzdvf = zzavcVar.zzdvf;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final zzyf zzkg() {
        zzchu zzchuVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue() && (zzchuVar = this.zzgzw) != null) {
            return zzchuVar.zzaim();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzya zzyaVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.zzgzv.zzc(zzyaVar);
    }

    private final synchronized void zza(zzvc zzvcVar, zzaut zzautVar, int i) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzgzv.zzb(zzautVar);
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvcVar.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            this.zzgzv.zzg(zzdmb.zza(zzdmd.zzhcr, null, null));
        } else if (this.zzgzw != null) {
        } else {
            zzdka zzdkaVar = new zzdka(null);
            this.zzgzu.zzea(i);
            this.zzgzu.zza(zzvcVar, this.zzbuo, zzdkaVar, new zzdkn(this));
        }
    }
}
