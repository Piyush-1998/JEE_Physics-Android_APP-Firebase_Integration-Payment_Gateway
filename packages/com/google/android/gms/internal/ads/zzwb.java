package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzwb extends zzwf<zzxk> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvr zzchz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwb(zzvr zzvrVar, Context context) {
        this.zzchz = zzvrVar;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* synthetic */ zzxk zzpn() {
        zzvr.zza(this.val$context, "mobile_ads_settings");
        return new zzzm();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzxk zzpo() throws RemoteException {
        zzzd zzzdVar;
        zzzdVar = this.zzchz.zzcic;
        return zzzdVar.zzi(this.val$context);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzxk zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zza(ObjectWrapper.wrap(this.val$context), 202006000);
    }
}
