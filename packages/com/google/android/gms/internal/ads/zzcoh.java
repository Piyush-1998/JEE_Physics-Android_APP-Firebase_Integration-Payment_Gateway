package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcoh extends zzcoj {
    public zzcoh(Context context) {
        this.zzgie = new zzarx(context, com.google.android.gms.ads.internal.zzp.zzld().zzyf(), this, this);
    }

    public final zzdvt<InputStream> zzi(zzasp zzaspVar) {
        synchronized (this.mLock) {
            if (this.zzgib) {
                return this.zzdih;
            }
            this.zzgib = true;
            this.zzgid = zzaspVar;
            this.zzgie.checkAvailabilityAndConnect();
            this.zzdih.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcok
                private final zzcoh zzgif;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgif = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgif.zzapl();
                }
            }, zzbbi.zzedz);
            return this.zzdih;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoj, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzaxy.zzef("Cannot connect to remote service, fallback to local instance.");
        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgic) {
                this.zzgic = true;
                try {
                    this.zzgie.zzvb().zza(this.zzgid, new zzcom(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                }
            }
        }
    }
}
