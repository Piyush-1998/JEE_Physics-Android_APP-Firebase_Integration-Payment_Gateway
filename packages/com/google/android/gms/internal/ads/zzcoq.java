package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcoq extends zzcoj {
    private String zzgij;
    private int zzgik = zzcor.zzgil;

    public zzcoq(Context context) {
        this.zzgie = new zzarx(context, com.google.android.gms.ads.internal.zzp.zzld().zzyf(), this, this);
    }

    public final zzdvt<InputStream> zzk(zzasp zzaspVar) {
        synchronized (this.mLock) {
            if (this.zzgik != zzcor.zzgil && this.zzgik != zzcor.zzgim) {
                return zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhcp));
            } else if (this.zzgib) {
                return this.zzdih;
            } else {
                this.zzgik = zzcor.zzgim;
                this.zzgib = true;
                this.zzgid = zzaspVar;
                this.zzgie.checkAvailabilityAndConnect();
                this.zzdih.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcop
                    private final zzcoq zzgii;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgii = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzgii.zzapl();
                    }
                }, zzbbi.zzedz);
                return this.zzdih;
            }
        }
    }

    public final zzdvt<InputStream> zzgm(String str) {
        synchronized (this.mLock) {
            if (this.zzgik != zzcor.zzgil && this.zzgik != zzcor.zzgin) {
                return zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhcp));
            } else if (this.zzgib) {
                return this.zzdih;
            } else {
                this.zzgik = zzcor.zzgin;
                this.zzgib = true;
                this.zzgij = str;
                this.zzgie.checkAvailabilityAndConnect();
                this.zzdih.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcos
                    private final zzcoq zzgii;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgii = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzgii.zzapl();
                    }
                }, zzbbi.zzedz);
                return this.zzdih;
            }
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
                    if (this.zzgik == zzcor.zzgim) {
                        this.zzgie.zzvb().zzc(this.zzgid, new zzcom(this));
                    } else if (this.zzgik == zzcor.zzgin) {
                        this.zzgie.zzvb().zza(this.zzgij, new zzcom(this));
                    } else {
                        this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzp.zzkt().zza(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zzdih.setException(new zzcpa(zzdmd.zzhco));
                }
            }
        }
    }
}
