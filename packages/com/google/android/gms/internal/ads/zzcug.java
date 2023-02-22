package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcug implements zzdvi<T> {
    private final /* synthetic */ String zzgnf;
    private final /* synthetic */ long zzgng;
    private final /* synthetic */ zzdkx zzgnh;
    private final /* synthetic */ zzdkz zzgni;
    private final /* synthetic */ zzcud zzgnj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcug(zzcud zzcudVar, String str, long j, zzdkx zzdkxVar, zzdkz zzdkzVar) {
        this.zzgnj = zzcudVar;
        this.zzgnf = str;
        this.zzgng = j;
        this.zzgnh = zzdkxVar;
        this.zzgni = zzdkzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void onSuccess(T t) {
        Clock clock;
        boolean z;
        zzcuf zzcufVar;
        clock = this.zzgnj.zzbpw;
        long elapsedRealtime = clock.elapsedRealtime();
        this.zzgnj.zza(this.zzgnf, 0, elapsedRealtime - this.zzgng, this.zzgnh.zzhbd);
        z = this.zzgnj.zzgne;
        if (z) {
            zzcufVar = this.zzgnj.zzgnc;
            zzcufVar.zza(this.zzgni, this.zzgnh, 0, null, elapsedRealtime - this.zzgng);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        Clock clock;
        boolean z;
        zzcuf zzcufVar;
        clock = this.zzgnj.zzbpw;
        long elapsedRealtime = clock.elapsedRealtime();
        int i = 6;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzctt) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzdlr) {
            i = 5;
        } else if ((th instanceof zzcmt) && ((zzcmt) th).zzapd().errorCode == 3) {
            i = 1;
        }
        this.zzgnj.zza(this.zzgnf, i, elapsedRealtime - this.zzgng, this.zzgnh.zzhbd);
        z = this.zzgnj.zzgne;
        if (z) {
            zzcufVar = this.zzgnj.zzgnc;
            zzcufVar.zza(this.zzgni, this.zzgnh, i, th instanceof zzcri ? (zzcri) th : null, elapsedRealtime - this.zzgng);
        }
    }
}
