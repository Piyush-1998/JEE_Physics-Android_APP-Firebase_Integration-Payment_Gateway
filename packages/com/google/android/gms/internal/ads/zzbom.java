package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbom implements zzelo<zzcre<zzbni>> {
    private final zzelx<zzdvw> zzfol;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzcsa> zzfox;
    private final zzelx<zzcvl> zzfoy;

    public zzbom(zzelx<zzdpf> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcsa> zzelxVar3, zzelx<zzcvl> zzelxVar4) {
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
