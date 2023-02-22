package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzwd extends zzwf<zzaed> {
    private final /* synthetic */ zzvr zzchz;
    private final /* synthetic */ View zzcik;
    private final /* synthetic */ HashMap zzcil;
    private final /* synthetic */ HashMap zzcim;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwd(zzvr zzvrVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzchz = zzvrVar;
        this.zzcik = view;
        this.zzcil = hashMap;
        this.zzcim = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* synthetic */ zzaed zzpn() {
        zzvr.zza(this.zzcik.getContext(), "native_ad_view_holder_delegate");
        return new zzzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaed zzpo() throws RemoteException {
        zzafz zzafzVar;
        zzafzVar = this.zzchz.zzcih;
        return zzafzVar.zzb(this.zzcik, this.zzcil, this.zzcim);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzaed zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zza(ObjectWrapper.wrap(this.zzcik), ObjectWrapper.wrap(this.zzcil), ObjectWrapper.wrap(this.zzcim));
    }
}
