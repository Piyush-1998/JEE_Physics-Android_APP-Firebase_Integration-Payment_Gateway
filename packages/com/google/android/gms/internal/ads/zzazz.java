package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazz extends zzaa<zzy> {
    private final Map<String, String> zzam;
    private final zzbbq<zzy> zzecd;
    private final zzbax zzece;

    public zzazz(String str, zzbbq<zzy> zzbbqVar) {
        this(str, null, zzbbqVar);
    }

    private zzazz(String str, Map<String, String> map, zzbbq<zzy> zzbbqVar) {
        super(0, str, new zzazy(zzbbqVar));
        this.zzam = null;
        this.zzecd = zzbbqVar;
        zzbax zzbaxVar = new zzbax();
        this.zzece = zzbaxVar;
        zzbaxVar.zza(str, "GET", null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzaa
    public final zzaj<zzy> zza(zzy zzyVar) {
        return zzaj.zza(zzyVar, zzbc.zzb(zzyVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaa
    public final /* synthetic */ void zza(zzy zzyVar) {
        zzy zzyVar2 = zzyVar;
        this.zzece.zza(zzyVar2.zzam, zzyVar2.statusCode);
        zzbax zzbaxVar = this.zzece;
        byte[] bArr = zzyVar2.data;
        if (zzbax.isEnabled() && bArr != null) {
            zzbaxVar.zzi(bArr);
        }
        this.zzecd.set(zzyVar2);
    }
}
