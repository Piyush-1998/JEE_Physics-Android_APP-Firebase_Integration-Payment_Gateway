package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzss {
    private zzsx zzbuw;
    private zztb zzbux;
    private Context zzvr;
    private final Runnable zzbuv = new zzsr(this);
    private final Object lock = new Object();

    public final void initialize(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzvr != null) {
                return;
            }
            this.zzvr = context.getApplicationContext();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcsn)).booleanValue()) {
                connect();
            } else {
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcsm)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzp.zzks().zza(new zzsu(this));
                }
            }
        }
    }

    public final void zzmt() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcso)).booleanValue()) {
            synchronized (this.lock) {
                connect();
                com.google.android.gms.ads.internal.zzp.zzkp();
                zzayh.zzeaj.removeCallbacks(this.zzbuv);
                com.google.android.gms.ads.internal.zzp.zzkp();
                zzayh.zzeaj.postDelayed(this.zzbuv, ((Long) zzwe.zzpu().zzd(zzaat.zzcsp)).longValue());
            }
        }
    }

    public final zzsv zza(zzta zztaVar) {
        synchronized (this.lock) {
            if (this.zzbux == null) {
                return new zzsv();
            }
            try {
                return this.zzbux.zza(zztaVar);
            } catch (RemoteException e) {
                zzaxy.zzc("Unable to call into cache service.", e);
                return new zzsv();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect() {
        synchronized (this.lock) {
            if (this.zzvr != null && this.zzbuw == null) {
                zzsx zza = zza(new zzst(this), new zzsw(this));
                this.zzbuw = zza;
                zza.checkAvailabilityAndConnect();
            }
        }
    }

    private final synchronized zzsx zza(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzsx(this.zzvr, com.google.android.gms.ads.internal.zzp.zzld().zzyf(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.lock) {
            if (this.zzbuw == null) {
                return;
            }
            if (this.zzbuw.isConnected() || this.zzbuw.isConnecting()) {
                this.zzbuw.disconnect();
            }
            this.zzbuw = null;
            this.zzbux = null;
            Binder.flushPendingCommands();
        }
    }
}
