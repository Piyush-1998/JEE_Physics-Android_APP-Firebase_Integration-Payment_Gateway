package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcba implements zzelo<zzcre<zzbzr>> {
    private final zzelx<zzdvw> zzfol;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzctc> zzfox;
    private final zzelx<zzcvl> zzfoy;

    public zzcba(zzelx<zzdpf> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzctc> zzelxVar3, zzelx<zzcvl> zzelxVar4) {
        this.zzfow = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzfox = zzelxVar3;
        this.zzfoy = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcre) zzelu.zza(new zzcvp(this.zzfow.get(), this.zzfol.get(), this.zzfoy.get(), this.zzfox.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
