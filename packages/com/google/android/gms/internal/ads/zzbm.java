package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzbm implements zzbo {
    private static Logger zzda = Logger.getLogger(zzbm.class.getName());
    private ThreadLocal<ByteBuffer> zzdb = new zzbl(this);

    public abstract zzbp zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzbo
    public final zzbp zza(zzela zzelaVar, zzbs zzbsVar) throws IOException {
        int read;
        long size;
        long position = zzelaVar.position();
        this.zzdb.get().rewind().limit(8);
        do {
            read = zzelaVar.read(this.zzdb.get());
            if (read == 8) {
                this.zzdb.get().rewind();
                long zzf = zzbq.zzf(this.zzdb.get());
                byte[] bArr = null;
                if (zzf < 8 && zzf > 1) {
                    Logger logger = zzda;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zzf);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                String zzk = zzbq.zzk(this.zzdb.get());
                if (zzf == 1) {
                    this.zzdb.get().limit(16);
                    zzelaVar.read(this.zzdb.get());
                    this.zzdb.get().position(8);
                    size = zzbq.zzh(this.zzdb.get()) - 16;
                } else {
                    size = zzf == 0 ? zzelaVar.size() - zzelaVar.position() : zzf - 8;
                }
                if ("uuid".equals(zzk)) {
                    this.zzdb.get().limit(this.zzdb.get().limit() + 16);
                    zzelaVar.read(this.zzdb.get());
                    bArr = new byte[16];
                    for (int position2 = this.zzdb.get().position() - 16; position2 < this.zzdb.get().position(); position2++) {
                        bArr[position2 - (this.zzdb.get().position() - 16)] = this.zzdb.get().get(position2);
                    }
                    size -= 16;
                }
                long j = size;
                zzbp zza = zza(zzk, bArr, zzbsVar instanceof zzbp ? ((zzbp) zzbsVar).getType() : "");
                zza.zza(zzbsVar);
                this.zzdb.get().rewind();
                zza.zza(zzelaVar, this.zzdb.get(), j, this);
                return zza;
            }
        } while (read >= 0);
        zzelaVar.zzfc(position);
        throw new EOFException();
    }
}
