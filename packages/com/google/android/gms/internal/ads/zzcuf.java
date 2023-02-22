package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcuf {
    private final zzcli zzfns;
    private final zzcjd zzgdx;
    private final zzdlt zzgex;

    public zzcuf(zzdlt zzdltVar, zzcjd zzcjdVar, zzcli zzcliVar) {
        this.zzgex = zzdltVar;
        this.zzgdx = zzcjdVar;
        this.zzfns = zzcliVar;
    }

    public final void zza(zzdkz zzdkzVar, zzdkx zzdkxVar, int i, @Nullable zzcri zzcriVar, long j) {
        zzcje zzcjeVar;
        zzclh zzq = this.zzfns.zzaor().zza(zzdkzVar).zzd(zzdkxVar).zzq("action", "adapter_status").zzq("adapter_l", String.valueOf(j));
        zzq.zzq("sc", Integer.toString(i));
        if (zzcriVar != null) {
            zzq.zzq("arec", Integer.toString(zzcriVar.zzapu().errorCode));
            String zzgu = this.zzgex.zzgu(zzcriVar.getMessage());
            if (zzgu != null) {
                zzq.zzq("areec", zzgu);
            }
        }
        zzcjd zzcjdVar = this.zzgdx;
        Iterator<String> it = zzdkxVar.zzhap.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcjeVar = null;
                break;
            }
            zzcjeVar = zzcjdVar.zzgg(it.next());
            if (zzcjeVar != null) {
                break;
            }
        }
        if (zzcjeVar != null) {
            zzq.zzq("ancn", zzcjeVar.zzdfe);
            if (zzcjeVar.zzgdu != null) {
                zzq.zzq("adapter_v", zzcjeVar.zzgdu.toString());
            }
            if (zzcjeVar.zzgdv != null) {
                zzq.zzq("adapter_sv", zzcjeVar.zzgdv.toString());
            }
        }
        zzq.zzaop();
    }
}
