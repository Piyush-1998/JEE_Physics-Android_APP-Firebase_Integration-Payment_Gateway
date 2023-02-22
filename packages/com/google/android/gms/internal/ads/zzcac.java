package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcac implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdkx> zzfnc;
    private final zzelx<zzdln> zzfos;
    private final zzbzw zzfva;

    private zzcac(zzbzw zzbzwVar, zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzdln> zzelxVar4) {
        this.zzfva = zzbzwVar;
        this.zzert = zzelxVar;
        this.zzfkr = zzelxVar2;
        this.zzfnc = zzelxVar3;
        this.zzfos = zzelxVar4;
    }

    public static zzcac zza(zzbzw zzbzwVar, zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzdln> zzelxVar4) {
        return new zzcac(zzbzwVar, zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        final Context context = this.zzert.get();
        final zzbbg zzbbgVar = this.zzfkr.get();
        final zzdkx zzdkxVar = this.zzfnc.get();
        final zzdln zzdlnVar = this.zzfos.get();
        return (zzbys) zzelu.zza(new zzbys(new zzbuj(context, zzbbgVar, zzdkxVar, zzdlnVar) { // from class: com.google.android.gms.internal.ads.zzbzv
            private final Context zzcxz;
            private final zzbbg zzfon;
            private final zzdkx zzfoo;
            private final zzdln zzfop;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
                this.zzfon = zzbbgVar;
                this.zzfoo = zzdkxVar;
                this.zzfop = zzdlnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuj
            public final void onAdLoaded() {
                com.google.android.gms.ads.internal.zzp.zzkz().zzb(this.zzcxz, this.zzfon.zzbra, this.zzfoo.zzhat.toString(), this.zzfop.zzhbv);
            }
        }, zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
