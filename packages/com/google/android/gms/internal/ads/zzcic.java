package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcic implements zzelo<zzcre<zzchu>> {
    private final zzelx<zzcvp<zzchu, zzdlx, zzcsn>> zzfmq;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzcvp<zzchu, zzdlx, zzcso>> zzgdd;

    public zzcic(zzelx<zzcvp<zzchu, zzdlx, zzcsn>> zzelxVar, zzelx<zzcvp<zzchu, zzdlx, zzcso>> zzelxVar2, zzelx<zzdln> zzelxVar3) {
        this.zzfmq = zzelxVar;
        this.zzgdd = zzelxVar2;
        this.zzfos = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        zzcvp<zzchu, zzdlx, zzcsn> zzcvpVar;
        zzelx<zzcvp<zzchu, zzdlx, zzcsn>> zzelxVar = this.zzfmq;
        zzelx<zzcvp<zzchu, zzdlx, zzcso>> zzelxVar2 = this.zzgdd;
        if (zzchz.zzgdc[this.zzfos.get().zzhcb.zzhbf - 1] == 1) {
            zzcvpVar = zzelxVar.get();
        } else {
            zzcvpVar = zzelxVar2.get();
        }
        return (zzcre) zzelu.zza(zzcvpVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
