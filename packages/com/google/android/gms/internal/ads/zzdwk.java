package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdwk extends zzdvs<zzdvt<V>> {
    private final /* synthetic */ zzdwh zzhqn;
    private final zzdut<V> zzhqo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwk(zzdwh zzdwhVar, zzdut<V> zzdutVar) {
        this.zzhqn = zzdwhVar;
        this.zzhqo = (zzdut) zzdsv.checkNotNull(zzdutVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final boolean isDone() {
        return this.zzhqn.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final String zzaxj() {
        return this.zzhqo.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final /* synthetic */ void zzb(Object obj, Throwable th) {
        zzdvt zzdvtVar = (zzdvt) obj;
        if (th == null) {
            this.zzhqn.setFuture(zzdvtVar);
        } else {
            this.zzhqn.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final /* synthetic */ Object zzaxi() throws Exception {
        return (zzdvt) zzdsv.zza(this.zzhqo.zzard(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzhqo);
    }
}
