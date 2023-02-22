package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbfw implements zzdvi<Map<String, String>> {
    private final /* synthetic */ zzbft zzemo;
    private final /* synthetic */ List zzemp;
    private final /* synthetic */ String zzemq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfw(zzbft zzbftVar, List list, String str) {
        this.zzemo = zzbftVar;
        this.zzemp = list;
        this.zzemq = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(Map<String, String> map) {
        this.zzemo.zza(map, this.zzemp, this.zzemq);
    }
}
