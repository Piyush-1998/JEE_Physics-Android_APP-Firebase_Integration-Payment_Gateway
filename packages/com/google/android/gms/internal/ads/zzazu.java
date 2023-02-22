package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazu extends zzbh {
    private final /* synthetic */ byte[] zzebx;
    private final /* synthetic */ Map zzeby;
    private final /* synthetic */ zzbax zzebz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzazu(zzazt zzaztVar, int i, String str, zzal zzalVar, zzai zzaiVar, byte[] bArr, Map map, zzbax zzbaxVar) {
        super(i, str, zzalVar, zzaiVar);
        this.zzebx = bArr;
        this.zzeby = map;
        this.zzebz = zzbaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaa
    public final byte[] zzg() throws zzl {
        byte[] bArr = this.zzebx;
        return bArr == null ? super.zzg() : bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaa
    public final Map<String, String> getHeaders() throws zzl {
        Map<String, String> map = this.zzeby;
        return map == null ? super.getHeaders() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh
    public final void zzj(String str) {
        this.zzebz.zzez(str);
        super.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzaa
    public final /* synthetic */ void zza(String str) {
        zza(str);
    }
}
