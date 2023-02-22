package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzadb {
    private static final AtomicReference<zzadc> zzdcc = new AtomicReference<>();
    static final AtomicBoolean zzdcd = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzadc zzrx() {
        return zzdcc.get();
    }

    public static void zza(zzadc zzadcVar) {
        zzdcc.set(zzadcVar);
    }
}
