package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeji implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzeja zzijy;
    private Iterator<Map.Entry<K, V>> zzijz;
    private boolean zzikd;

    private zzeji(zzeja zzejaVar) {
        this.zzijy = zzejaVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzijy.zzijt;
        if (i >= list.size()) {
            map = this.zzijy.zziju;
            if (map.isEmpty() || !zzbhv().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzikd) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzikd = false;
        this.zzijy.zzbht();
        int i = this.pos;
        list = this.zzijy.zzijt;
        if (i < list.size()) {
            zzeja zzejaVar = this.zzijy;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zzejaVar.zzhq(i2);
            return;
        }
        zzbhv().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzbhv() {
        Map map;
        if (this.zzijz == null) {
            map = this.zzijy.zziju;
            this.zzijz = map.entrySet().iterator();
        }
        return this.zzijz;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzikd = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzijy.zzijt;
        if (i >= list.size()) {
            return (Map.Entry) zzbhv().next();
        }
        list2 = this.zzijy.zzijt;
        return (Map.Entry) list2.get(this.pos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeji(zzeja zzejaVar, zzeiz zzeizVar) {
        this(zzejaVar);
    }
}
