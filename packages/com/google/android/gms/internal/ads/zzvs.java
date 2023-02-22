package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvs extends zzwf<zzaql> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzvr zzchz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvs(zzvr zzvrVar, Activity activity) {
        this.zzchz = zzvrVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* synthetic */ zzaql zzpn() {
        zzvr.zza(this.val$activity, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaql zzpo() throws RemoteException {
        zzaqj zzaqjVar;
        zzaqjVar = this.zzchz.zzcig;
        return zzaqjVar.zzc(this.val$activity);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaql zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zzb(ObjectWrapper.wrap(this.val$activity));
    }
}
