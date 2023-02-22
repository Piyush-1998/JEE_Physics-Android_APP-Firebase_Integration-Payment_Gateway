package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdjc implements zzelo<zzdiz<zzchx, zzchu>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdmt> zzetu;
    private final zzelx<zzdnl> zzetv;

    public zzdjc(zzelx<Context> zzelxVar, zzelx<zzdmt> zzelxVar2, zzelx<zzdnl> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzetu = zzelxVar2;
        this.zzetv = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        Object zzdirVar;
        Context context = this.zzert.get();
        zzdmt zzdmtVar = this.zzetu.get();
        zzdnl zzdnlVar = this.zzetv.get();
        if (((Integer) zzwe.zzpu().zzd(zzaat.zzcwe)).intValue() > 0) {
            zzdno zza = zzdnlVar.zza(zzdng.Rewarded, context, zzdmtVar, new zzdih(new zzdhy()));
            zzdirVar = new zzdid(new zzdiq(new zzdir()), new zzdii(zza.zzgyr, zzbbi.zzedu), zza.zzhfm, zzbbi.zzedu);
        } else {
            zzdirVar = new zzdir();
        }
        return (zzdiz) zzelu.zza(zzdirVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
