package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcev implements zzelo<zzcdd> {
    private final zzelx<zzceu> zzfez;
    private final zzcew zzgat;

    public zzcev(zzcew zzcewVar, zzelx<zzceu> zzelxVar) {
        this.zzgat = zzcewVar;
        this.zzfez = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcdd) zzelu.zza(this.zzfez.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
