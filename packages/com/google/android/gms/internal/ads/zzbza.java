package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbza implements zzbyx {
    private final List<String> zzdru;
    private final zzdps zzfli;
    private boolean zzfuo;

    public zzbza(zzdkx zzdkxVar, zzdps zzdpsVar) {
        this.zzdru = zzdkxVar.zzdru;
        this.zzfli = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final void zzaki() {
        if (this.zzfuo) {
            return;
        }
        this.zzfli.zzi(this.zzdru);
        this.zzfuo = true;
    }
}
