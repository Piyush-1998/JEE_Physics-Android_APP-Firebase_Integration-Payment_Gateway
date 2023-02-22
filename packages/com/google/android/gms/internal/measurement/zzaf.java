package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
/* loaded from: classes.dex */
final class zzaf extends zzx.zza {
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzx zzxVar, long j) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws RemoteException {
        zzm zzmVar;
        zzmVar = this.zzd.zzr;
        zzmVar.setMinimumSessionDuration(this.zzc);
    }
}