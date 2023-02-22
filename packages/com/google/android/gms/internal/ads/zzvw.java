package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvw extends zzwf<zzwu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvj zzchw;
    private final /* synthetic */ String zzchx;
    private final /* synthetic */ zzvr zzchz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvw(zzvr zzvrVar, Context context, zzvj zzvjVar, String str) {
        this.zzchz = zzvrVar;
        this.val$context = context;
        this.zzchw = zzvjVar;
        this.zzchx = str;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzwu zzpn() {
        zzvr.zza(this.val$context, "search");
        return new zzzk();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzwu zzpo() throws RemoteException {
        zzva zzvaVar;
        zzvaVar = this.zzchz.zzcia;
        return zzvaVar.zza(this.val$context, this.zzchw, this.zzchx, null, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzwu zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zza(ObjectWrapper.wrap(this.val$context), this.zzchw, this.zzchx, 202006000);
    }
}
