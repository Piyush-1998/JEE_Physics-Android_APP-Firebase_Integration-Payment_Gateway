package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzavo implements zzdvi<Void> {
    private final /* synthetic */ zzdvt zzdwf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavo(zzavl zzavlVar, zzdvt zzdvtVar) {
        this.zzdwf = zzdvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        List list;
        list = zzavl.zzdvs;
        list.remove(this.zzdwf);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(Void r2) {
        List list;
        list = zzavl.zzdvs;
        list.remove(this.zzdwf);
    }
}
