package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbff extends zzbev {
    public zzbff(zzbde zzbdeVar) {
        super(zzbdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void abort() {
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean zzfn(String str) {
        zzbde zzbdeVar = this.zzekx.get();
        if (zzbdeVar != null) {
            zzbdeVar.zza(zzfo(str), this);
        }
        zzaxy.zzfe("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfo(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
