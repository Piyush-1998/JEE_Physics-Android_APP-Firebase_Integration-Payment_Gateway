package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcga {
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;

    public zzcga(zzdln zzdlnVar, Executor executor, zzcih zzcihVar) {
        this.zzfqn = zzdlnVar;
        this.zzfmk = executor;
        this.zzfzy = zzcihVar;
    }

    public final zzdvt<zzbfq> zzn(final JSONObject jSONObject) {
        return zzdvl.zzb(zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcgb
            private final zzcga zzgby;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgby = this;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgby.zzr(obj);
            }
        }, this.zzfmk), new zzduv(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcfz
            private final JSONObject zzfmf;
            private final zzcga zzgby;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgby = this;
                this.zzfmf = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgby.zza(this.zzfmf, (zzbfq) obj);
            }
        }, this.zzfmk);
    }

    public final zzdvt<zzbfq> zzo(final String str, final String str2) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this, str, str2) { // from class: com.google.android.gms.internal.ads.zzcgc
            private final String zzdft;
            private final String zzdin;
            private final zzcga zzgby;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgby = this;
                this.zzdft = str;
                this.zzdin = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgby.zza(this.zzdft, this.zzdin, obj);
            }
        }, this.zzfmk);
    }

    private final void zzk(zzbfq zzbfqVar) {
        zzbfqVar.zza("/video", zzagp.zzdej);
        zzbfqVar.zza("/videoMeta", zzagp.zzdek);
        zzbfqVar.zza("/precache", new zzbfa());
        zzbfqVar.zza("/delayPageLoaded", zzagp.zzden);
        zzbfqVar.zza("/instrument", zzagp.zzdel);
        zzbfqVar.zza("/log", zzagp.zzdee);
        zzbfqVar.zza("/videoClicked", zzagp.zzdef);
        zzbfqVar.zzabe().zzbb(true);
        zzbfqVar.zza("/click", zzagp.zzdea);
        if (this.zzfqn.zzdrn != null) {
            zzbfqVar.zzabe().zzbc(true);
            zzbfqVar.zza("/open", new zzahj(null, null));
        } else {
            zzbfqVar.zzabe().zzbc(false);
        }
        if (com.google.android.gms.ads.internal.zzp.zzln().zzac(zzbfqVar.getContext())) {
            zzbfqVar.zza("/logScionEvent", new zzahh(zzbfqVar.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzr(Object obj) throws Exception {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        final zzbbr zzl = zzbbr.zzl(zza);
        zzk(zza);
        zza.zzabe().zza(new zzbhe(zzl) { // from class: com.google.android.gms.internal.ads.zzcge
            private final zzbbr zzenh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzenh = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbhe
            public final void zztf() {
                this.zzenh.zzys();
            }
        });
        zza.loadUrl((String) zzwe.zzpu().zzd(zzaat.zzcrm));
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(String str, String str2, Object obj) throws Exception {
        final zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        final zzbbr zzl = zzbbr.zzl(zza);
        zzk(zza);
        if (this.zzfqn.zzdrn != null) {
            zza.zza(zzbhj.zzacw());
        } else {
            zza.zza(zzbhj.zzacv());
        }
        zza.zzabe().zza(new zzbhf(this, zza, zzl) { // from class: com.google.android.gms.internal.ads.zzcgd
            private final zzbfq zzgak;
            private final zzcga zzgby;
            private final zzbbr zzgbz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgby = this;
                this.zzgak = zza;
                this.zzgbz = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbhf
            public final void zzak(boolean z) {
                this.zzgby.zza(this.zzgak, this.zzgbz, z);
            }
        });
        zza.zzb(str, str2, null);
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbfq zzbfqVar, zzbbr zzbbrVar, boolean z) {
        if (z) {
            if (this.zzfqn.zzhbt != null && zzbfqVar.zzzo() != null) {
                zzbfqVar.zzzo().zzb(this.zzfqn.zzhbt);
            }
            zzbbrVar.zzys();
            return;
        }
        zzbbrVar.setException(new zzcuh(zzdmd.zzhco, "Instream video Web View failed to load."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(JSONObject jSONObject, final zzbfq zzbfqVar) throws Exception {
        final zzbbr zzl = zzbbr.zzl(zzbfqVar);
        if (this.zzfqn.zzdrn != null) {
            zzbfqVar.zza(zzbhj.zzacw());
        } else {
            zzbfqVar.zza(zzbhj.zzacv());
        }
        zzbfqVar.zzabe().zza(new zzbhf(this, zzbfqVar, zzl) { // from class: com.google.android.gms.internal.ads.zzcgg
            private final zzbfq zzgak;
            private final zzcga zzgby;
            private final zzbbr zzgbz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgby = this;
                this.zzgak = zzbfqVar;
                this.zzgbz = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbhf
            public final void zzak(boolean z) {
                this.zzgby.zzb(this.zzgak, this.zzgbz, z);
            }
        });
        zzbfqVar.zza("google.afma.nativeAds.renderVideo", jSONObject);
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbfq zzbfqVar, zzbbr zzbbrVar, boolean z) {
        if (this.zzfqn.zzhbt != null && zzbfqVar.zzzo() != null) {
            zzbfqVar.zzzo().zzb(this.zzfqn.zzhbt);
        }
        zzbbrVar.zzys();
    }
}
