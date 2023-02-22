package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbqe implements zzduv {
    private final zzcow zzfqy;

    private zzbqe(zzcow zzcowVar) {
        this.zzfqy = zzcowVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzduv zza(zzcow zzcowVar) {
        return new zzbqe(zzcowVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt zzf(Object obj) {
        return this.zzfqy.zzh((zzasp) obj);
    }
}
