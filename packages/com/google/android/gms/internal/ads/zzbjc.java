package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbjc extends zzbii {
    private zzelx<zzbii> zzerp;
    private final zzbke zzerw;
    private final zzbih zzerx;
    private zzelx<Executor> zzery;
    private zzelx<ThreadFactory> zzerz;
    private zzelx<ScheduledExecutorService> zzesa;
    private zzelx<zzdvw> zzesb;
    private zzelx<Clock> zzesc;
    private zzelx<zzcjd> zzesd;
    private zzelx<zzcji> zzese;
    private zzelx<Context> zzesf;
    private zzelx<zzbbg> zzesg;
    private zzelx<zzcrf<zzdlx, zzcsn>> zzesh;
    private zzelx<zzcwu> zzesi;
    private zzelx<WeakReference<Context>> zzesj;
    private zzelx<String> zzesk;
    private zzelx<String> zzesl;
    private zzelx<zzbbh> zzesm;
    private zzelx<zzcln> zzesn;
    private zzelx<zzcls> zzeso;
    private zzelx<zzcmi> zzesp;
    private zzelx<zzawb> zzesq;
    private zzelx<zzcjk> zzesr;
    private zzelx<zzbkj> zzess;
    private zzelx<zzeg> zzest;
    private zzelx<com.google.android.gms.ads.internal.zzb> zzesu;
    private zzelx<zzchm> zzesv;
    private zzelx<zzdma<zzchc>> zzesw;
    private zzelx<zzcyk> zzesx;
    private zzelx<zzaxk> zzesy;
    private zzelx zzesz;
    private zzelx<zzamh> zzeta;
    private zzelx<zzdmm> zzetb;
    private zzelx<zzclu> zzetc;
    private zzelx<zzdvw> zzetd;
    private zzelx zzete;
    private zzelx<zzdbj<zzdeq>> zzetf;
    private zzelx<zzdbd> zzetg;
    private zzelx<zzdbj<zzdba>> zzeth;
    private zzelx<zzdkv> zzeti;
    private zzelx<zzble> zzetj;
    private zzelx<zzatd> zzetk;
    private zzelx<HashMap<String, zzcpy>> zzetl;
    private zzelx<zzdlt> zzetm;
    private zzelx<zzcli> zzetn;
    private zzelx<zzcrf<zzdlx, zzcso>> zzeto;
    private zzelx<zzaqs> zzetp;
    private zzelx<zzalu> zzetq;
    private zzelx<zzaby> zzetr;
    private zzelx<zzavw> zzets;
    private zzelx<zzbvb> zzett;
    private zzelx<zzdmt> zzetu;
    private zzelx<zzdnl> zzetv;
    private zzelx<zzdqm> zzetw;

    private zzbjc(zzbih zzbihVar, zzbke zzbkeVar, zzdpq zzdpqVar, zzbkn zzbknVar, zzdmg zzdmgVar) {
        zzbkr zzbkrVar;
        zzbiw zzbiwVar;
        this.zzerw = zzbkeVar;
        this.zzerx = zzbihVar;
        this.zzery = zzell.zzas(zzdnz.zzaug());
        zzelx<ThreadFactory> zzas = zzell.zzas(zzdoo.zzauv());
        this.zzerz = zzas;
        this.zzesa = zzell.zzas(new zzdol(zzas));
        this.zzesb = zzell.zzas(zzdob.zzauh());
        this.zzesc = zzell.zzas(new zzdmf(zzdmgVar));
        zzelx<zzcjd> zzas2 = zzell.zzas(zzcjg.zzanr());
        this.zzesd = zzas2;
        this.zzese = zzell.zzas(new zzcjh(zzas2));
        this.zzesf = new zzbik(zzbihVar);
        this.zzesg = new zzbis(zzbihVar);
        this.zzesh = zzell.zzas(new zzbio(zzbihVar, this.zzese));
        this.zzesi = zzell.zzas(new zzcwy(zzdof.zzaul()));
        this.zzesj = new zzbin(zzbihVar);
        this.zzesk = zzell.zzas(new zzbiq(zzbihVar));
        zzelx<String> zzas3 = zzell.zzas(new zzbit(zzbihVar));
        this.zzesl = zzas3;
        this.zzesm = zzely.zzas(new zzbks(zzas3));
        zzelx<zzcln> zzas4 = zzell.zzas(new zzclp(zzdof.zzaul(), this.zzesm, this.zzesf, this.zzesg));
        this.zzesn = zzas4;
        this.zzeso = zzell.zzas(new zzclr(this.zzesk, zzas4));
        this.zzesp = zzell.zzas(new zzcmu(this.zzery, this.zzesf, this.zzesj, zzdof.zzaul(), this.zzese, this.zzesa, this.zzeso, this.zzesg));
        this.zzesq = zzell.zzas(new zzblb(zzbknVar));
        zzelx<zzcjk> zzas5 = zzell.zzas(new zzcjo(zzdof.zzaul()));
        this.zzesr = zzas5;
        this.zzess = zzell.zzas(new zzbko(this.zzesf, this.zzesg, this.zzese, this.zzesh, this.zzesi, this.zzesp, this.zzesq, zzas5));
        this.zzerp = zzeln.zzba(this);
        this.zzest = zzell.zzas(new zzbim(zzbihVar));
        zzbkg zzbkgVar = new zzbkg(zzbkeVar);
        this.zzesu = zzbkgVar;
        zzelx<Context> zzelxVar = this.zzesf;
        zzelx<Executor> zzelxVar2 = this.zzery;
        zzelx<zzeg> zzelxVar3 = this.zzest;
        zzelx<zzbbg> zzelxVar4 = this.zzesg;
        zzbkrVar = zzbku.zzfkw;
        zzelx<zzchm> zzas6 = zzell.zzas(new zzchn(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzbkgVar, zzbkrVar));
        this.zzesv = zzas6;
        zzelx<zzdma<zzchc>> zzas7 = zzell.zzas(new zzbiv(zzas6, zzdof.zzaul()));
        this.zzesw = zzas7;
        this.zzesx = zzell.zzas(new zzcyy(this.zzerp, this.zzesf, this.zzest, this.zzesg, zzas7, zzdof.zzaul(), this.zzesa));
        this.zzesy = zzell.zzas(new zzbil(zzbihVar));
        this.zzesz = zzell.zzas(new zzdfy(this.zzesf));
        this.zzeta = new zzbki(zzbkeVar);
        this.zzetb = zzell.zzas(new zzdmn(this.zzesf, this.zzesg, this.zzesy));
        this.zzetc = zzell.zzas(new zzclt(this.zzesc));
        this.zzetd = zzell.zzas(zzdoh.zzauo());
        zzdev zzdevVar = new zzdev(zzdof.zzaul(), this.zzesf);
        this.zzete = zzdevVar;
        this.zzetf = zzell.zzas(new zzdbk(zzdevVar, this.zzesc));
        zzdbf zzdbfVar = new zzdbf(zzdof.zzaul(), this.zzesf);
        this.zzetg = zzdbfVar;
        this.zzeth = zzell.zzas(new zzdbl(zzdbfVar, this.zzesc));
        this.zzeti = zzell.zzas(new zzdbn(this.zzesc));
        this.zzetj = new zzbir(zzbihVar, this.zzerp);
        this.zzetk = new zzbiy(this.zzesf);
        zzbiwVar = zzbiz.zzeru;
        this.zzetl = zzell.zzas(zzbiwVar);
        this.zzetm = zzell.zzas(zzdlw.zzasy());
        this.zzetn = zzell.zzas(new zzclj(this.zzesn, zzdof.zzaul()));
        this.zzeto = zzell.zzas(new zzbip(zzbihVar, this.zzese));
        this.zzetp = new zzbkh(zzbkeVar);
        this.zzetq = zzell.zzas(new zzdpp(zzdpqVar, this.zzesf, this.zzesg));
        this.zzetr = new zzbkf(zzbkeVar);
        this.zzets = new zzbkk(zzbkeVar);
        this.zzett = new zzbnf(this.zzesa, this.zzesc);
        this.zzetu = zzell.zzas(zzdmv.zzatd());
        this.zzetv = zzell.zzas(zzdnn.zzatx());
        this.zzetw = zzell.zzas(new zzbkq(this.zzesf));
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final Executor zzadj() {
        return this.zzery.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final ScheduledExecutorService zzadk() {
        return this.zzesa.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final Executor zzadl() {
        return zzdof.zzaum();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzdvw zzadm() {
        return this.zzesb.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzbvb zzadn() {
        return zzbnf.zza(this.zzesa.get(), this.zzesc.get());
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzcji zzado() {
        return this.zzese.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzbkj zzadp() {
        return this.zzess.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzbod zzadq() {
        return new zzbjo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzbmv zzadr() {
        return new zzbjl(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzdhq zzads() {
        return new zzbjm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzcau zzadt() {
        return new zzbjv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzcbq zzadu() {
        return new zzbje(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzcia zzadv() {
        return new zzbjy(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzdko zzadw() {
        return new zzbjw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzcyh zzadx() {
        return new zzbkd(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzcyk zzady() {
        return this.zzesx.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final zzdma<zzchc> zzadz() {
        return this.zzesw.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    protected final zzdff zza(zzdgo zzdgoVar) {
        zzelu.checkNotNull(zzdgoVar);
        return new zzbji(this, zzdgoVar);
    }
}
