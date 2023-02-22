package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrr implements zzelo<zzdsl<zzdkx, zzayy>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdln> zzfos;

    public zzbrr(zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdln> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzfkr = zzelxVar2;
        this.zzfos = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        final Context context = this.zzert.get();
        final zzbbg zzbbgVar = this.zzfkr.get();
        final zzdln zzdlnVar = this.zzfos.get();
        return (zzdsl) zzelu.zza(new zzdsl(context, zzbbgVar, zzdlnVar) { // from class: com.google.android.gms.internal.ads.zzbrs
            private final Context zzcxz;
            private final zzbbg zzfon;
            private final zzdln zzfrl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
                this.zzfon = zzbbgVar;
                this.zzfrl = zzdlnVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                Context context2 = this.zzcxz;
                zzbbg zzbbgVar2 = this.zzfon;
                zzdln zzdlnVar2 = this.zzfrl;
                zzdkx zzdkxVar = (zzdkx) obj;
                zzayy zzayyVar = new zzayy(context2);
                zzayyVar.zzet(zzdkxVar.zzdrx);
                zzayyVar.zzeu(zzdkxVar.zzhat.toString());
                zzayyVar.zzae(zzbbgVar2.zzbra);
                zzayyVar.setAdUnitId(zzdlnVar2.zzhbv);
                return zzayyVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
