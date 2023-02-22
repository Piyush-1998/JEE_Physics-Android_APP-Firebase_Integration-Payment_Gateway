package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsd implements zzcre<zzbzr> {
    private final zzdkv zzfld;
    private final Executor zzfmk;
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcsd(Context context, Executor executor, zzcar zzcarVar, zzdkv zzdkvVar) {
        this.zzvr = context;
        this.zzglr = zzcarVar;
        this.zzfmk = executor;
        this.zzfld = zzdkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (this.zzvr instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzabu.zzk(this.zzvr) && !TextUtils.isEmpty(zze(zzdkxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzbzr> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        String zze = zze(zzdkxVar);
        final Uri parse = zze != null ? Uri.parse(zze) : null;
        return zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this, parse, zzdljVar, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzcsg
            private final Uri zzeag;
            private final zzcsd zzgls;
            private final zzdlj zzglt;
            private final zzdkx zzglu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgls = this;
                this.zzeag = parse;
                this.zzglt = zzdljVar;
                this.zzglu = zzdkxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgls.zza(this.zzeag, this.zzglt, this.zzglu, obj);
            }
        }, this.zzfmk);
    }

    private static String zze(zzdkx zzdkxVar) {
        try {
            return zzdkxVar.zzhar.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(Uri uri, zzdlj zzdljVar, zzdkx zzdkxVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzd zzdVar = new com.google.android.gms.ads.internal.overlay.zzd(build.intent);
            final zzbbq zzbbqVar = new zzbbq();
            zzbzt zza = this.zzglr.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzbzw(new zzcaz(zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzcsf
                private final zzbbq zzbvp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvp = zzbbqVar;
                }

                @Override // com.google.android.gms.internal.ads.zzcaz
                public final void zza(boolean z, Context context) {
                    zzbbq zzbbqVar2 = this.zzbvp;
                    try {
                        com.google.android.gms.ads.internal.zzp.zzko();
                        com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) zzbbqVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            zzbbqVar.set(new AdOverlayInfoParcel(zzdVar, null, zza.zzagc(), null, new zzbbg(0, 0, false)));
            this.zzfld.zzwf();
            return zzdvl.zzaf(zza.zzagb());
        } catch (Throwable th) {
            zzaxy.zzc("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
