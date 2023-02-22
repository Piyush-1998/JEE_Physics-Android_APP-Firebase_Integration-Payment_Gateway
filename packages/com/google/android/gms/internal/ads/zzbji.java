package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbji extends zzdff {
    private final /* synthetic */ zzbjc zzeud;
    private zzelx<String> zzeyj;
    private zzelx<zzcku> zzeyz;
    private zzelx<Map<zzdpg, zzcku>> zzezb;
    private zzelx<Set<zzbys<zzdpl>>> zzezd;
    private zzelx<Set<zzbys<zzdpl>>> zzezk;
    private zzelx zzezl;
    private zzelx<zzdpf> zzezm;
    private zzelx<ApplicationInfo> zzezw;
    private zzelx<zzdgj> zzfbb;
    private final zzdgo zzfeg;
    private zzelx<zzdfb> zzfeh;
    private zzelx<String> zzfei;
    private zzelx<zzdfl> zzfej;
    private zzelx<Integer> zzfek;
    private zzelx<zzdfp> zzfel;
    private zzelx<zzdfv> zzfem;
    private zzelx<zzdga> zzfen;
    private zzelx<Boolean> zzfeo;
    private zzelx<zzdgn> zzfep;
    private zzelx<zzdhb> zzfeq;
    private zzelx<zzcku> zzfer;
    private zzelx<zzcku> zzfes;
    private zzelx<zzcku> zzfet;

    private zzbji(zzbjc zzbjcVar, zzdgo zzdgoVar) {
        zzbkz zzbkzVar;
        zzelx zzelxVar;
        zzelx zzelxVar2;
        zzbiu zzbiuVar;
        zzelx zzelxVar3;
        zzbkz zzbkzVar2;
        zzelx zzelxVar4;
        zzelx zzelxVar5;
        zzelx zzelxVar6;
        zzbkt zzbktVar;
        zzelx zzelxVar7;
        zzbkv zzbkvVar;
        zzelx zzelxVar8;
        zzelx zzelxVar9;
        zzbkx zzbkxVar;
        zzelx zzelxVar10;
        zzelx zzelxVar11;
        zzelx zzelxVar12;
        zzelx zzelxVar13;
        this.zzeud = zzbjcVar;
        this.zzfeg = zzdgoVar;
        zzbkzVar = zzblc.zzflb;
        zzelxVar = this.zzeud.zzesf;
        zzelxVar2 = this.zzeud.zzesa;
        this.zzfeh = new zzdfc(zzbkzVar, zzelxVar, zzelxVar2, zzdof.zzaul());
        this.zzfei = new zzdgr(zzdgoVar);
        zzbiuVar = zzbix.zzers;
        zzelxVar3 = this.zzeud.zzesf;
        this.zzfej = new zzdfn(zzbiuVar, zzelxVar3, this.zzfei, zzdof.zzaul());
        this.zzfek = new zzdgs(zzdgoVar);
        zzbkzVar2 = zzblc.zzflb;
        zzelx<Integer> zzelxVar14 = this.zzfek;
        zzelxVar4 = this.zzeud.zzesf;
        zzelxVar5 = this.zzeud.zzesy;
        zzelxVar6 = this.zzeud.zzesa;
        this.zzfel = new zzdft(zzbkzVar2, zzelxVar14, zzelxVar4, zzelxVar5, zzelxVar6, zzdof.zzaul());
        zzbktVar = zzbkw.zzfkx;
        zzdof zzaul = zzdof.zzaul();
        zzelxVar7 = this.zzeud.zzesf;
        this.zzfem = new zzdfx(zzbktVar, zzaul, zzelxVar7);
        zzbkvVar = zzbky.zzfky;
        this.zzfen = new zzdgc(zzbkvVar, zzdof.zzaul(), this.zzfei);
        this.zzfeo = new zzdgt(zzdgoVar);
        this.zzezw = new zzdgq(zzdgoVar);
        zzelxVar8 = this.zzeud.zzeta;
        zzelxVar9 = this.zzeud.zzesa;
        this.zzfbb = new zzdgl(zzelxVar8, zzelxVar9, this.zzfeo, this.zzezw);
        zzbkxVar = zzbla.zzfkz;
        zzelxVar10 = this.zzeud.zzesa;
        zzelxVar11 = this.zzeud.zzesf;
        this.zzfep = new zzdgp(zzbkxVar, zzelxVar10, zzelxVar11);
        this.zzfeq = new zzdhd(zzdof.zzaul());
        this.zzeyj = new zzdgv(zzdgoVar);
        this.zzeyz = zzell.zzas(zzckj.zzaoe());
        this.zzfer = zzell.zzas(zzckh.zzaod());
        this.zzfes = zzell.zzas(zzckl.zzaog());
        this.zzfet = zzell.zzas(zzckn.zzaoi());
        this.zzezb = ((zzels) ((zzels) ((zzels) ((zzels) zzelq.zzic(4).zza(zzdpg.GMS_SIGNALS, this.zzeyz)).zza(zzdpg.BUILD_URL, this.zzfer)).zza(zzdpg.HTTP, this.zzfes)).zza(zzdpg.PRE_PROCESS, this.zzfet)).zzbjn();
        zzelx<String> zzelxVar15 = this.zzeyj;
        zzelxVar12 = this.zzeud.zzesf;
        this.zzezd = zzell.zzas(new zzckp(zzelxVar15, zzelxVar12, zzdof.zzaul(), this.zzezb));
        zzelt zzbjo = zzelt.zzar(0, 1).zzav(this.zzezd).zzbjo();
        this.zzezk = zzbjo;
        this.zzezl = zzdpn.zzar(zzbjo);
        zzdof zzaul2 = zzdof.zzaul();
        zzelxVar13 = this.zzeud.zzesa;
        this.zzezm = zzell.zzas(zzdpo.zzv(zzaul2, zzelxVar13, this.zzezl));
    }

    private final zzdge zzafe() {
        return new zzdge((zzaag) zzelu.zza(new zzaag(), "Cannot return null from a non-@Nullable @Provides method"), zzdof.zzaum(), (List) zzelu.zza(this.zzfeg.zzarr(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    private final zzdfh zzaff() {
        return new zzdfh(zzbkz.zzagu(), zzdof.zzaum(), (String) zzelu.zza(this.zzfeg.zzaro(), "Cannot return null from a non-@Nullable @Provides method"), this.zzfeg.zzarp());
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final zzdem<JSONObject> zzafg() {
        zzelx zzelxVar;
        zzbke zzbkeVar;
        zzelx zzelxVar2;
        zzelx zzelxVar3;
        zzelx zzelxVar4;
        zzbih zzbihVar;
        zzelx zzelxVar5;
        zzbih zzbihVar2;
        zzelx zzelxVar6;
        zzelx zzelxVar7;
        zzelx zzelxVar8;
        zzbih zzbihVar3;
        zzbih zzbihVar4;
        zzbih zzbihVar5;
        zzelx zzelxVar9;
        zzelx zzelxVar10;
        zzelx zzelxVar11;
        zzdvw zzaum = zzdof.zzaum();
        zzdga zzdgaVar = new zzdga(zzbkv.zzagq(), zzdof.zzaum(), zzdgr.zzc(this.zzfeg));
        zzelxVar = this.zzeud.zzesa;
        zzden zzdenVar = (zzden) zzelu.zza(new zzdcy(zzdgaVar, 0L, (ScheduledExecutorService) zzelxVar.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzbkeVar = this.zzeud.zzerw;
        zzamh zzb = zzbki.zzb(zzbkeVar);
        zzelxVar2 = this.zzeud.zzesa;
        zzdgj zzdgjVar = new zzdgj(zzb, (ScheduledExecutorService) zzelxVar2.get(), this.zzfeg.zzarq(), zzdgq.zzb(this.zzfeg));
        zzelxVar3 = this.zzeud.zzesa;
        zzden zzdenVar2 = (zzden) zzelu.zza(new zzdcy(zzdgjVar, ((Long) zzwe.zzpu().zzd(zzaat.zzcsa)).longValue(), (ScheduledExecutorService) zzelxVar3.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzaqo zzags = zzbkx.zzags();
        zzelxVar4 = this.zzeud.zzesa;
        zzbihVar = this.zzeud.zzerx;
        zzdgn zzdgnVar = new zzdgn(zzags, (ScheduledExecutorService) zzelxVar4.get(), zzbik.zza(zzbihVar));
        zzelxVar5 = this.zzeud.zzesa;
        zzden zzdenVar3 = (zzden) zzelu.zza(new zzdcy(zzdgnVar, ((Long) zzwe.zzpu().zzd(zzaat.zzcsi)).longValue(), (ScheduledExecutorService) zzelxVar5.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzaxg zzagu = zzbkz.zzagu();
        zzbihVar2 = this.zzeud.zzerx;
        Context zza = zzbik.zza(zzbihVar2);
        zzelxVar6 = this.zzeud.zzesa;
        zzdfb zzdfbVar = new zzdfb(zzagu, zza, (ScheduledExecutorService) zzelxVar6.get(), zzdof.zzaum());
        zzelxVar7 = this.zzeud.zzesa;
        zzden zzdenVar4 = (zzden) zzelu.zza(new zzdcy(zzdfbVar, 0L, (ScheduledExecutorService) zzelxVar7.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzdhb zzdhbVar = new zzdhb(zzdof.zzaum());
        zzelxVar8 = this.zzeud.zzesa;
        zzden zzdenVar5 = (zzden) zzelu.zza(new zzdcy(zzdhbVar, 0L, (ScheduledExecutorService) zzelxVar8.get()), "Cannot return null from a non-@Nullable @Provides method");
        zzden zzdenVar6 = (zzden) zzelu.zza(zzdgu.zzarv(), "Cannot return null from a non-@Nullable @Provides method");
        zzbihVar3 = this.zzeud.zzerx;
        zztd zzago = zzbkt.zzago();
        zzdvw zzaum2 = zzdof.zzaum();
        zzbihVar4 = this.zzeud.zzerx;
        zzaxg zzagu2 = zzbkz.zzagu();
        int zzaru = this.zzfeg.zzaru();
        zzbihVar5 = this.zzeud.zzerx;
        Context zza2 = zzbik.zza(zzbihVar5);
        zzelxVar9 = this.zzeud.zzesy;
        zzaxk zzaxkVar = (zzaxk) zzelxVar9.get();
        zzelxVar10 = this.zzeud.zzesa;
        zzelxVar11 = this.zzeud.zzesz;
        return zzder.zza(zzaum, zzdtn.zza(zzdenVar, zzdenVar2, zzdenVar3, zzdenVar4, zzdenVar5, zzdenVar6, new zzdfl(null, zzbik.zza(zzbihVar3), zzdgr.zzc(this.zzfeg), zzdof.zzaum()), new zzdfv(zzago, zzaum2, zzbik.zza(zzbihVar4)), zzafe(), zzaff(), new zzdfp(zzagu2, zzaru, zza2, zzaxkVar, (ScheduledExecutorService) zzelxVar10.get(), zzdof.zzaum()), (zzden) zzelxVar11.get()));
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final zzdem<JSONObject> zzafh() {
        zzelx zzelxVar;
        zzelx zzelxVar2;
        zzaxf zzagq = zzbkv.zzagq();
        zzelxVar = this.zzeud.zzesz;
        Object obj = zzelxVar.get();
        zzdfh zzaff = zzaff();
        zzdge zzafe = zzafe();
        zzeli zzat = zzell.zzat(this.zzfeh);
        zzeli zzat2 = zzell.zzat(this.zzfej);
        zzeli zzat3 = zzell.zzat(this.zzfel);
        zzeli zzat4 = zzell.zzat(this.zzfem);
        zzeli zzat5 = zzell.zzat(this.zzfen);
        zzeli zzat6 = zzell.zzat(this.zzfbb);
        zzeli zzat7 = zzell.zzat(this.zzfep);
        zzeli zzat8 = zzell.zzat(this.zzfeq);
        zzdvw zzaum = zzdof.zzaum();
        zzelxVar2 = this.zzeud.zzesa;
        return zzdgz.zza(zzagq, obj, zzaff, zzafe, zzat, zzat2, zzat3, zzat4, zzat5, zzat6, zzat7, zzat8, zzaum, (ScheduledExecutorService) zzelxVar2.get());
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final zzdpf zzafi() {
        return this.zzezm.get();
    }
}
