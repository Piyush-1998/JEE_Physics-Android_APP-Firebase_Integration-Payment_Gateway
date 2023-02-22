package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbn extends zzeky implements Closeable {
    private static zzelg zzdc = zzelg.zzn(zzbn.class);

    public zzbn(zzela zzelaVar, zzbo zzboVar) throws IOException {
        zza(zzelaVar, zzelaVar.size(), zzboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeky, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zziqf.close();
    }

    @Override // com.google.android.gms.internal.ads.zzeky
    public String toString() {
        String obj = this.zziqf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
