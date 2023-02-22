package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdti<E> extends zzdtb<E> {
    private final zzdtg<E> zzhnc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdti(zzdtg<E> zzdtgVar, int i) {
        super(zzdtgVar.size(), i);
        this.zzhnc = zzdtgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtb
    protected final E get(int i) {
        return this.zzhnc.get(i);
    }
}
