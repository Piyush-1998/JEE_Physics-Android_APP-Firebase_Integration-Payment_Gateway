package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrn {
    private final zzgr zzhkk;
    private final File zzhkl;
    private final File zzhkm;
    private final File zzhkn;
    private byte[] zzhko;

    public zzdrn(zzgr zzgrVar, File file, File file2, File file3) {
        this.zzhkk = zzgrVar;
        this.zzhkl = file;
        this.zzhkm = file3;
        this.zzhkn = file2;
    }

    public final zzgr zzavw() {
        return this.zzhkk;
    }

    public final File zzavx() {
        return this.zzhkl;
    }

    public final File zzavy() {
        return this.zzhkm;
    }

    public final byte[] zzavz() {
        if (this.zzhko == null) {
            this.zzhko = zzdrp.zzf(this.zzhkn);
        }
        byte[] bArr = this.zzhko;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean zza() {
        return System.currentTimeMillis() / 1000 > this.zzhkk.zzdi();
    }

    public final boolean zzfg(long j) {
        return this.zzhkk.zzdi() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
