package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbih {
    private final Context zzaai;
    private final zzbbg zzbop;
    private final WeakReference<Context> zzerl;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private Context zzaai;
        private zzbbg zzbop;
        private WeakReference<Context> zzerl;

        public final zza zza(zzbbg zzbbgVar) {
            this.zzbop = zzbbgVar;
            return this;
        }

        public final zza zzbw(Context context) {
            this.zzerl = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzaai = context;
            return this;
        }
    }

    private zzbih(zza zzaVar) {
        this.zzbop = zzaVar.zzbop;
        this.zzaai = zzaVar.zzaai;
        this.zzerl = zzaVar.zzerl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzade() {
        return this.zzaai;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WeakReference<Context> zzadf() {
        return this.zzerl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbbg zzadg() {
        return this.zzbop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzadh() {
        return com.google.android.gms.ads.internal.zzp.zzkp().zzs(this.zzaai, this.zzbop.zzbra);
    }

    public final zzeg zzadi() {
        return new zzeg(new com.google.android.gms.ads.internal.zzf(this.zzaai, this.zzbop));
    }
}
