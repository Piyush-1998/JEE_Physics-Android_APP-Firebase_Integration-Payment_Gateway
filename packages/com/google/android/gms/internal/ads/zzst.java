package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzst implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzss zzbuu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzst(zzss zzssVar) {
        this.zzbuu = zzssVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzsx zzsxVar;
        zzsx zzsxVar2;
        obj = this.zzbuu.lock;
        synchronized (obj) {
            try {
                zzsxVar = this.zzbuu.zzbuw;
                if (zzsxVar != null) {
                    zzss zzssVar = this.zzbuu;
                    zzsxVar2 = this.zzbuu.zzbuw;
                    zzssVar.zzbux = zzsxVar2.zzmx();
                }
            } catch (DeadObjectException e) {
                zzaxy.zzc("Unable to obtain a cache service instance.", e);
                this.zzbuu.disconnect();
            }
            obj2 = this.zzbuu.lock;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zzbuu.lock;
        synchronized (obj) {
            this.zzbuu.zzbux = null;
            obj2 = this.zzbuu.lock;
            obj2.notifyAll();
        }
    }
}
