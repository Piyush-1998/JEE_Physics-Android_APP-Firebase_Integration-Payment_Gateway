package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzejc implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzeja zzijy;
    private Iterator<Map.Entry<K, V>> zzijz;

    private zzejc(zzeja zzejaVar) {
        List list;
        this.zzijy = zzejaVar;
        list = this.zzijy.zzijt;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzijy.zzijt;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzbhv().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbhv() {
        Map map;
        if (this.zzijz == null) {
            map = this.zzijy.zzijw;
            this.zzijz = map.entrySet().iterator();
        }
        return this.zzijz;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zzbhv().hasNext()) {
            return (Map.Entry) zzbhv().next();
        }
        list = this.zzijy.zzijt;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzejc(zzeja zzejaVar, zzeiz zzeizVar) {
        this(zzejaVar);
    }
}
