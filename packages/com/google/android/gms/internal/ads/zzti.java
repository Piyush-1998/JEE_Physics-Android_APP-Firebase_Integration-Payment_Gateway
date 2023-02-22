package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzti implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zztg zzbvg;
    private final /* synthetic */ zzta zzbvm;
    private final /* synthetic */ zzbbq zzbvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzti(zztg zztgVar, zzta zztaVar, zzbbq zzbbqVar) {
        this.zzbvg = zztgVar;
        this.zzbvm = zztaVar;
        this.zzbvn = zzbbqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzsx zzsxVar;
        obj = this.zzbvg.lock;
        synchronized (obj) {
            z = this.zzbvg.zzbvh;
            if (z) {
                return;
            }
            this.zzbvg.zzbvh = true;
            zzsxVar = this.zzbvg.zzbuw;
            if (zzsxVar == null) {
                return;
            }
            zzdvw zzdvwVar = zzbbi.zzedu;
            final zzta zztaVar = this.zzbvm;
            final zzbbq zzbbqVar = this.zzbvn;
            final zzdvt<?> zzf = zzdvwVar.zzf(new Runnable(this, zzsxVar, zztaVar, zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzth
                private final zzti zzbvi;
                private final zzsx zzbvj;
                private final zzta zzbvk;
                private final zzbbq zzbvl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvi = this;
                    this.zzbvj = zzsxVar;
                    this.zzbvk = zztaVar;
                    this.zzbvl = zzbbqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzti zztiVar = this.zzbvi;
                    zzsx zzsxVar2 = this.zzbvj;
                    zzta zztaVar2 = this.zzbvk;
                    zzbbq zzbbqVar2 = this.zzbvl;
                    try {
                        zzsv zza = zzsxVar2.zzmx().zza(zztaVar2);
                        if (!zza.zzmu()) {
                            zzbbqVar2.setException(new RuntimeException("No entry contents."));
                            zztiVar.zzbvg.disconnect();
                            return;
                        }
                        zztj zztjVar = new zztj(zztiVar, zza.zzmv(), 1);
                        int read = zztjVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zztjVar.unread(read);
                        zzbbqVar2.set(zztjVar);
                    } catch (RemoteException | IOException e) {
                        zzaxy.zzc("Unable to obtain a cache service instance.", e);
                        zzbbqVar2.setException(e);
                        zztiVar.zzbvg.disconnect();
                    }
                }
            });
            zzbbq zzbbqVar2 = this.zzbvn;
            final zzbbq zzbbqVar3 = this.zzbvn;
            zzbbqVar2.addListener(new Runnable(zzbbqVar3, zzf) { // from class: com.google.android.gms.internal.ads.zztk
                private final zzbbq zzbvp;
                private final Future zzbvq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvp = zzbbqVar3;
                    this.zzbvq = zzf;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbbq zzbbqVar4 = this.zzbvp;
                    Future future = this.zzbvq;
                    if (zzbbqVar4.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbbi.zzedz);
        }
    }
}
