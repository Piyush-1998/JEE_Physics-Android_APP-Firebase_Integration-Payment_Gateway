package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsw implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzss zzbuu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsw(zzss zzssVar) {
        this.zzbuu = zzssVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzsx zzsxVar;
        Object obj2;
        obj = this.zzbuu.lock;
        synchronized (obj) {
            this.zzbuu.zzbux = null;
            zzsxVar = this.zzbuu.zzbuw;
            if (zzsxVar != null) {
                this.zzbuu.zzbuw = null;
            }
            obj2 = this.zzbuu.lock;
            obj2.notifyAll();
        }
    }
}
