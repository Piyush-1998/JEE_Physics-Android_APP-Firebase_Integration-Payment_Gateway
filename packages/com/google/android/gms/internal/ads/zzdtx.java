package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdtx extends zzdtg<Object> {
    private final transient int offset;
    private final transient int size;
    private final transient Object[] zzhnp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtx(Object[] objArr, int i, int i2) {
        this.zzhnp = objArr;
        this.offset = i;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdsv.zzs(i, this.size);
        return this.zzhnp[(i * 2) + this.offset];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }
}
