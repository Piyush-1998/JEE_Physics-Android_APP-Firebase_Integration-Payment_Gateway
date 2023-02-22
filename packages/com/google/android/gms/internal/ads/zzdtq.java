package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdtq<E> extends zzdtg<E> {
    static final zzdtg<Object> zzhnm = new zzdtq(new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhnn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtq(Object[] objArr, int i) {
        this.zzhnn = objArr;
        this.size = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zzawp() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final Object[] zzawo() {
        return this.zzhnn;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    final int zzawq() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtg, com.google.android.gms.internal.ads.zzdtf
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhnn, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdsv.zzs(i, this.size);
        return (E) this.zzhnn[i];
    }
}
