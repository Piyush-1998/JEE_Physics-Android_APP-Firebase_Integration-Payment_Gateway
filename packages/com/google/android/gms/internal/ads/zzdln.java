package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdln {
    public final zzvj zzbpb;
    public final zzadm zzdla;
    public final zzair zzdrn;
    public final int zzgra;
    public final boolean zzgso;
    public final zzxi zzhbs;
    public final zzaac zzhbt;
    public final zzvc zzhbu;
    public final String zzhbv;
    public final ArrayList<String> zzhbw;
    public final ArrayList<String> zzhbx;
    public final zzvm zzhby;
    public final PublisherAdViewOptions zzhbz;
    public final zzxc zzhca;
    public final zzdla zzhcb;

    private zzdln(zzdlp zzdlpVar) {
        zzaac zzaacVar;
        zzadm zzp;
        this.zzbpb = zzdlp.zza(zzdlpVar);
        this.zzhbv = zzdlp.zzb(zzdlpVar);
        this.zzhbs = zzdlp.zzc(zzdlpVar);
        this.zzhbu = new zzvc(zzdlp.zzm(zzdlpVar).versionCode, zzdlp.zzm(zzdlpVar).zzcgv, zzdlp.zzm(zzdlpVar).extras, zzdlp.zzm(zzdlpVar).zzcgw, zzdlp.zzm(zzdlpVar).zzcgx, zzdlp.zzm(zzdlpVar).zzcgy, zzdlp.zzm(zzdlpVar).zzadj, zzdlp.zzm(zzdlpVar).zzbnu || zzdlp.zzn(zzdlpVar), zzdlp.zzm(zzdlpVar).zzcgz, zzdlp.zzm(zzdlpVar).zzcha, zzdlp.zzm(zzdlpVar).zznb, zzdlp.zzm(zzdlpVar).zzchb, zzdlp.zzm(zzdlpVar).zzchc, zzdlp.zzm(zzdlpVar).zzchd, zzdlp.zzm(zzdlpVar).zzche, zzdlp.zzm(zzdlpVar).zzchf, zzdlp.zzm(zzdlpVar).zzchg, zzdlp.zzm(zzdlpVar).zzchh, zzdlp.zzm(zzdlpVar).zzchi, zzdlp.zzm(zzdlpVar).zzadk, zzdlp.zzm(zzdlpVar).zzadl, zzdlp.zzm(zzdlpVar).zzchj);
        if (zzdlp.zzo(zzdlpVar) != null) {
            zzaacVar = zzdlp.zzo(zzdlpVar);
        } else {
            zzaacVar = zzdlp.zzp(zzdlpVar) != null ? zzdlp.zzp(zzdlpVar).zzdct : null;
        }
        this.zzhbt = zzaacVar;
        this.zzhbw = zzdlp.zzd(zzdlpVar);
        this.zzhbx = zzdlp.zze(zzdlpVar);
        if (zzdlp.zzd(zzdlpVar) == null) {
            zzp = null;
        } else if (zzdlp.zzp(zzdlpVar) == null) {
            zzp = new zzadm(new NativeAdOptions.Builder().build());
        } else {
            zzp = zzdlp.zzp(zzdlpVar);
        }
        this.zzdla = zzp;
        this.zzhby = zzdlp.zzf(zzdlpVar);
        this.zzgra = zzdlp.zzg(zzdlpVar);
        this.zzhbz = zzdlp.zzh(zzdlpVar);
        this.zzhca = zzdlp.zzi(zzdlpVar);
        this.zzdrn = zzdlp.zzj(zzdlpVar);
        this.zzhcb = new zzdla(zzdlp.zzk(zzdlpVar));
        this.zzgso = zzdlp.zzl(zzdlpVar);
    }

    public final zzafq zzasp() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzhbz;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzju();
    }
}
