package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdje extends AdMetadataListener implements zzbsu, zzbsz, zzbti, zzbuj, zzbuy, zzdiw {
    private final zzdmt zzgxs;
    private final AtomicReference<AdMetadataListener> zzgzd = new AtomicReference<>();
    private final AtomicReference<zzaut> zzgze = new AtomicReference<>();
    private final AtomicReference<zzaum> zzgzf = new AtomicReference<>();
    private final AtomicReference<zzatt> zzgzg = new AtomicReference<>();
    private final AtomicReference<zzauu> zzgzh = new AtomicReference<>();
    private final AtomicReference<zzatk> zzgzi = new AtomicReference<>();
    private final AtomicReference<zzya> zzgzj = new AtomicReference<>();
    private zzdje zzgzk = null;

    public zzdje(zzdmt zzdmtVar) {
        this.zzgxs = zzdmtVar;
    }

    public static zzdje zzb(zzdje zzdjeVar) {
        zzdje zzdjeVar2 = new zzdje(zzdjeVar.zzgxs);
        zzdjeVar2.zzb((zzdiw) zzdjeVar);
        return zzdjeVar2;
    }

    public final void zzb(zzaut zzautVar) {
        this.zzgze.set(zzautVar);
    }

    public final void zzb(zzaum zzaumVar) {
        this.zzgzf.set(zzaumVar);
    }

    public final void zzb(zzauu zzauuVar) {
        this.zzgzh.set(zzauuVar);
    }

    public final void zza(AdMetadataListener adMetadataListener) {
        this.zzgzd.set(adMetadataListener);
    }

    public final void zzc(zzya zzyaVar) {
        this.zzgzj.set(zzyaVar);
    }

    @Deprecated
    public final void zzb(zzatt zzattVar) {
        this.zzgzg.set(zzattVar);
    }

    @Deprecated
    public final void zzb(zzatk zzatkVar) {
        this.zzgzi.set(zzatkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgze, zzdjh.zzgxx);
                zzdip.zza(zzdjeVar.zzgzg, zzdjg.zzgxx);
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(final zzuw zzuwVar) {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                final int i = zzuwVar.errorCode;
                zzdip.zza(zzdjeVar.zzgze, new zzdio(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzdjt
                    private final zzuw zzfsu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsu = zzuwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzaut) obj).zze(this.zzfsu);
                    }
                });
                zzdip.zza(zzdjeVar.zzgze, new zzdio(i) { // from class: com.google.android.gms.internal.ads.zzdjs
                    private final int zzedo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzedo = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzaut) obj).onRewardedAdFailedToLoad(this.zzedo);
                    }
                });
                zzdip.zza(zzdjeVar.zzgzg, new zzdio(i) { // from class: com.google.android.gms.internal.ads.zzdjv
                    private final int zzedo;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzedo = i;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzatt) obj).onRewardedVideoAdFailedToLoad(this.zzedo);
                    }
                });
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzf, zzdju.zzgxx);
                zzdip.zza(zzdjeVar.zzgzg, zzdjx.zzgxx);
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdjeVar.zzgxs.onAdClosed();
                zzdip.zza(zzdjeVar.zzgzf, zzdjw.zzgxx);
                zzdip.zza(zzdjeVar.zzgzg, zzdjz.zzgxx);
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzg, zzdjy.zzgxx);
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzg, zzdjj.zzgxx);
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zzb(final zzatj zzatjVar, final String str, final String str2) {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzf, new zzdio(zzatjVar) { // from class: com.google.android.gms.internal.ads.zzdji
                    private final zzatj zzfsy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsy = zzatjVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        zzatj zzatjVar2 = this.zzfsy;
                        ((zzaum) obj).zza(new zzavh(zzatjVar2.getType(), zzatjVar2.getAmount()));
                    }
                });
                zzdip.zza(zzdjeVar.zzgzh, new zzdio(zzatjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdjl
                    private final String zzdft;
                    private final String zzdin;
                    private final zzatj zzfsy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsy = zzatjVar;
                        this.zzdft = str;
                        this.zzdin = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        zzatj zzatjVar2 = this.zzfsy;
                        ((zzauu) obj).zza(new zzavh(zzatjVar2.getType(), zzatjVar2.getAmount()), this.zzdft, this.zzdin);
                    }
                });
                zzdip.zza(zzdjeVar.zzgzg, new zzdio(zzatjVar) { // from class: com.google.android.gms.internal.ads.zzdjk
                    private final zzatj zzfsy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsy = zzatjVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzatt) obj).zza(this.zzfsy);
                    }
                });
                zzdip.zza(zzdjeVar.zzgzi, new zzdio(zzatjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdjn
                    private final String zzdft;
                    private final String zzdin;
                    private final zzatj zzfsy;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsy = zzatjVar;
                        this.zzdft = str;
                        this.zzdin = str2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzatk) obj).zza(this.zzfsy, this.zzdft, this.zzdin);
                    }
                });
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzg, zzdjm.zzgxx);
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzf(final zzuw zzuwVar) {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzf, new zzdio(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzdjp
                    private final zzuw zzfsu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsu = zzuwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzaum) obj).zzd(this.zzfsu);
                    }
                });
                zzdip.zza(zzdjeVar.zzgzf, new zzdio(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzdjo
                    private final zzuw zzfsu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsu = zzuwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzaum) obj).onRewardedAdFailedToShow(this.zzfsu.errorCode);
                    }
                });
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzdje zzdjeVar = this.zzgzk;
        if (zzdjeVar != null) {
            zzdjeVar.onAdMetadataChanged();
        } else {
            zzdip.zza(this.zzgzd, zzdjr.zzgxx);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzb(final zzvl zzvlVar) {
        zzdje zzdjeVar = this;
        while (true) {
            zzdje zzdjeVar2 = zzdjeVar.zzgzk;
            if (zzdjeVar2 == null) {
                zzdip.zza(zzdjeVar.zzgzj, new zzdio(zzvlVar) { // from class: com.google.android.gms.internal.ads.zzdjq
                    private final zzvl zzfto;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfto = zzvlVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzya) obj).zza(this.zzfto);
                    }
                });
                return;
            }
            zzdjeVar = zzdjeVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void zzb(zzdiw zzdiwVar) {
        this.zzgzk = (zzdje) zzdiwVar;
    }
}
