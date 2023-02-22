package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzmt {
    private final zzjx zzarf;
    private final zzjv[] zzbej;
    private zzjv zzbek;

    public zzmt(zzjv[] zzjvVarArr, zzjx zzjxVar) {
        this.zzbej = zzjvVarArr;
        this.zzarf = zzjxVar;
    }

    public final zzjv zza(zzjy zzjyVar, Uri uri) throws IOException, InterruptedException {
        zzjv zzjvVar = this.zzbek;
        if (zzjvVar != null) {
            return zzjvVar;
        }
        zzjv[] zzjvVarArr = this.zzbej;
        int length = zzjvVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjv zzjvVar2 = zzjvVarArr[i];
            try {
            } catch (EOFException unused) {
            } finally {
                zzjyVar.zzgo();
            }
            if (zzjvVar2.zza(zzjyVar)) {
                this.zzbek = zzjvVar2;
                break;
            }
            i++;
        }
        zzjv zzjvVar3 = this.zzbek;
        if (zzjvVar3 == null) {
            String zza = zzpq.zza(this.zzbej);
            StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
            sb.append("None of the available extractors (");
            sb.append(zza);
            sb.append(") could read the stream.");
            throw new zzns(sb.toString(), uri);
        }
        zzjvVar3.zza(this.zzarf);
        return this.zzbek;
    }

    public final void release() {
        zzjv zzjvVar = this.zzbek;
        if (zzjvVar != null) {
            zzjvVar.release();
            this.zzbek = null;
        }
    }
}
