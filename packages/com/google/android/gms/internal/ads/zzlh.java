package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzlh {
    public final zzkg zzasm;
    public final zzlp zzayh = new zzlp();
    public zzln zzayi;
    public zzlb zzayj;
    public int zzayk;
    public int zzayl;
    public int zzaym;
    public zzkf zzayn;
    public zzlq zzayo;

    public zzlh(zzkg zzkgVar) {
        this.zzasm = zzkgVar;
    }

    public final void zza(zzln zzlnVar, zzlb zzlbVar) {
        this.zzayi = (zzln) zzoz.checkNotNull(zzlnVar);
        this.zzayj = (zzlb) zzoz.checkNotNull(zzlbVar);
        this.zzasm.zze(zzlnVar.zzaht);
        reset();
    }

    public final void reset() {
        zzlp zzlpVar = this.zzayh;
        zzlpVar.zzbaj = 0;
        zzlpVar.zzbaw = 0L;
        zzlpVar.zzbaq = false;
        zzlpVar.zzbav = false;
        zzlpVar.zzbas = null;
        this.zzayk = 0;
        this.zzaym = 0;
        this.zzayl = 0;
        this.zzayn = null;
        this.zzayo = null;
    }
}
