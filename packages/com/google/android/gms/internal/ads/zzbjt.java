package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbjt implements zzbop {
    private zzelx<zzdkx> zzeui;
    private zzelx<Set<zzbys<zzbtp>>> zzeuu;
    private zzelx<zzbto> zzeuv;
    private zzelx<zzbvi> zzeuw;
    private zzelx<zzdlj> zzeuy;
    private zzelx<Set<zzbys<zzbuj>>> zzewe;
    private zzelx<zzbue> zzewf;
    private zzelx<String> zzeww;
    private zzelx<zzbsp> zzewx;
    private zzelx<zzbpg> zzewy;
    private final /* synthetic */ zzbjr zzfhb;
    private final zzbos zzfhw;
    private zzelx<zzafq> zzfhx;
    private zzelx<Runnable> zzfhy;
    private zzelx<zzboo> zzfhz;

    private zzbjt(zzbjr zzbjrVar, zzbpt zzbptVar, zzbos zzbosVar) {
        zzelx zzelxVar;
        this.zzfhb = zzbjrVar;
        this.zzfhw = zzbosVar;
        this.zzeuy = zzbpy.zze(zzbptVar);
        this.zzeui = zzbpw.zzc(zzbptVar);
        zzelt zzbjo = zzelt.zzar(0, 2).zzav(zzbjr.zzl(this.zzfhb)).zzav(zzbjr.zzk(this.zzfhb)).zzbjo();
        this.zzeuu = zzbjo;
        this.zzeuv = zzell.zzas(zzbtv.zzj(zzbjo));
        zzelt zzbjo2 = zzelt.zzar(4, 3).zzau(zzbjr.zzh(this.zzfhb)).zzau(zzbjr.zzg(this.zzfhb)).zzau(zzbjr.zzf(this.zzfhb)).zzav(zzbjr.zzai(this.zzfhb)).zzav(zzbjr.zzah(this.zzfhb)).zzav(zzbjr.zzag(this.zzfhb)).zzau(zzbjr.zzc(this.zzfhb)).zzbjo();
        this.zzewe = zzbjo2;
        this.zzewf = zzell.zzas(zzbug.zzl(zzbjo2));
        zzbpv zza = zzbpv.zza(zzbptVar);
        this.zzeww = zza;
        this.zzewx = zzbso.zzt(this.zzeui, zza);
        this.zzeuw = zzell.zzas(zzbwj.zzajr());
        this.zzewy = zzbqy.zza(this.zzeuy, this.zzeui, this.zzeuv, this.zzewf, zzbjr.zzaj(this.zzfhb), this.zzewx, this.zzeuw);
        this.zzfhx = new zzbou(zzbosVar);
        zzbor zzborVar = new zzbor(zzbosVar);
        this.zzfhy = zzborVar;
        zzelx<zzbpg> zzelxVar2 = this.zzewy;
        zzelx<zzafq> zzelxVar3 = this.zzfhx;
        zzelxVar = this.zzfhb.zzeud.zzery;
        this.zzfhz = zzell.zzas(new zzbot(zzelxVar2, zzelxVar3, zzborVar, zzelxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbop
    public final zzbni zzafy() {
        return (zzbni) zzelu.zza(this.zzfhz.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
