package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzgm implements Callable {
    private final String TAG = getClass().getSimpleName();
    private final String className;
    protected final zzcf.zza.C0008zza zzabc;
    private final String zzabk;
    protected Method zzabm;
    private final int zzabq;
    private final int zzabr;
    protected final zzex zzwg;

    public zzgm(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        this.zzwg = zzexVar;
        this.className = str;
        this.zzabk = str2;
        this.zzabc = c0008zza;
        this.zzabq = i;
        this.zzabr = i2;
    }

    protected abstract void zzcw() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: zzcy */
    public Void call() throws Exception {
        long nanoTime;
        Method zza;
        try {
            nanoTime = System.nanoTime();
            zza = this.zzwg.zza(this.className, this.zzabk);
            this.zzabm = zza;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zza == null) {
            return null;
        }
        zzcw();
        zzdu zzcl = this.zzwg.zzcl();
        if (zzcl != null && this.zzabq != Integer.MIN_VALUE) {
            zzcl.zza(this.zzabr, this.zzabq, (System.nanoTime() - nanoTime) / 1000);
        }
        return null;
    }
}
