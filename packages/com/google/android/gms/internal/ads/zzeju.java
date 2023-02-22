package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeju implements Iterator<String> {
    private final /* synthetic */ zzejs zzikj;
    private Iterator<String> zzilf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeju(zzejs zzejsVar) {
        zzehk zzehkVar;
        this.zzikj = zzejsVar;
        zzehkVar = this.zzikj.zzikk;
        this.zzilf = zzehkVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzilf.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzilf.next();
    }
}
