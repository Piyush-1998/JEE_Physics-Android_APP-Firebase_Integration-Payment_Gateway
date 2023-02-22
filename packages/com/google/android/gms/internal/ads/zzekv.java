package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzekv extends zzeku implements zzbp {
    private int flags;
    private int version;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzekv(String str) {
        super(str);
    }

    public final int getVersion() {
        if (!this.zziqa) {
            zzbjj();
        }
        return this.version;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzr(ByteBuffer byteBuffer) {
        this.version = zzbq.zza(byteBuffer.get());
        this.flags = (zzbq.zzg(byteBuffer) << 8) + 0 + zzbq.zza(byteBuffer.get());
        return 4L;
    }
}
