package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcqj implements Callable {
    private final zzcqi zzgjs;

    private zzcqj(zzcqi zzcqiVar) {
        this.zzgjs = zzcqiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Callable zza(zzcqi zzcqiVar) {
        return new zzcqj(zzcqiVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zzgjs.getWritableDatabase();
    }
}
