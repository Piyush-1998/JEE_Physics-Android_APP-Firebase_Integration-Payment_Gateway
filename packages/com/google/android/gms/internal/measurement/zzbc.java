package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
/* loaded from: classes.dex */
final class zzbc extends zzx.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ Bundle zzd;
    private final /* synthetic */ zzx.zzd zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzx.zzd zzdVar, Activity activity, Bundle bundle) {
        super(zzx.this);
        this.zze = zzdVar;
        this.zzc = activity;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws RemoteException {
        zzm zzmVar;
        zzmVar = zzx.this.zzr;
        zzmVar.onActivityCreated(ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}
