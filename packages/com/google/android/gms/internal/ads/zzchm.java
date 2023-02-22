package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchm implements Callable<zzchc> {
    private final zzbfy zzbpp;
    private final zzbbg zzdpq;
    private final zzeg zzenn;
    private final Executor zzfmk;
    private final com.google.android.gms.ads.internal.zzb zzgbm;
    private final Context zzvr;

    public zzchm(Context context, Executor executor, zzeg zzegVar, zzbbg zzbbgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbfy zzbfyVar) {
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzenn = zzegVar;
        this.zzdpq = zzbbgVar;
        this.zzgbm = zzbVar;
        this.zzbpp = zzbfyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzchc call() throws Exception {
        zzchc zzchcVar = new zzchc(this);
        zzchcVar.zzang();
        return zzchcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Context zza(zzchm zzchmVar) {
        return zzchmVar.zzvr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Executor zzb(zzchm zzchmVar) {
        return zzchmVar.zzfmk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzeg zzc(zzchm zzchmVar) {
        return zzchmVar.zzenn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbbg zzd(zzchm zzchmVar) {
        return zzchmVar.zzdpq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.ads.internal.zzb zze(zzchm zzchmVar) {
        return zzchmVar.zzgbm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbfy zzf(zzchm zzchmVar) {
        return zzchmVar.zzbpp;
    }
}
