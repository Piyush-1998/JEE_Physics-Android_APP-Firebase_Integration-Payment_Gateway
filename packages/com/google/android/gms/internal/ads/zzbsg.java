package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbsg {
    private final zzdln zzfqn;
    private Bundle zzfsj;
    private final String zzfsk;
    private final zzdli zzfsl;
    private final Context zzvr;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private zzdln zzfqn;
        private Bundle zzfsj;
        private String zzfsk;
        private zzdli zzfsl;
        private Context zzvr;

        public final zza zzcd(Context context) {
            this.zzvr = context;
            return this;
        }

        public final zza zza(zzdln zzdlnVar) {
            this.zzfqn = zzdlnVar;
            return this;
        }

        public final zza zzf(Bundle bundle) {
            this.zzfsj = bundle;
            return this;
        }

        public final zza zzfx(String str) {
            this.zzfsk = str;
            return this;
        }

        public final zzbsg zzajj() {
            return new zzbsg(this);
        }

        public final zza zza(zzdli zzdliVar) {
            this.zzfsl = zzdliVar;
            return this;
        }
    }

    private zzbsg(zza zzaVar) {
        this.zzvr = zzaVar.zzvr;
        this.zzfqn = zzaVar.zzfqn;
        this.zzfsj = zzaVar.zzfsj;
        this.zzfsk = zzaVar.zzfsk;
        this.zzfsl = zzaVar.zzfsl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zza zzaje() {
        return new zza().zzcd(this.zzvr).zza(this.zzfqn).zzfx(this.zzfsk).zzf(this.zzfsj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdln zzajf() {
        return this.zzfqn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdli zzajg() {
        return this.zzfsl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzajh() {
        return this.zzfsj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzaji() {
        return this.zzfsk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zzcc(Context context) {
        return this.zzfsk != null ? context : this.zzvr;
    }
}
