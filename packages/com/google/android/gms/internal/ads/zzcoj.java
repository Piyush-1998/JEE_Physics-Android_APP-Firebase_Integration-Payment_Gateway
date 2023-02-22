package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzcoj implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected zzasp zzgid;
    protected zzarx zzgie;
    protected final zzbbq<InputStream> zzdih = new zzbbq<>();
    protected final Object mLock = new Object();
    protected boolean zzgib = false;
    protected boolean zzgic = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzapl() {
        synchronized (this.mLock) {
            this.zzgic = true;
            if (this.zzgie.isConnected() || this.zzgie.isConnecting()) {
                this.zzgie.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        zzaxy.zzef("Cannot connect to remote service, fallback to local instance.");
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzaxy.zzef("Disconnected from remote ad request service.");
        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
    }
}
