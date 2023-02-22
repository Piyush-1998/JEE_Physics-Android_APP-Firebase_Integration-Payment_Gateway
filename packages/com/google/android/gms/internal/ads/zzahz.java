package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzahz implements zzx {
    private volatile zzahs zzdfb;
    private final Context zzvr;

    public zzahz(Context context) {
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzx
    public final zzy zzc(zzaa<?> zzaaVar) throws zzao {
        zzahr zzh = zzahr.zzh(zzaaVar);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
        try {
            zzbbq zzbbqVar = new zzbbq();
            this.zzdfb = new zzahs(this.zzvr, com.google.android.gms.ads.internal.zzp.zzld().zzyf(), new zzaid(this, zzbbqVar), new zzaig(this, zzbbqVar));
            this.zzdfb.checkAvailabilityAndConnect();
            zzdvt zza = zzdvl.zza(zzdvl.zzb(zzbbqVar, new zzaic(this, zzh), zzbbi.zzedu), ((Integer) zzwe.zzpu().zzd(zzaat.zzcsw)).intValue(), TimeUnit.MILLISECONDS, zzbbi.zzedx);
            zza.addListener(new zzaie(this), zzbbi.zzedu);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zza.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            zzaxy.zzei(sb.toString());
            zzaht zzahtVar = (zzaht) new zzask(parcelFileDescriptor).zza(zzaht.CREATOR);
            if (zzahtVar == null) {
                return null;
            }
            if (zzahtVar.zzdfa) {
                throw new zzao(zzahtVar.zzcgr);
            }
            if (zzahtVar.zzdey.length != zzahtVar.zzdez.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < zzahtVar.zzdey.length; i++) {
                hashMap.put(zzahtVar.zzdey[i], zzahtVar.zzdez[i]);
            }
            return new zzy(zzahtVar.statusCode, zzahtVar.data, hashMap, zzahtVar.zzan, zzahtVar.zzao);
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime);
            sb2.append("ms");
            zzaxy.zzei(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime3);
            sb3.append("ms");
            zzaxy.zzei(sb3.toString());
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        if (this.zzdfb == null) {
            return;
        }
        this.zzdfb.disconnect();
        Binder.flushPendingCommands();
    }
}
