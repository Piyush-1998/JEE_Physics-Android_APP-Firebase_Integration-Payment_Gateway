package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdvn<V> implements Runnable {
    private final Future<V> zzhpu;
    private final zzdvi<? super V> zzhpv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvn(Future<V> future, zzdvi<? super V> zzdviVar) {
        this.zzhpu = future;
        this.zzhpv = zzdviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future<V> future = this.zzhpu;
        if ((future instanceof zzdwo) && (zza = zzdwn.zza((zzdwo) future)) != null) {
            this.zzhpv.zzb(zza);
            return;
        }
        try {
            this.zzhpv.onSuccess(zzdvl.zza(this.zzhpu));
        } catch (Error e) {
            e = e;
            this.zzhpv.zzb(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzhpv.zzb(e);
        } catch (ExecutionException e3) {
            this.zzhpv.zzb(e3.getCause());
        }
    }

    public final String toString() {
        return zzdso.zzx(this).zzy(this.zzhpv).toString();
    }
}
