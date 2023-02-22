package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzakk {
    private final Object lock;
    private int status;
    private final zzbbg zzbpa;
    private final String zzdgn;
    private zzazm<zzajx> zzdgo;
    private zzazm<zzajx> zzdgp;
    private zzalb zzdgq;
    private final Context zzvr;

    public zzakk(Context context, zzbbg zzbbgVar, String str) {
        this.lock = new Object();
        this.status = 1;
        this.zzdgn = str;
        this.zzvr = context.getApplicationContext();
        this.zzbpa = zzbbgVar;
        this.zzdgo = new zzaky();
        this.zzdgp = new zzaky();
    }

    public zzakk(Context context, zzbbg zzbbgVar, String str, zzazm<zzajx> zzazmVar, zzazm<zzajx> zzazmVar2) {
        this(context, zzbbgVar, str);
        this.zzdgo = zzazmVar;
        this.zzdgp = zzazmVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzalb zza(final zzeg zzegVar) {
        final zzalb zzalbVar = new zzalb(this.zzdgp);
        zzbbi.zzedy.execute(new Runnable(this, zzegVar, zzalbVar) { // from class: com.google.android.gms.internal.ads.zzakj
            private final zzakk zzdgk;
            private final zzeg zzdgl;
            private final zzalb zzdgm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgk = this;
                this.zzdgl = zzegVar;
                this.zzdgm = zzalbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdgk.zza(this.zzdgl, this.zzdgm);
            }
        });
        zzalbVar.zza(new zzakt(this, zzalbVar), new zzakw(this, zzalbVar));
        return zzalbVar;
    }

    public final zzakx zzb(zzeg zzegVar) {
        synchronized (this.lock) {
            synchronized (this.lock) {
                if (this.zzdgq != null && this.status == 0) {
                    this.zzdgq.zza(new zzbbu(this) { // from class: com.google.android.gms.internal.ads.zzakm
                        private final zzakk zzdgk;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdgk = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbbu
                        public final void zzh(Object obj) {
                            this.zzdgk.zza((zzajx) obj);
                        }
                    }, zzakl.zzdgr);
                }
            }
            if (this.zzdgq != null && this.zzdgq.getStatus() != -1) {
                if (this.status == 0) {
                    return this.zzdgq.zztg();
                } else if (this.status == 1) {
                    this.status = 2;
                    zza((zzeg) null);
                    return this.zzdgq.zztg();
                } else if (this.status == 2) {
                    return this.zzdgq.zztg();
                } else {
                    return this.zzdgq.zztg();
                }
            }
            this.status = 2;
            zzalb zza = zza((zzeg) null);
            this.zzdgq = zza;
            return zza.zztg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzajx zzajxVar) {
        if (zzajxVar.isDestroyed()) {
            this.status = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzeg zzegVar, final zzalb zzalbVar) {
        final zzajx zzajzVar;
        try {
            Context context = this.zzvr;
            zzbbg zzbbgVar = this.zzbpa;
            if (zzacz.zzdca.get().booleanValue()) {
                zzajzVar = new zzajj(context, zzbbgVar);
            } else {
                zzajzVar = new zzajz(context, zzbbgVar, zzegVar, null);
            }
            zzajzVar.zza(new zzaka(this, zzalbVar, zzajzVar) { // from class: com.google.android.gms.internal.ads.zzako
                private final zzakk zzdgk;
                private final zzalb zzdgs;
                private final zzajx zzdgt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdgk = this;
                    this.zzdgs = zzalbVar;
                    this.zzdgt = zzajzVar;
                }

                @Override // com.google.android.gms.internal.ads.zzaka
                public final void zzte() {
                    zzayh.zzeaj.postDelayed(new Runnable(this.zzdgk, this.zzdgs, this.zzdgt) { // from class: com.google.android.gms.internal.ads.zzakn
                        private final zzakk zzdgk;
                        private final zzalb zzdgs;
                        private final zzajx zzdgt;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdgk = r1;
                            this.zzdgs = r2;
                            this.zzdgt = r3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdgk.zza(this.zzdgs, this.zzdgt);
                        }
                    }, zzakv.zzdhc);
                }
            });
            zzajzVar.zza("/jsLoaded", new zzakp(this, zzalbVar, zzajzVar));
            zzbai zzbaiVar = new zzbai();
            zzaks zzaksVar = new zzaks(this, zzegVar, zzajzVar, zzbaiVar);
            zzbaiVar.set(zzaksVar);
            zzajzVar.zza("/requestReload", zzaksVar);
            if (this.zzdgn.endsWith(".js")) {
                zzajzVar.zzcz(this.zzdgn);
            } else if (this.zzdgn.startsWith("<html>")) {
                zzajzVar.zzda(this.zzdgn);
            } else {
                zzajzVar.zzdb(this.zzdgn);
            }
            zzayh.zzeaj.postDelayed(new zzakr(this, zzalbVar, zzajzVar), zzakv.zzdhb);
        } catch (Throwable th) {
            zzaxy.zzc("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzp.zzkt().zza(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzalbVar.reject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzalb zzalbVar, zzajx zzajxVar) {
        synchronized (this.lock) {
            if (zzalbVar.getStatus() != -1 && zzalbVar.getStatus() != 1) {
                zzalbVar.reject();
                zzdvw zzdvwVar = zzbbi.zzedy;
                zzajxVar.getClass();
                zzdvwVar.execute(zzakq.zzb(zzajxVar));
                zzaxy.zzei("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
