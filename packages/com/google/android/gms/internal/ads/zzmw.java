package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzmw implements zznm {
    private final int track;
    private final /* synthetic */ zzmn zzbeg;

    public zzmw(zzmn zzmnVar, int i) {
        this.zzbeg = zzmnVar;
        this.track = i;
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final boolean isReady() {
        return this.zzbeg.zzbb(this.track);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzhq() throws IOException {
        this.zzbeg.zzhq();
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final int zzb(zzhq zzhqVar, zzjk zzjkVar, boolean z) {
        return this.zzbeg.zza(this.track, zzhqVar, zzjkVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zznm
    public final void zzeh(long j) {
        this.zzbeg.zzd(this.track, j);
    }
}
