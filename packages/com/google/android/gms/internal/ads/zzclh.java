package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclh {
    private final Map<String, String> zzcyu = new ConcurrentHashMap();
    private final /* synthetic */ zzcli zzgfe;

    public zzclh(zzcli zzcliVar) {
        this.zzgfe = zzcliVar;
    }

    public final zzclh zzaoo() {
        Map<? extends String, ? extends String> map;
        Map<String, String> map2 = this.zzcyu;
        map = this.zzgfe.zzgff;
        map2.putAll(map);
        return this;
    }

    public final zzclh zza(zzdkz zzdkzVar) {
        this.zzcyu.put("gqi", zzdkzVar.zzdsg);
        return this;
    }

    public final zzclh zzd(zzdkx zzdkxVar) {
        this.zzcyu.put("aai", zzdkxVar.zzdjo);
        return this;
    }

    public final zzclh zzq(String str, String str2) {
        this.zzcyu.put(str, str2);
        return this;
    }

    public final void zzaop() {
        Executor executor;
        executor = this.zzgfe.executor;
        executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzclk
            private final zzclh zzgfg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfg = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgfg.zzaoq();
            }
        });
    }

    public final /* synthetic */ void zzaoq() {
        zzcln zzclnVar;
        zzclnVar = this.zzgfe.zzgfb;
        zzclnVar.zzn(this.zzcyu);
    }
}
