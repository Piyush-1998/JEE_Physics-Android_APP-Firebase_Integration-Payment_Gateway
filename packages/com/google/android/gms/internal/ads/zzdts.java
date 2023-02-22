package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdts<K, V> extends zzdtn<Map.Entry<K, V>> {
    private final transient int size;
    private final transient zzdtk<K, V> zzhno;
    private final transient Object[] zzhnp;
    private final transient int zzhnq = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdts(zzdtk<K, V> zzdtkVar, Object[] objArr, int i, int i2) {
        this.zzhno = zzdtkVar;
        this.zzhnp = objArr;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdub<Map.Entry<K, V>> zzawn() {
        return (zzdub) zzawr().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zza(Object[] objArr, int i) {
        return zzawr().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final zzdtg<Map.Entry<K, V>> zzawz() {
        return new zzdtv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zzhno.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
