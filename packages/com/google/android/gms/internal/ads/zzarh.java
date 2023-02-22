package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzarh {
    private static zzawu zzdph;
    private final zzyo zzacu;
    private final AdFormat zzdpg;
    private final Context zzvr;

    public static zzawu zzs(Context context) {
        zzawu zzawuVar;
        synchronized (zzarh.class) {
            if (zzdph == null) {
                zzdph = zzwe.zzpr().zza(context, new zzamr());
            }
            zzawuVar = zzdph;
        }
        return zzawuVar;
    }

    public zzarh(Context context, AdFormat adFormat, zzyo zzyoVar) {
        this.zzvr = context;
        this.zzdpg = adFormat;
        this.zzacu = zzyoVar;
    }

    public final void zza(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzvc zza;
        zzawu zzs = zzs(this.zzvr);
        if (zzs == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzvr);
        zzyo zzyoVar = this.zzacu;
        if (zzyoVar == null) {
            zza = new zzvf().zzph();
        } else {
            zza = zzvh.zza(this.zzvr, zzyoVar);
        }
        try {
            zzs.zza(wrap, new zzaxa(null, this.zzdpg.name(), null, zza), new zzarg(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
