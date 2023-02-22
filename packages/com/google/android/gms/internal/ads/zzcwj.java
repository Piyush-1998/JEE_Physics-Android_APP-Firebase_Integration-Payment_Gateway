package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwj implements zzelo<zzcwh> {
    private final zzcwh zzgpe;

    private zzcwj(zzcwh zzcwhVar) {
        this.zzgpe = zzcwhVar;
    }

    public static zzcwj zzc(zzcwh zzcwhVar) {
        return new zzcwj(zzcwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        zzcwh zzcwhVar = this.zzgpe;
        if (zzcwhVar != null) {
            return (zzcwh) zzelu.zza(zzcwhVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
