package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzben {
    private long zzdh;

    public final long zzq(ByteBuffer byteBuffer) {
        zzbu zzbuVar;
        zzbr zzbrVar;
        long j = this.zzdh;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<zzbp> it = new zzbn(new zzbek(duplicate), zzbep.zzeko).zzbjk().iterator();
            while (true) {
                zzbuVar = null;
                if (!it.hasNext()) {
                    zzbrVar = null;
                    break;
                }
                zzbp next = it.next();
                if (next instanceof zzbr) {
                    zzbrVar = (zzbr) next;
                    break;
                }
            }
            Iterator<zzbp> it2 = zzbrVar.zzbjk().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzbp next2 = it2.next();
                if (next2 instanceof zzbu) {
                    zzbuVar = (zzbu) next2;
                    break;
                }
            }
            long duration = (zzbuVar.getDuration() * 1000) / zzbuVar.zzr();
            this.zzdh = duration;
            return duration;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
