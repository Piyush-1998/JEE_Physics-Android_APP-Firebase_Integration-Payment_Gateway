package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzekw extends zzeky implements zzbp {
    private String type;
    private long zzawj;
    private zzbs zzipz;
    private boolean zziqh;

    public zzekw(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbs zzbsVar) {
        this.zzipz = zzbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzela zzelaVar, ByteBuffer byteBuffer, long j, zzbo zzboVar) throws IOException {
        this.zzawj = zzelaVar.position() - byteBuffer.remaining();
        this.zziqh = byteBuffer.remaining() == 16;
        zza(zzelaVar, j, zzboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeky
    public final void zza(zzela zzelaVar, long j, zzbo zzboVar) throws IOException {
        this.zziqf = zzelaVar;
        this.zziql = zzelaVar.position();
        this.zzbgh = this.zziql - ((this.zziqh || 8 + j >= 4294967296L) ? 16 : 8);
        zzelaVar.zzfc(zzelaVar.position() + j);
        this.zzawf = zzelaVar.position();
        this.zziqj = zzboVar;
    }
}
