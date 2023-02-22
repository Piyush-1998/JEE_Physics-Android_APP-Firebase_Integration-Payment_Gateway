package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdx implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        zzdpy zzdpyVar;
        zzdp zzdpVar;
        zzdp zzdpVar2;
        try {
            zzdpVar = zzdy.zzxe;
            zzdpVar.zzbq();
            zzdpVar2 = zzdy.zzxe;
            zzdpVar2.zzbr();
        } catch (Exception e) {
            zzdpyVar = zzdy.zzxg;
            zzdpyVar.zza(2001, -1L, e);
        }
    }
}
