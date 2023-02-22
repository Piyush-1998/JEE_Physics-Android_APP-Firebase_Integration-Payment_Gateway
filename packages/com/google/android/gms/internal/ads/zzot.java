package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzot {
    private final ExecutorService zzbja;
    private zzov<? extends zzoy> zzbjb;
    private IOException zzbjc;

    public zzot(String str) {
        this.zzbja = zzpq.zzbi(str);
    }

    public final <T extends zzoy> long zza(T t, zzow<T> zzowVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzoz.checkState(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzov(this, myLooper, t, zzowVar, i, elapsedRealtime).zzek(0L);
        return elapsedRealtime;
    }

    public final boolean isLoading() {
        return this.zzbjb != null;
    }

    public final void zziq() {
        this.zzbjb.zzl(false);
    }

    public final void zza(Runnable runnable) {
        zzov<? extends zzoy> zzovVar = this.zzbjb;
        if (zzovVar != null) {
            zzovVar.zzl(true);
        }
        this.zzbja.execute(runnable);
        this.zzbja.shutdown();
    }

    public final void zzbj(int i) throws IOException {
        IOException iOException = this.zzbjc;
        if (iOException != null) {
            throw iOException;
        }
        zzov<? extends zzoy> zzovVar = this.zzbjb;
        if (zzovVar != null) {
            zzovVar.zzbj(zzovVar.zzbjh);
        }
    }
}
