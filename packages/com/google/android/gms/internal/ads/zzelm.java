package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzelm<T> implements zzelo<T> {
    private zzelx<T> zzirc;

    @Override // com.google.android.gms.internal.ads.zzelx
    public final T get() {
        zzelx<T> zzelxVar = this.zzirc;
        if (zzelxVar == null) {
            throw new IllegalStateException();
        }
        return zzelxVar.get();
    }

    public static <T> void zzbk(zzelx<T> zzelxVar, zzelx<T> zzelxVar2) {
        zzelu.checkNotNull(zzelxVar2);
        zzelm zzelmVar = (zzelm) zzelxVar;
        if (zzelmVar.zzirc != null) {
            throw new IllegalStateException();
        }
        zzelmVar.zzirc = zzelxVar2;
    }
}
