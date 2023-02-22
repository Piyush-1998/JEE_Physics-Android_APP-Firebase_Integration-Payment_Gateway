package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeir extends zzefg {
    private final zzeit zziix;
    private zzefk zziiy = zzbhj();
    private final /* synthetic */ zzeis zziiz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeir(zzeis zzeisVar) {
        this.zziiz = zzeisVar;
        this.zziix = new zzeit(this.zziiz, null);
    }

    private final zzefk zzbhj() {
        if (this.zziix.hasNext()) {
            return (zzefk) ((zzefm) this.zziix.next()).iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zziiy != null;
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final byte nextByte() {
        zzefk zzefkVar = this.zziiy;
        if (zzefkVar == null) {
            throw new NoSuchElementException();
        }
        byte nextByte = zzefkVar.nextByte();
        if (!this.zziiy.hasNext()) {
            this.zziiy = zzbhj();
        }
        return nextByte;
    }
}
