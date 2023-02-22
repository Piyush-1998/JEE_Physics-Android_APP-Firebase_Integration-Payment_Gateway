package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbro implements zzbvj {
    private final Context zzaai;
    private final zzbbg zzbop;
    private final zzaya zzdza;
    private final zzcmi zzfkn;
    private final zzdln zzfqn;

    public zzbro(Context context, zzdln zzdlnVar, zzbbg zzbbgVar, zzaya zzayaVar, zzcmi zzcmiVar) {
        this.zzaai = context;
        this.zzfqn = zzdlnVar;
        this.zzbop = zzbbgVar;
        this.zzdza = zzayaVar;
        this.zzfkn = zzcmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(zzdlj zzdljVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(zzasp zzaspVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcse)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkx().zza(this.zzaai, this.zzbop, this.zzfqn.zzhbv, this.zzdza.zzxe());
        }
        this.zzfkn.zzaox();
    }
}
