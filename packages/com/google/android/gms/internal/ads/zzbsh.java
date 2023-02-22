package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsh implements zzelo<String> {
    private final zzbsg zzfsm;

    private zzbsh(zzbsg zzbsgVar) {
        this.zzfsm = zzbsgVar;
    }

    public static zzbsh zzg(zzbsg zzbsgVar) {
        return new zzbsh(zzbsgVar);
    }

    public static String zzh(zzbsg zzbsgVar) {
        return zzbsgVar.zzaji();
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return this.zzfsm.zzaji();
    }
}
