package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchl<T> implements zzahf<Object> {
    private final WeakReference<T> zzgcu;
    private final String zzgcv;
    private final zzahf<T> zzgcw;
    private final /* synthetic */ zzchc zzgcx;

    private zzchl(zzchc zzchcVar, WeakReference<T> weakReference, String str, zzahf<T> zzahfVar) {
        this.zzgcx = zzchcVar;
        this.zzgcu = weakReference;
        this.zzgcv = str;
        this.zzgcw = zzahfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(Object obj, Map<String, String> map) {
        T t = this.zzgcu.get();
        if (t == null) {
            this.zzgcx.zzb(this.zzgcv, this);
        } else {
            this.zzgcw.zza(t, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchl(zzchc zzchcVar, WeakReference weakReference, String str, zzahf zzahfVar, zzchd zzchdVar) {
        this(zzchcVar, weakReference, str, zzahfVar);
    }
}
