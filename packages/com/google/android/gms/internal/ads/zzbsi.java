package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsi implements zzelo<Bundle> {
    private final zzbsg zzfsm;

    private zzbsi(zzbsg zzbsgVar) {
        this.zzfsm = zzbsgVar;
    }

    public static zzbsi zzi(zzbsg zzbsgVar) {
        return new zzbsi(zzbsgVar);
    }

    public static Bundle zzj(zzbsg zzbsgVar) {
        return zzbsgVar.zzajh();
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return this.zzfsm.zzajh();
    }
}
