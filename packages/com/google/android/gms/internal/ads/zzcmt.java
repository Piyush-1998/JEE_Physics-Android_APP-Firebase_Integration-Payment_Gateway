package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzcmt extends Exception {
    private final int zzggv;

    public static zzuw zze(Throwable th) {
        if (th instanceof zzcmt) {
            return ((zzcmt) th).zzapd();
        }
        if (th instanceof zzazk) {
            zzazk zzazkVar = (zzazk) th;
            return new zzuw(zzazkVar.getErrorCode(), zzdsw.zzhi(zzazkVar.getMessage()), MobileAds.ERROR_DOMAIN, null);
        }
        return zzdmb.zza(zzdmd.zzhco, null, null);
    }

    public zzcmt(int i) {
        this.zzggv = i;
    }

    public zzcmt(int i, String str) {
        super(str);
        this.zzggv = i;
    }

    public zzcmt(int i, String str, Throwable th) {
        super(str, th);
        this.zzggv = i;
    }

    public final zzuw zzapd() {
        if (getMessage() == null) {
            return zzdmb.zza(this.zzggv, null, null);
        }
        return zzdmb.zza(this.zzggv, getMessage(), null);
    }
}
