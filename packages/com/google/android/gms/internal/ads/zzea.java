package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzea implements Runnable {
    private final /* synthetic */ Context zzxp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzea(zzdy zzdyVar, Context context) {
        this.zzxp = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdpy zzdpyVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdy.zzxe;
            zzdpVar.zzb(this.zzxp);
        } catch (Exception e) {
            zzdpyVar = zzdy.zzxg;
            zzdpyVar.zza(2019, -1L, e);
        }
    }
}
