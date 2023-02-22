package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzcf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfr extends zzgm {
    public zzfr(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    public final Void zzcy() throws Exception {
        if (this.zzwg.isInitialized()) {
            return super.call();
        }
        if (this.zzwg.zzck()) {
            zzcz();
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzwg.zzck()) {
            zzcz();
            return;
        }
        synchronized (this.zzabc) {
            this.zzabc.zzac((String) this.zzabm.invoke(null, this.zzwg.getContext()));
        }
    }

    private final void zzcz() {
        AdvertisingIdClient zzcs = this.zzwg.zzcs();
        if (zzcs == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzcs.getInfo();
            String zzar = zzfg.zzar(info.getId());
            if (zzar != null) {
                synchronized (this.zzabc) {
                    this.zzabc.zzac(zzar);
                    this.zzabc.zza(info.isLimitAdTrackingEnabled());
                    this.zzabc.zza(zzcf.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgm, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
