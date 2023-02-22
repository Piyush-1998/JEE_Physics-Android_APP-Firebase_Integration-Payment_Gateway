package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvv extends zzwf<zzawu> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzamu zzchy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvv(zzvr zzvrVar, Context context, zzamu zzamuVar) {
        this.val$context = context;
        this.zzchy = zzamuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    protected final /* bridge */ /* synthetic */ zzawu zzpn() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzwf
    /* renamed from: zzpp */
    public final zzawu zzpo() {
        try {
            return ((zzawz) zzbbc.zza(this.val$context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzvu.zzbxs)).zzd(ObjectWrapper.wrap(this.val$context), this.zzchy, 202006000);
        } catch (RemoteException | zzbbe | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final /* synthetic */ zzawu zza(zzxh zzxhVar) throws RemoteException {
        return zzxhVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzchy, 202006000);
    }
}
