package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbt extends zzeku {
    private ByteBuffer zzdd;

    public zzbt(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    public final void zzl(ByteBuffer byteBuffer) {
        this.zzdd = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
