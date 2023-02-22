package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzoi {
    public final zznp zzbhs;
    public final zzod zzbht;
    public final Object zzbhu;
    public final zzhz[] zzbhv;

    public zzoi(zznp zznpVar, zzod zzodVar, Object obj, zzhz[] zzhzVarArr) {
        this.zzbhs = zznpVar;
        this.zzbht = zzodVar;
        this.zzbhu = obj;
        this.zzbhv = zzhzVarArr;
    }

    public final boolean zza(zzoi zzoiVar, int i) {
        return zzoiVar != null && zzpq.zza(this.zzbht.zzbg(i), zzoiVar.zzbht.zzbg(i)) && zzpq.zza(this.zzbhv[i], zzoiVar.zzbhv[i]);
    }
}
