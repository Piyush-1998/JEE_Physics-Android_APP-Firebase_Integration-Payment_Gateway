package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzall {
    private final Object zzdho = new Object();
    private final Object zzdhp = new Object();
    private zzalu zzdhq;
    private zzalu zzdhr;

    public final zzalu zza(Context context, zzbbg zzbbgVar) {
        zzalu zzaluVar;
        synchronized (this.zzdhp) {
            if (this.zzdhr == null) {
                this.zzdhr = new zzalu(zzl(context), zzbbgVar, zzacw.zzdbs.get());
            }
            zzaluVar = this.zzdhr;
        }
        return zzaluVar;
    }

    public final zzalu zzb(Context context, zzbbg zzbbgVar) {
        zzalu zzaluVar;
        synchronized (this.zzdho) {
            if (this.zzdhq == null) {
                this.zzdhq = new zzalu(zzl(context), zzbbgVar, (String) zzwe.zzpu().zzd(zzaat.zzcli));
            }
            zzaluVar = this.zzdhq;
        }
        return zzaluVar;
    }

    private static Context zzl(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
