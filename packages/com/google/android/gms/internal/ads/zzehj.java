package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzehj {
    private static final zzehj zzihl = new zzehl();
    private static final zzehj zzihm = new zzeho();

    private zzehj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzehj zzbgp() {
        return zzihl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzehj zzbgq() {
        return zzihm;
    }
}
