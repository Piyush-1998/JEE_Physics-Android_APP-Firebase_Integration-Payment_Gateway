package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbis implements zzelo<zzbbg> {
    private final zzbih zzern;

    public zzbis(zzbih zzbihVar) {
        this.zzern = zzbihVar;
    }

    public static zzbbg zzb(zzbih zzbihVar) {
        return (zzbbg) zzelu.zza(zzbihVar.zzadg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzern);
    }
}
