package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzwa extends zzwf<zzaea> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzvr zzchz;
    private final /* synthetic */ FrameLayout zzcii;
    private final /* synthetic */ FrameLayout zzcij;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwa(zzvr zzvrVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzchz = zzvrVar;
        this.zzcii = frameLayout;
        this.zzcij = frameLayout2;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* synthetic */ zzaea zzpn() {
        zzvr.zza(this.val$context, "native_ad_view_delegate");
        return new zzzo();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaea zzpo() throws RemoteException {
        zzaga zzagaVar;
        zzagaVar = this.zzchz.zzcid;
        return zzagaVar.zzb(this.val$context, this.zzcii, this.zzcij);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaea zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zza(ObjectWrapper.wrap(this.zzcii), ObjectWrapper.wrap(this.zzcij));
    }
}
