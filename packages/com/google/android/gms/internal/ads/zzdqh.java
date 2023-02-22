package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzcf;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdqh implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final String packageName;
    private final HandlerThread zzeci;
    private zzdrf zzhja;
    private final String zzhjb;
    private final LinkedBlockingQueue<zzcf.zza> zzhjc;

    public zzdqh(Context context, String str, String str2) {
        this.packageName = str;
        this.zzhjb = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zzeci = handlerThread;
        handlerThread.start();
        this.zzhja = new zzdrf(context, this.zzeci.getLooper(), this, this, 9200000);
        this.zzhjc = new LinkedBlockingQueue<>();
        this.zzhja.checkAvailabilityAndConnect();
    }

    public final zzcf.zza zzee(int i) {
        zzcf.zza zzaVar;
        try {
            zzaVar = this.zzhjc.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaVar = null;
        }
        return zzaVar == null ? zzavf() : zzaVar;
    }

    private final zzdrm zzave() {
        try {
            return this.zzhja.zzavt();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzhjc.put(zzavf());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzdrm zzave = zzave();
        if (zzave != null) {
            try {
                try {
                    this.zzhjc.put(zzave.zza(new zzdri(this.packageName, this.zzhjb)).zzavu());
                    zzapl();
                    this.zzeci.quit();
                } catch (InterruptedException unused) {
                    zzapl();
                    this.zzeci.quit();
                } catch (Throwable th) {
                    zzapl();
                    this.zzeci.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.zzhjc.put(zzavf());
                zzapl();
                this.zzeci.quit();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzhjc.put(zzavf());
        } catch (InterruptedException unused) {
        }
    }

    private final void zzapl() {
        zzdrf zzdrfVar = this.zzhja;
        if (zzdrfVar != null) {
            if (zzdrfVar.isConnected() || this.zzhja.isConnecting()) {
                this.zzhja.disconnect();
            }
        }
    }

    private static zzcf.zza zzavf() {
        return (zzcf.zza) ((zzegp) zzcf.zza.zzaq().zzn(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID).zzbfx());
    }
}
