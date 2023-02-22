package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzefe extends zzefg {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ zzeff zzibc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefe(zzeff zzeffVar) {
        this.zzibc = zzeffVar;
        this.limit = this.zzibc.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final byte nextByte() {
        int i = this.position;
        if (i >= this.limit) {
            throw new NoSuchElementException();
        }
        this.position = i + 1;
        return this.zzibc.zzfv(i);
    }
}
