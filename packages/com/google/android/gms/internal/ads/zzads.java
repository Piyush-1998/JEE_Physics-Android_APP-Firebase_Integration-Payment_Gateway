package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzads implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzaes zzdcv;

    public zzads(zzaes zzaesVar) {
        this.zzdcv = zzaesVar;
        try {
            zzaesVar.zzso();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zzdcv.zzsn();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zzdcv.zzq(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
