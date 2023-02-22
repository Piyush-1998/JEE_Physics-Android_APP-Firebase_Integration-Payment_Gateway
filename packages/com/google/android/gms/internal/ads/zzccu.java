package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccu {
    private zzadr zzcki;

    public zzccu(zzccm zzccmVar) {
        this.zzcki = zzccmVar;
    }

    public final synchronized zzadr zzss() {
        return this.zzcki;
    }

    public final synchronized void zza(zzadr zzadrVar) {
        this.zzcki = zzadrVar;
    }
}
