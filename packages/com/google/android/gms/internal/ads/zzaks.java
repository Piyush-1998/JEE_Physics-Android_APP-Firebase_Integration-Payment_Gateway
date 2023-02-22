package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaks implements zzahf<zzali> {
    private final /* synthetic */ zzajx zzdgv;
    private final /* synthetic */ zzakk zzdgw;
    private final /* synthetic */ zzeg zzdgy;
    private final /* synthetic */ zzbai zzdgz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaks(zzakk zzakkVar, zzeg zzegVar, zzajx zzajxVar, zzbai zzbaiVar) {
        this.zzdgw = zzakkVar;
        this.zzdgy = zzegVar;
        this.zzdgv = zzajxVar;
        this.zzdgz = zzbaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzali zzaliVar, Map map) {
        Object obj;
        int i;
        obj = this.zzdgw.lock;
        synchronized (obj) {
            zzaxy.zzfd("JS Engine is requesting an update");
            i = this.zzdgw.status;
            if (i == 0) {
                zzaxy.zzfd("Starting reload.");
                this.zzdgw.status = 2;
                this.zzdgw.zza(this.zzdgy);
            }
            this.zzdgv.zzb("/requestReload", (zzahf) this.zzdgz.get());
        }
    }
}
