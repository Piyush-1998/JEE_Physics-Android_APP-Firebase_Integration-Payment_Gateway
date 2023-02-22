package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvt extends zzwf<zzaul> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzchx;
    private final /* synthetic */ zzamu zzchy;
    private final /* synthetic */ zzvr zzchz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvt(zzvr zzvrVar, Context context, String str, zzamu zzamuVar) {
        this.zzchz = zzvrVar;
        this.val$context = context;
        this.zzchx = str;
        this.zzchy = zzamuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* synthetic */ zzaul zzpn() {
        zzvr.zza(this.val$context, "rewarded");
        return new zzzq();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaul zzpo() throws RemoteException {
        return zzavb.zzd(this.val$context, this.zzchx, this.zzchy);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaul zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzchx, this.zzchy, 202006000);
    }
}
