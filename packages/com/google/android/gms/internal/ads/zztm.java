package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zztm implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zztg zzbvg;
    private final /* synthetic */ zzbbq zzbvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztm(zztg zztgVar, zzbbq zzbbqVar) {
        this.zzbvg = zztgVar;
        this.zzbvn = zzbbqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzbvg.lock;
        synchronized (obj) {
            this.zzbvn.setException(new RuntimeException("Connection failed."));
        }
    }
}
