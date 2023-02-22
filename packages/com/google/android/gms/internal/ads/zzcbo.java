package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbo implements zzelo<zzcdg> {
    private final zzcbj zzfvo;

    private zzcbo(zzcbj zzcbjVar) {
        this.zzfvo = zzcbjVar;
    }

    public static zzcbo zzd(zzcbj zzcbjVar) {
        return new zzcbo(zzcbjVar);
    }

    public static zzcdg zze(zzcbj zzcbjVar) {
        return (zzcdg) zzelu.zza(zzcbjVar.zzaku(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zze(this.zzfvo);
    }
}
