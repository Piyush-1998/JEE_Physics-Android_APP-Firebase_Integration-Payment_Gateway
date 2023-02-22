package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcyt implements zzdvi<zzczg> {
    private final /* synthetic */ zzawt zzgrs;
    private final /* synthetic */ zzcyk zzgrt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyt(zzcyk zzcykVar, zzawt zzawtVar) {
        this.zzgrt = zzcykVar;
        this.zzgrs = zzawtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        try {
            zzawt zzawtVar = this.zzgrs;
            String valueOf = String.valueOf(th.getMessage());
            zzawtVar.onError(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzczg zzczgVar) {
        zzbbg zzbbgVar;
        zzczg zzczgVar2 = zzczgVar;
        try {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
                zzbbgVar = this.zzgrt.zzbop;
                if (zzbbgVar.zzedr >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcxe)).intValue()) {
                    if (zzczgVar2 == null) {
                        this.zzgrs.zza(null, null, null);
                        return;
                    } else {
                        this.zzgrs.zza(zzczgVar2.zzgsb, zzczgVar2.zzgsc, zzczgVar2.zzgsd);
                        return;
                    }
                }
            }
            if (zzczgVar2 == null) {
                this.zzgrs.zzk(null, null);
            } else {
                this.zzgrs.zzk(zzczgVar2.zzgsb, zzczgVar2.zzgsc);
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
