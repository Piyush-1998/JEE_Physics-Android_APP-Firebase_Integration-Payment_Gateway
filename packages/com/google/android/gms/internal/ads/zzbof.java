package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbof implements zzelo<zzcre<zzbni>> {
    private final zzelx<zzcvp<zzbni, zzdlx, zzcso>> zzfcc;
    private final zzelx<Boolean> zzfhk;
    private final zzelx<zzctx> zzfhm;

    public zzbof(zzelx<Boolean> zzelxVar, zzelx<zzctx> zzelxVar2, zzelx<zzcvp<zzbni, zzdlx, zzcso>> zzelxVar3) {
        this.zzfhk = zzelxVar;
        this.zzfhm = zzelxVar2;
        this.zzfcc = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        boolean booleanValue = this.zzfhk.get().booleanValue();
        zzctx zzctxVar = this.zzfhm.get();
        zzcvp<zzbni, zzdlx, zzcso> zzcvpVar = this.zzfcc.get();
        if (!booleanValue) {
            zzctxVar = zzcvpVar;
        }
        return (zzcre) zzelu.zza(zzctxVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
