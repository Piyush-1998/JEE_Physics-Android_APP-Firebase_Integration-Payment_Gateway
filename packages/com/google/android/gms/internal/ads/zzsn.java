package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsn {
    private final int orientation;
    private final zzyo zzacu;
    private zzwu zzbun;
    private final String zzbuo;
    private final AppOpenAd.AppOpenAdLoadCallback zzbup;
    private final Context zzvr;
    private final zzamr zzbuq = new zzamr();
    private final zzvh zzacs = zzvh.zzchm;

    public zzsn(Context context, String str, zzyo zzyoVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzvr = context;
        this.zzbuo = str;
        this.zzacu = zzyoVar;
        this.orientation = i;
        this.zzbup = appOpenAdLoadCallback;
    }

    public final void zzms() {
        try {
            this.zzbun = zzwe.zzpr().zza(this.zzvr, zzvj.zzpk(), this.zzbuo, this.zzbuq);
            this.zzbun.zza(new zzvm(this.orientation));
            this.zzbun.zza(new zzsb(this.zzbup));
            this.zzbun.zza(zzvh.zza(this.zzvr, this.zzacu));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
