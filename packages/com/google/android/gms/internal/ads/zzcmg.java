package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmg implements AppEventListener, zzbsu, zzbsz, zzbtm, zzbtp, zzbuj, zzbvj, zzdpl, zzut {
    private long startTime;
    private final List<Object> zzedm;
    private final zzclu zzgfy;

    public zzcmg(zzclu zzcluVar, zzbii zzbiiVar) {
        this.zzgfy = zzcluVar;
        this.zzedm = Collections.singletonList(zzbiiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(zzdlj zzdljVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzbz(Context context) {
        zza(zzbtp.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzca(Context context) {
        zza(zzbtp.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzcb(Context context) {
        zza(zzbtp.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zza(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.startTime;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        zzaxy.zzei(sb.toString());
        zza(zzbuj.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzuw zzuwVar) {
        zza(zzbsz.class, "onAdFailedToLoad", Integer.valueOf(zzuwVar.errorCode), zzuwVar.zzcgr, zzuwVar.zzcgs);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
        zza(zzbsu.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
        zza(zzbsu.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
        zza(zzbsu.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void onAdClicked() {
        zza(zzut.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void onAdImpression() {
        zza(zzbtm.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
        zza(zzbsu.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    @ParametersAreNonnullByDefault
    public final void zzb(zzatj zzatjVar, String str, String str2) {
        zza(zzbsu.class, "onRewarded", zzatjVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
        zza(zzbsu.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str) {
        zza(zzdpd.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzb(zzdpg zzdpgVar, String str) {
        zza(zzdpd.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str, Throwable th) {
        zza(zzdpd.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzc(zzdpg zzdpgVar, String str) {
        zza(zzdpd.class, "onTaskSucceeded", str);
    }

    private final void zza(Class<?> cls, String str, Object... objArr) {
        zzclu zzcluVar = this.zzgfy;
        List<Object> list = this.zzedm;
        String valueOf = String.valueOf(cls.getSimpleName());
        zzcluVar.zza(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(zzasp zzaspVar) {
        this.startTime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
        zza(zzbvj.class, "onAdRequest", new Object[0]);
    }
}
