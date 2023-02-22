package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbcx {
    private final Context zzcle;
    private final zzbde zzefm;
    private final ViewGroup zzegh;
    private zzbcr zzegi;

    public zzbcx(Context context, ViewGroup viewGroup, zzbfq zzbfqVar) {
        this(context, viewGroup, zzbfqVar, null);
    }

    private zzbcx(Context context, ViewGroup viewGroup, zzbde zzbdeVar, zzbcr zzbcrVar) {
        this.zzcle = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzegh = viewGroup;
        this.zzefm = zzbdeVar;
        this.zzegi = null;
    }

    public final void zze(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzbcr zzbcrVar = this.zzegi;
        if (zzbcrVar != null) {
            zzbcrVar.zzd(i, i2, i3, i4);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, int i5, boolean z, zzbdf zzbdfVar) {
        if (this.zzegi != null) {
            return;
        }
        zzabb.zza(this.zzefm.zzzs().zzrm(), this.zzefm.zzzp(), "vpr2");
        Context context = this.zzcle;
        zzbde zzbdeVar = this.zzefm;
        zzbcr zzbcrVar = new zzbcr(context, zzbdeVar, i5, z, zzbdeVar.zzzs().zzrm(), zzbdfVar);
        this.zzegi = zzbcrVar;
        this.zzegh.addView(zzbcrVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzegi.zzd(i, i2, i3, i4);
        this.zzefm.zzav(false);
    }

    public final zzbcr zzzj() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.zzegi;
    }

    public final void onPause() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzbcr zzbcrVar = this.zzegi;
        if (zzbcrVar != null) {
            zzbcrVar.pause();
        }
    }

    public final void onDestroy() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzbcr zzbcrVar = this.zzegi;
        if (zzbcrVar != null) {
            zzbcrVar.destroy();
            this.zzegh.removeView(this.zzegi);
            this.zzegi = null;
        }
    }
}
