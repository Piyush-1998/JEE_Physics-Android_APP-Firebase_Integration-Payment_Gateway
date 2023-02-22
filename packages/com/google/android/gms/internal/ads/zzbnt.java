package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnt implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdkx> zzfnc;
    private final zzbnl zzfoq;
    private final zzelx<zzdln> zzfos;

    public zzbnt(zzbnl zzbnlVar, zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzdln> zzelxVar4) {
        this.zzfoq = zzbnlVar;
        this.zzert = zzelxVar;
        this.zzfkr = zzelxVar2;
        this.zzfnc = zzelxVar3;
        this.zzfos = zzelxVar4;
    }

    public static zzbys<zzbuj> zza(zzbnl zzbnlVar, final Context context, final zzbbg zzbbgVar, final zzdkx zzdkxVar, final zzdln zzdlnVar) {
        return (zzbys) zzelu.zza(new zzbys(new zzbuj(context, zzbbgVar, zzdkxVar, zzdlnVar) { // from class: com.google.android.gms.internal.ads.zzbno
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

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzert.get(), this.zzfkr.get(), this.zzfnc.get(), this.zzfos.get());
    }
}
