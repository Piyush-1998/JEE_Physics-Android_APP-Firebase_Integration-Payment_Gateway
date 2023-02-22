package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazi extends zzau {
    private final Context zzvr;

    public static zzae zzbj(Context context) {
        zzae zzaeVar = new zzae(new zzav(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzazi(context, new zzbd()));
        zzaeVar.start();
        return zzaeVar;
    }

    private zzazi(Context context, zzar zzarVar) {
        super(zzarVar);
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzau, com.google.android.gms.internal.ads.zzx
    public final zzy zzc(zzaa<?> zzaaVar) throws zzao {
        if (zzaaVar.zzh() && zzaaVar.getMethod() == 0) {
            if (Pattern.matches((String) zzwe.zzpu().zzd(zzaat.zzcsv), zzaaVar.getUrl())) {
                zzwe.zzpq();
                if (zzbat.zzd(this.zzvr, 13400000)) {
                    zzy zzc = new zzahz(this.zzvr).zzc(zzaaVar);
                    if (zzc != null) {
                        String valueOf = String.valueOf(zzaaVar.getUrl());
                        zzaxy.zzei(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zzc;
                    }
                    String valueOf2 = String.valueOf(zzaaVar.getUrl());
                    zzaxy.zzei(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zzc(zzaaVar);
    }
}
