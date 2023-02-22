package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyr extends zzbxe<zzqu> implements zzqu {
    private final zzdkx zzfpf;
    private Map<View, zzqq> zzful;
    private final Context zzvr;

    public zzbyr(Context context, Set<zzbys<zzqu>> set, zzdkx zzdkxVar) {
        super(set);
        this.zzful = new WeakHashMap(1);
        this.zzvr = context;
        this.zzfpf = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final synchronized void zza(final zzqr zzqrVar) {
        zza(new zzbxg(zzqrVar) { // from class: com.google.android.gms.internal.ads.zzbyu
            private final zzqr zzfun;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfun = zzqrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzqu) obj).zza(this.zzfun);
            }
        });
    }

    public final synchronized void zzv(View view) {
        zzqq zzqqVar = this.zzful.get(view);
        if (zzqqVar == null) {
            zzqqVar = new zzqq(this.zzvr, view);
            zzqqVar.zza(this);
            this.zzful.put(view, zzqqVar);
        }
        if (this.zzfpf != null && this.zzfpf.zzdsv) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpm)).booleanValue()) {
                zzqqVar.zzen(((Long) zzwe.zzpu().zzd(zzaat.zzcpl)).longValue());
                return;
            }
        }
        zzqqVar.zzlu();
    }

    public final synchronized void zzw(View view) {
        if (this.zzful.containsKey(view)) {
            this.zzful.get(view).zzb(this);
            this.zzful.remove(view);
        }
    }
}
