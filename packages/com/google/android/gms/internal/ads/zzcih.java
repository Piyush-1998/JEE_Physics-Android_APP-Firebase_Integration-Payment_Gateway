package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcih {
    private final zzbbg zzbpa;
    private final zzbfy zzbpp;
    private final zzto zzelx;
    private final zzeg zzenn;
    private final zzabt zzeno;
    private final com.google.android.gms.ads.internal.zzb zzenq;
    private final zzsq zzens;
    private final zzdln zzfqn;
    private final zzbvb zzgdg;
    private final Context zzvr;

    public zzcih(zzbfy zzbfyVar, Context context, zzdln zzdlnVar, zzeg zzegVar, zzabt zzabtVar, zzbbg zzbbgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzto zztoVar, zzbvb zzbvbVar, zzbzq zzbzqVar) {
        this.zzbpp = zzbfyVar;
        this.zzvr = context;
        this.zzfqn = zzdlnVar;
        this.zzenn = zzegVar;
        this.zzeno = zzabtVar;
        this.zzbpa = zzbbgVar;
        this.zzenq = zzbVar;
        this.zzelx = zztoVar;
        this.zzgdg = zzbvbVar;
        this.zzens = zzbzqVar;
    }

    public final zzbfq zzc(zzvj zzvjVar) throws zzbgc {
        return zza(zzvjVar, false);
    }

    public final zzbfq zza(zzvj zzvjVar, boolean z) throws zzbgc {
        return zzbfy.zza(this.zzvr, zzbhj.zzb(zzvjVar), zzvjVar.zzacx, false, false, this.zzenn, this.zzeno, this.zzbpa, null, new zzcik(this), this.zzenq, this.zzelx, this.zzens, z);
    }
}
