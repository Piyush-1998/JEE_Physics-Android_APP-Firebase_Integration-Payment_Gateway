package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzeku implements zzbp {
    private static zzelg zzdc = zzelg.zzn(zzeku.class);
    private String type;
    private long zzawj;
    private zzbs zzipz;
    private ByteBuffer zziqc;
    private long zziqd;
    private zzela zziqf;
    private long zziqe = -1;
    private ByteBuffer zziqg = null;
    private boolean zziqb = true;
    boolean zziqa = true;

    private final synchronized void zzbji() {
        if (!this.zziqb) {
            try {
                zzelg zzelgVar = zzdc;
                String valueOf = String.valueOf(this.type);
                zzelgVar.zzik(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.zziqc = this.zziqf.zzh(this.zziqd, this.zziqe);
                this.zziqb = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract void zzl(ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: protected */
    public zzeku(String str) {
        this.type = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzela zzelaVar, ByteBuffer byteBuffer, long j, zzbo zzboVar) throws IOException {
        long position = zzelaVar.position();
        this.zziqd = position;
        this.zzawj = position - byteBuffer.remaining();
        this.zziqe = j;
        this.zziqf = zzelaVar;
        zzelaVar.zzfc(zzelaVar.position() + j);
        this.zziqb = false;
        this.zziqa = false;
        zzbjj();
    }

    public final synchronized void zzbjj() {
        zzbji();
        zzelg zzelgVar = zzdc;
        String valueOf = String.valueOf(this.type);
        zzelgVar.zzik(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.zziqc != null) {
            ByteBuffer byteBuffer = this.zziqc;
            this.zziqa = true;
            byteBuffer.rewind();
            zzl(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zziqg = byteBuffer.slice();
            }
            this.zziqc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbs zzbsVar) {
        this.zzipz = zzbsVar;
    }
}
