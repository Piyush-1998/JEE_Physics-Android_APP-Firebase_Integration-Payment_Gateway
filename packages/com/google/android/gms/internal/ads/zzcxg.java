package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxg implements zzdvi<zzbni> {
    private final /* synthetic */ zzboe zzgqg;
    final /* synthetic */ zzcxd zzgqh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxg(zzcxd zzcxdVar, zzboe zzboeVar) {
        this.zzgqh = zzcxdVar;
        this.zzgqg = zzboeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzbvb zzbvbVar;
        zzbii zzbiiVar;
        final zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgqh) {
            this.zzgqh.zzgqd = null;
            this.zzgqg.zzafd().zzg(zze);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                zzbiiVar = this.zzgqh.zzgmy;
                zzbiiVar.zzadj().execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzcxi
                    private final zzcxg zzgqj;
                    private final zzuw zzgqk;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgqj = this;
                        this.zzgqk = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxm zzcxmVar;
                        zzcxg zzcxgVar = this.zzgqj;
                        zzuw zzuwVar = this.zzgqk;
                        zzcxmVar = zzcxgVar.zzgqh.zzgpw;
                        zzcxmVar.zzg(zzuwVar);
                    }
                });
            }
            zzbvbVar = this.zzgqh.zzgqa;
            zzbvbVar.zzdw(60);
            zzdly.zza(zze.errorCode, th, "BannerAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbni zzbniVar) {
        zzbni zzbniVar2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzbvb zzbvbVar;
        zzbii zzbiiVar;
        zzcxm zzcxmVar;
        zzcxm zzcxmVar2;
        zzcxj zzcxjVar;
        zzcxl zzcxlVar;
        zzcxh zzcxhVar;
        zzbni zzbniVar3;
        zzbni zzbniVar4 = zzbniVar;
        synchronized (this.zzgqh) {
            this.zzgqh.zzgqd = null;
            zzbniVar2 = this.zzgqh.zzgpm;
            if (zzbniVar2 != null) {
                zzbniVar3 = this.zzgqh.zzgpm;
                zzbniVar3.destroy();
            }
            this.zzgqh.zzgpm = zzbniVar4;
            viewGroup = this.zzgqh.zzfnx;
            viewGroup.removeAllViews();
            if (zzbniVar4.zzahq() != null) {
                ViewParent parent = zzbniVar4.zzahq().getParent();
                if (parent instanceof ViewGroup) {
                    String mediationAdapterClassName = this.zzgqh.getMediationAdapterClassName();
                    StringBuilder sb = new StringBuilder(String.valueOf(mediationAdapterClassName).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(mediationAdapterClassName);
                    sb.append(" already has a parent view. Removing its old parent.");
                    zzaxy.zzfe(sb.toString());
                    ((ViewGroup) parent).removeView(zzbniVar4.zzahq());
                }
            }
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                zzbwh zzaio = zzbniVar4.zzaio();
                zzcxmVar2 = this.zzgqh.zzgpw;
                zzbwh zza = zzaio.zza(zzcxmVar2);
                zzcxjVar = this.zzgqh.zzgpx;
                zzbwh zza2 = zza.zza(zzcxjVar);
                zzcxlVar = this.zzgqh.zzgpy;
                zzbwh zza3 = zza2.zza(zzcxlVar);
                zzcxhVar = this.zzgqh.zzgpz;
                zza3.zza(zzcxhVar);
            }
            viewGroup2 = this.zzgqh.zzfnx;
            viewGroup2.addView(zzbniVar4.zzahq());
            zzbniVar4.zzahw();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                zzbiiVar = this.zzgqh.zzgmy;
                Executor zzadj = zzbiiVar.zzadj();
                zzcxmVar = this.zzgqh.zzgpw;
                zzcxmVar.getClass();
                zzadj.execute(zzcxf.zzb(zzcxmVar));
            }
            zzbvbVar = this.zzgqh.zzgqa;
            zzbvbVar.zzdw(zzbniVar4.zzahv());
        }
    }
}
