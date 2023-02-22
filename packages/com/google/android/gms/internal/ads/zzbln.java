package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbln implements zzbsu, zzbti, zzbtm, zzbuj, zzut {
    private final Executor executor;
    private final View view;
    private final zzabt zzeno;
    private final ScheduledExecutorService zzflf;
    private final zzdlj zzflg;
    private final zzdkx zzflh;
    private final zzdps zzfli;
    private final zzeg zzflj;
    private final zzaby zzflk;
    private boolean zzfll;
    private boolean zzflm;
    private final Context zzvr;

    public zzbln(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, zzdlj zzdljVar, zzdkx zzdkxVar, zzdps zzdpsVar, View view, zzeg zzegVar, zzabt zzabtVar, zzaby zzabyVar) {
        this.zzvr = context;
        this.executor = executor;
        this.zzflf = scheduledExecutorService;
        this.zzflg = zzdljVar;
        this.zzflh = zzdkxVar;
        this.zzfli = zzdpsVar;
        this.zzflj = zzegVar;
        this.view = view;
        this.zzeno = zzabtVar;
        this.zzflk = zzabyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final synchronized void onAdLoaded() {
        if (this.zzfll) {
            ArrayList arrayList = new ArrayList(this.zzflh.zzdit);
            arrayList.addAll(this.zzflh.zzhai);
            this.zzfli.zza(this.zzflg, this.zzflh, true, null, null, arrayList);
        } else {
            this.zzfli.zza(this.zzflg, this.zzflh, this.zzflh.zzhak);
            this.zzfli.zza(this.zzflg, this.zzflh, this.zzflh.zzhai);
        }
        this.zzfll = true;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void onAdClicked() {
        if (!zzacl.zzdah.get().booleanValue()) {
            zzdps zzdpsVar = this.zzfli;
            zzdlj zzdljVar = this.zzflg;
            zzdkx zzdkxVar = this.zzflh;
            zzdpsVar.zza(zzdljVar, zzdkxVar, zzdkxVar.zzdis);
            return;
        }
        zzdvl.zza(zzdvc.zzg(this.zzflk.zza(this.zzvr, null, this.zzeno.zzrs(), this.zzeno.zzrt())).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcoh)).longValue(), TimeUnit.MILLISECONDS, this.zzflf), new zzblq(this), this.executor);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final synchronized void onAdImpression() {
        if (!this.zzflm) {
            String zza = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcre)).booleanValue() ? this.zzflj.zzca().zza(this.zzvr, this.view, (Activity) null) : null;
            if (!zzacl.zzdai.get().booleanValue()) {
                this.zzfli.zza(this.zzflg, this.zzflh, false, zza, null, this.zzflh.zzdit);
                this.zzflm = true;
                return;
            }
            zzdvl.zza(zzdvc.zzg(this.zzflk.zzc(this.zzvr, null)).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcoh)).longValue(), TimeUnit.MILLISECONDS, this.zzflf), new zzblp(this, zza), this.executor);
            this.zzflm = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zzb(zzatj zzatjVar, String str, String str2) {
        zzdps zzdpsVar = this.zzfli;
        zzdlj zzdljVar = this.zzflg;
        zzdkx zzdkxVar = this.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, zzdkxVar.zzdsj, zzatjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
        zzdps zzdpsVar = this.zzfli;
        zzdlj zzdljVar = this.zzflg;
        zzdkx zzdkxVar = this.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, zzdkxVar.zzdsi);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
        zzdps zzdpsVar = this.zzfli;
        zzdlj zzdljVar = this.zzflg;
        zzdkx zzdkxVar = this.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, zzdkxVar.zzhaj);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzf(zzuw zzuwVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpw)).booleanValue()) {
            zzdps zzdpsVar = this.zzfli;
            zzdlj zzdljVar = this.zzflg;
            zzdkx zzdkxVar = this.zzflh;
            zzdpsVar.zza(zzdljVar, zzdkxVar, zzdkxVar.zzhal);
        }
    }
}
