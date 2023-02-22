package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzedn {
    private final zzeee zzhyy;
    private final zzeee zzhyz;

    public zzedn(byte[] bArr, byte[] bArr2) {
        this.zzhyy = zzeee.zzs(bArr);
        this.zzhyz = zzeee.zzs(bArr2);
    }

    public final byte[] zzbct() {
        zzeee zzeeeVar = this.zzhyy;
        if (zzeeeVar == null) {
            return null;
        }
        return zzeeeVar.getBytes();
    }

    public final byte[] zzbcu() {
        zzeee zzeeeVar = this.zzhyz;
        if (zzeeeVar == null) {
            return null;
        }
        return zzeeeVar.getBytes();
    }
}
