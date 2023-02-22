package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzakp implements zzahf<zzali> {
    private final /* synthetic */ zzalb zzdgu;
    private final /* synthetic */ zzajx zzdgv;
    private final /* synthetic */ zzakk zzdgw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakp(zzakk zzakkVar, zzalb zzalbVar, zzajx zzajxVar) {
        this.zzdgw = zzakkVar;
        this.zzdgu = zzalbVar;
        this.zzdgv = zzajxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzali zzaliVar, Map map) {
        Object obj;
        zzazm zzazmVar;
        obj = this.zzdgw.lock;
        synchronized (obj) {
            if (this.zzdgu.getStatus() != -1 && this.zzdgu.getStatus() != 1) {
                this.zzdgw.status = 0;
                zzazmVar = this.zzdgw.zzdgo;
                zzazmVar.zzh(this.zzdgv);
                this.zzdgu.zzm(this.zzdgv);
                this.zzdgw.zzdgq = this.zzdgu;
                zzaxy.zzei("Successfully loaded JS Engine.");
            }
        }
    }
}
