package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzegq implements zzeia {
    private static final zzegq zzifr = new zzegq();

    private zzegq() {
    }

    public static zzegq zzbfs() {
        return zzifr;
    }

    @Override // com.google.android.gms.internal.ads.zzeia
    public final boolean zze(Class<?> cls) {
        return zzegp.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzeia
    public final zzehx zzf(Class<?> cls) {
        if (!zzegp.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzehx) zzegp.zzd(cls.asSubclass(zzegp.class)).zza(zzegp.zze.zzify, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
