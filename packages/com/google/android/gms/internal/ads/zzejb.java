package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzejb extends zzejh {
    private final /* synthetic */ zzeja zzijy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzejb(zzeja zzejaVar) {
        super(zzejaVar, null);
        this.zzijy = zzejaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzejc(this.zzijy, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzejb(zzeja zzejaVar, zzeiz zzeizVar) {
        this(zzejaVar);
    }
}
