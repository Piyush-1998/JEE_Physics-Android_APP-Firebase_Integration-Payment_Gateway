package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzefn {
    private final byte[] buffer;
    private final zzefz zzibi;

    private zzefn(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzibi = zzefz.zzw(bArr);
    }

    public final zzeff zzbdr() {
        this.zzibi.zzbeu();
        return new zzefp(this.buffer);
    }

    public final zzefz zzbds() {
        return this.zzibi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzefn(int i, zzefe zzefeVar) {
        this(i);
    }
}
