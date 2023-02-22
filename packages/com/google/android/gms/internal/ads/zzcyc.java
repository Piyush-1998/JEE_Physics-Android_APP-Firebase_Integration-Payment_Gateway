package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcyc implements zzcxy<zzbpd> {
    private final zzbii zzgmy;
    private final Context zzgpr;
    private final zzdlp zzgps;
    private final zzcxw zzgrc;
    private zzbpo zzgrd;

    public zzcyc(zzbii zzbiiVar, Context context, zzcxw zzcxwVar, zzdlp zzdlpVar) {
        this.zzgmy = zzbiiVar;
        this.zzgpr = context;
        this.zzgrc = zzcxwVar;
        this.zzgps = zzdlpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final boolean isLoading() {
        zzbpo zzbpoVar = this.zzgrd;
        return zzbpoVar != null && zzbpoVar.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final boolean zza(zzvc zzvcVar, String str, zzcxx zzcxxVar, zzcya<? super zzbpd> zzcyaVar) throws RemoteException {
        zzcbn zzaek;
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvcVar.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            this.zzgmy.zzadj().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcyb
                private final zzcyc zzgrb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgrb = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgrb.zzaqn();
                }
            });
            return false;
        } else if (str == null) {
            zzaxy.zzfc("Ad unit ID should not be null for NativeAdLoader.");
            this.zzgmy.zzadj().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcye
                private final zzcyc zzgrb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgrb = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgrb.zzaqm();
                }
            });
            return false;
        } else {
            zzdly.zze(this.zzgpr, zzvcVar.zzcgy);
            zzdln zzasu = this.zzgps.zzh(zzvcVar).zzec(zzcxxVar instanceof zzcxz ? ((zzcxz) zzcxxVar).zzgra : 1).zzasu();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
                zzaek = this.zzgmy.zzadu().zza(new zzbsg.zza().zzcd(this.zzgpr).zza(zzasu).zzajj()).zza(new zzbxj.zza().zzake()).zza(this.zzgrc.zzaqf()).zzaek();
            } else {
                zzaek = this.zzgmy.zzadu().zza(new zzbsg.zza().zzcd(this.zzgpr).zza(zzasu).zzajj()).zza(new zzbxj.zza().zza(this.zzgrc.zzaqi(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaqj(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaqk(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaql(), this.zzgmy.zzadj()).zza(this.zzgrc.zzaqh(), this.zzgmy.zzadj()).zza(zzasu.zzhca, this.zzgmy.zzadj()).zzake()).zza(this.zzgrc.zzaqf()).zzaek();
            }
            this.zzgmy.zzadz().zzed(1);
            zzbpo zzbpoVar = new zzbpo(this.zzgmy.zzadl(), this.zzgmy.zzadk(), zzaek.zzafc().zzaiv());
            this.zzgrd = zzbpoVar;
            zzbpoVar.zza(new zzcyd(this, zzcyaVar, zzaek));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqm() {
        this.zzgrc.zzaqj().zzg(zzdmb.zza(zzdmd.zzhct, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqn() {
        this.zzgrc.zzaqj().zzg(zzdmb.zza(zzdmd.zzhcr, null, null));
    }
}
