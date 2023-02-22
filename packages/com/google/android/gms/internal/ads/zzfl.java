package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfl extends zzgm {
    private static zzgl<String> zzaau = new zzgl<>();
    private final Context zzaav;

    public zzfl(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2, Context context) {
        super(zzexVar, str, str2, c0008zza, i, 29);
        this.zzaav = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zzx("E");
        AtomicReference<String> zzat = zzaau.zzat(this.zzaav.getPackageName());
        if (zzat.get() == null) {
            synchronized (zzat) {
                if (zzat.get() == null) {
                    zzat.set((String) this.zzabm.invoke(null, this.zzaav));
                }
            }
        }
        String str = zzat.get();
        synchronized (this.zzabc) {
            this.zzabc.zzx(zzcv.zza(str.getBytes(), true));
        }
    }
}
