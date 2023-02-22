package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zztg {
    private final Object lock = new Object();
    private zzsx zzbuw;
    private boolean zzbvh;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztg(Context context) {
        this.zzvr = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<InputStream> zzb(zzta zztaVar) {
        zztf zztfVar = new zztf(this);
        zzti zztiVar = new zzti(this, zztaVar, zztfVar);
        zztm zztmVar = new zztm(this, zztfVar);
        synchronized (this.lock) {
            zzsx zzsxVar = new zzsx(this.zzvr, com.google.android.gms.ads.internal.zzp.zzld().zzyf(), zztiVar, zztmVar);
            this.zzbuw = zzsxVar;
            zzsxVar.checkAvailabilityAndConnect();
        }
        return zztfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbuw == null) {
                return;
            }
            this.zzbuw.disconnect();
            this.zzbuw = null;
            Binder.flushPendingCommands();
        }
    }
}
