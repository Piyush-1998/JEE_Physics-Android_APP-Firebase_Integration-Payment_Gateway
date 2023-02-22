package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxb extends zzwq {
    private zzwl zzbpf;
    private final zzbii zzgmy;
    private final Context zzgpr;
    private final zzdlp zzgps = new zzdlp();
    private final zzcdi zzgpt = new zzcdi();

    public zzcxb(zzbii zzbiiVar, Context context, String str) {
        this.zzgmy = zzbiiVar;
        this.zzgps.zzgt(str);
        this.zzgpr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final zzwm zzqc() {
        zzcdg zzamk = this.zzgpt.zzamk();
        this.zzgps.zzc(zzamk.zzamh());
        this.zzgps.zzd(zzamk.zzami());
        zzdlp zzdlpVar = this.zzgps;
        if (zzdlpVar.zzke() == null) {
            zzdlpVar.zze(zzvj.zzpi());
        }
        return new zzcxe(this.zzgpr, this.zzgmy, this.zzgps, zzamk, this.zzbpf);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzb(zzwl zzwlVar) {
        this.zzbpf = zzwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzaew zzaewVar) {
        this.zzgpt.zzb(zzaewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzafl zzaflVar) {
        this.zzgpt.zzb(zzaflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzaex zzaexVar) {
        this.zzgpt.zzb(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(String str, zzafd zzafdVar, zzafc zzafcVar) {
        this.zzgpt.zzb(str, zzafdVar, zzafcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzadm zzadmVar) {
        this.zzgps.zzb(zzadmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzair zzairVar) {
        this.zzgps.zzb(zzairVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzaiz zzaizVar) {
        this.zzgpt.zzb(zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zzb(zzxi zzxiVar) {
        this.zzgps.zzc(zzxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(zzafk zzafkVar, zzvj zzvjVar) {
        this.zzgpt.zza(zzafkVar);
        this.zzgps.zze(zzvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwr
    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgps.zzb(publisherAdViewOptions);
    }
}
