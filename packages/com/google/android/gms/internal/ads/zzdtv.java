package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdtv extends zzdtg<Map.Entry<K, V>> {
    private final /* synthetic */ zzdts zzhnt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtv(zzdts zzdtsVar) {
        this.zzhnt = zzdtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zzhnt.size;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zzhnt.size;
        zzdsv.zzs(i, i2);
        objArr = this.zzhnt.zzhnp;
        int i3 = i * 2;
        zzdts zzdtsVar = this.zzhnt;
        Object obj = objArr[i3];
        objArr2 = zzdtsVar.zzhnp;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
