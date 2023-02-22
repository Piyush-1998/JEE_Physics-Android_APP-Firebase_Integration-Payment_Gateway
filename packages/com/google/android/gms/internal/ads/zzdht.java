package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdht implements zzbsz, zzbuo, zzdiw {
    private final zzdmt zzgxs;
    private final AtomicReference<zzsi> zzgxt = new AtomicReference<>();
    private final AtomicReference<zzsj> zzgxu = new AtomicReference<>();
    private final AtomicReference<zzbuo> zzgxv = new AtomicReference<>();
    private zzdht zzgxw = null;

    public zzdht(zzdmt zzdmtVar) {
        this.zzgxs = zzdmtVar;
    }

    public static zzdht zzb(zzdht zzdhtVar) {
        zzdht zzdhtVar2 = new zzdht(zzdhtVar.zzgxs);
        zzdhtVar2.zzb((zzdiw) zzdhtVar);
        return zzdhtVar2;
    }

    public final void zzb(zzsi zzsiVar) {
        this.zzgxt.set(zzsiVar);
    }

    public final void zzb(zzsj zzsjVar) {
        this.zzgxu.set(zzsjVar);
    }

    public final void zza(zzbuo zzbuoVar) {
        this.zzgxv.set(zzbuoVar);
    }

    public final void zzb(final zzsd zzsdVar) {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzgxw;
            if (zzdhtVar2 == null) {
                zzdip.zza(zzdhtVar.zzgxt, new zzdio(zzsdVar) { // from class: com.google.android.gms.internal.ads.zzdhs
                    private final zzsd zzgxr;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgxr = zzsdVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzsi) obj).zza(this.zzgxr);
                    }
                });
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(final zzuw zzuwVar) {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzgxw;
            if (zzdhtVar2 == null) {
                zzdip.zza(zzdhtVar.zzgxt, new zzdio(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzdhv
                    private final zzuw zzfsu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsu = zzuwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzsi) obj).onAppOpenAdFailedToLoad(this.zzfsu.errorCode);
                    }
                });
                zzdip.zza(zzdhtVar.zzgxt, new zzdio(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzdhu
                    private final zzuw zzfsu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzfsu = zzuwVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdio
                    public final void zzq(Object obj) {
                        ((zzsi) obj).zza(this.zzfsu);
                    }
                });
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    public final void onAdClosed() {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzgxw;
            if (zzdhtVar2 == null) {
                zzdhtVar.zzgxs.onAdClosed();
                zzdip.zza(zzdhtVar.zzgxu, zzdhx.zzgxx);
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzajl() {
        zzdht zzdhtVar = this;
        while (true) {
            zzdht zzdhtVar2 = zzdhtVar.zzgxw;
            if (zzdhtVar2 == null) {
                zzdip.zza(zzdhtVar.zzgxv, zzdhw.zzgxx);
                return;
            }
            zzdhtVar = zzdhtVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiw
    public final void zzb(zzdiw zzdiwVar) {
        this.zzgxw = (zzdht) zzdiwVar;
    }
}
