package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfu implements Callable {
    private final zzcf.zza.C0008zza zzabc;
    private final zzex zzwg;

    public zzfu(zzex zzexVar, zzcf.zza.C0008zza c0008zza) {
        this.zzwg = zzexVar;
        this.zzabc = c0008zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzcy */
    public final Void call() throws Exception {
        if (this.zzwg.zzcp() != null) {
            this.zzwg.zzcp().get();
        }
        zzcf.zza zzco = this.zzwg.zzco();
        if (zzco != null) {
            try {
                synchronized (this.zzabc) {
                    zzcf.zza.C0008zza c0008zza = this.zzabc;
                    byte[] byteArray = zzco.toByteArray();
                    c0008zza.zza(byteArray, 0, byteArray.length, zzegc.zzbey());
                }
                return null;
            } catch (zzegz unused) {
                return null;
            }
        }
        return null;
    }
}
