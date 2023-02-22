package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdxi<P> {
    private final P zzhrb;
    private final byte[] zzhrc;
    private final zzebu zzhrd;
    private final zzecn zzhre;
    private final int zzhrf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxi(P p, byte[] bArr, zzebu zzebuVar, zzecn zzecnVar, int i) {
        this.zzhrb = p;
        this.zzhrc = Arrays.copyOf(bArr, bArr.length);
        this.zzhrd = zzebuVar;
        this.zzhre = zzecnVar;
        this.zzhrf = i;
    }

    public final P zzaxz() {
        return this.zzhrb;
    }

    public final zzebu zzaya() {
        return this.zzhrd;
    }

    public final zzecn zzayb() {
        return this.zzhre;
    }

    public final byte[] zzayc() {
        byte[] bArr = this.zzhrc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
