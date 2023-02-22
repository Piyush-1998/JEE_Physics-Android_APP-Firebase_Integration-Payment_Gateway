package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzkd implements zzke {
    private final long zzaid;

    public zzkd(long j) {
        this.zzaid = j;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final boolean isSeekable() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long zzdz(long j) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long getDurationUs() {
        return this.zzaid;
    }
}
