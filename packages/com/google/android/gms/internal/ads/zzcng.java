package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcng implements zzelo<zzdvt<String>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdpf> zzfow;

    private zzcng(zzelx<zzdpf> zzelxVar, zzelx<Context> zzelxVar2) {
        this.zzfow = zzelxVar;
        this.zzert = zzelxVar2;
    }

    public static zzcng zzap(zzelx<zzdpf> zzelxVar, zzelx<Context> zzelxVar2) {
        return new zzcng(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        final CookieManager zzbg = com.google.android.gms.ads.internal.zzp.zzkr().zzbg(this.zzert.get());
        return (zzdvt) zzelu.zza(this.zzfow.get().zzu(zzdpg.WEBVIEW_COOKIE).zzc(new Callable(zzbg) { // from class: com.google.android.gms.internal.ads.zzcnc
            private final CookieManager zzghh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghh = zzbg;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = this.zzghh;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzwe.zzpu().zzd(zzaat.zzcny));
            }
        }).zza(1L, TimeUnit.SECONDS).zza(Exception.class, zzcnb.zzghg).zzauz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
