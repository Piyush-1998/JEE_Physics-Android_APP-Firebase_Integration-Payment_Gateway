package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdtl extends zzdtg<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ zzdtg zzhnh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtl(zzdtg zzdtgVar, int i, int i2) {
        this.zzhnh = zzdtgVar;
        this.offset = i;
        this.length = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final Object[] zzawo() {
        return this.zzhnh.zzawo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zzawp() {
        return this.zzhnh.zzawp() + this.offset;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    final int zzawq() {
        return this.zzhnh.zzawp() + this.offset + this.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzdsv.zzs(i, this.length);
        return this.zzhnh.get(i + this.offset);
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final zzdtg<E> zzu(int i, int i2) {
        zzdsv.zzf(i, i2, this.length);
        zzdtg zzdtgVar = this.zzhnh;
        int i3 = this.offset;
        return (zzdtg) zzdtgVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.ads.zzdtg, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
