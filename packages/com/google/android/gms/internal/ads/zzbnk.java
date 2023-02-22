package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbnk extends zzbni {
    private final View view;
    private final zzbfq zzdgc;
    private final Executor zzfmk;
    private final zzdkw zzfnm;
    private final zzbpe zzfoc;
    private final zzcdg zzfod;
    private final zzbyw zzfoe;
    private final zzeli<zzcwz> zzfof;
    private zzvj zzfog;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnk(zzbpg zzbpgVar, Context context, zzdkw zzdkwVar, View view, zzbfq zzbfqVar, zzbpe zzbpeVar, zzcdg zzcdgVar, zzbyw zzbywVar, zzeli<zzcwz> zzeliVar, Executor executor) {
        super(zzbpgVar);
        this.zzvr = context;
        this.view = view;
        this.zzdgc = zzbfqVar;
        this.zzfnm = zzdkwVar;
        this.zzfoc = zzbpeVar;
        this.zzfod = zzcdgVar;
        this.zzfoe = zzbywVar;
        this.zzfof = zzeliVar;
        this.zzfmk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final View zzahq() {
        return this.view;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zza(ViewGroup viewGroup, zzvj zzvjVar) {
        zzbfq zzbfqVar;
        if (viewGroup == null || (zzbfqVar = this.zzdgc) == null) {
            return;
        }
        zzbfqVar.zza(zzbhj.zzb(zzvjVar));
        viewGroup.setMinimumHeight(zzvjVar.heightPixels);
        viewGroup.setMinimumWidth(zzvjVar.widthPixels);
        this.zzfog = zzvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzyg getVideoController() {
        try {
            return this.zzfoc.getVideoController();
        } catch (zzdlr unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzdkw zzahp() {
        boolean z;
        zzvj zzvjVar = this.zzfog;
        if (zzvjVar != null) {
            return zzdls.zzf(zzvjVar);
        }
        if (this.zzfpf.zzhba) {
            Iterator<String> it = this.zzfpf.zzhaf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new zzdkw(this.view.getWidth(), this.view.getHeight(), false);
            }
        }
        return zzdls.zza(this.zzfpf.zzhan, this.zzfnm);
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzdkw zzahu() {
        return this.zzfnm;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final int zzahv() {
        return this.zzflg.zzhbq.zzhbn.zzhbe;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzkd() {
        this.zzfoe.zzaki();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzahw() {
        this.zzfmk.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbnj
            private final zzbnk zzfob;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfob = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfob.zzahx();
            }
        });
        super.zzahw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzahx() {
        if (this.zzfod.zzamf() != null) {
            try {
                this.zzfod.zzamf().zza(this.zzfof.get(), ObjectWrapper.wrap(this.zzvr));
            } catch (RemoteException e) {
                zzaxy.zzc("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
