package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzla implements zzky {
    private final zzpk zzawe;
    private final int zzawy;
    private final int zzaxc;

    public zzla(zzkt zzktVar) {
        zzpk zzpkVar = zzktVar.zzawe;
        this.zzawe = zzpkVar;
        zzpkVar.zzbo(12);
        this.zzaxc = this.zzawe.zzjd();
        this.zzawy = this.zzawe.zzjd();
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgw() {
        return this.zzawy;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final int zzgx() {
        int i = this.zzaxc;
        return i == 0 ? this.zzawe.zzjd() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final boolean zzgy() {
        return this.zzaxc != 0;
    }
}
