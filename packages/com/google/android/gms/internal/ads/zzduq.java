package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzduq implements Runnable {
    private final /* synthetic */ zzdup zzhoz;
    private final /* synthetic */ zzdtf zzhpg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduq(zzdup zzdupVar, zzdtf zzdtfVar) {
        this.zzhoz = zzdupVar;
        this.zzhpg = zzdtfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzhoz.zza(this.zzhpg);
    }
}
