package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzwc extends zzwf<zzatm> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamu zzchy;
    private final /* synthetic */ zzvr zzchz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwc(zzvr zzvrVar, Context context, zzamu zzamuVar) {
        this.zzchz = zzvrVar;
        this.val$context = context;
        this.zzchy = zzamuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* synthetic */ zzatm zzpn() {
        zzvr.zza(this.val$context, "rewarded_video");
        return new zzzs();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzatm zzpo() throws RemoteException {
        zzatx zzatxVar;
        zzatxVar = this.zzchz.zzcie;
        return zzatxVar.zzb(this.val$context, this.zzchy);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzatm zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zza(ObjectWrapper.wrap(this.val$context), this.zzchy, 202006000);
    }
}
