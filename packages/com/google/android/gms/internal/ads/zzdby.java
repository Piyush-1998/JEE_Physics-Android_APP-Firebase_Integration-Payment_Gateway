package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdby implements zzden<zzdbz> {
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzdby(Context context, zzdvw zzdvwVar) {
        this.zzvr = context;
        this.zzgay = zzdvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdbz> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcb
            private final zzdby zzgty;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgty = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzwz;
                String zzxb;
                String str;
                com.google.android.gms.ads.internal.zzp.zzkp();
                zzrk zzwx = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzwx();
                Bundle bundle = null;
                if (zzwx != null && zzwx != null && (!com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzwy() || !com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxa())) {
                    if (zzwx.zzmk()) {
                        zzwx.wakeup();
                    }
                    zzre zzmi = zzwx.zzmi();
                    if (zzmi != null) {
                        zzwz = zzmi.zzlx();
                        str = zzmi.zzly();
                        zzxb = zzmi.zzlz();
                        if (zzwz != null) {
                            com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzej(zzwz);
                        }
                        if (zzxb != null) {
                            com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzek(zzxb);
                        }
                    } else {
                        zzwz = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzwz();
                        zzxb = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxb();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxa()) {
                        if (zzxb != null && !TextUtils.isEmpty(zzxb)) {
                            bundle2.putString("v_fp_vertical", zzxb);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzwz != null && !com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzwy()) {
                        bundle2.putString("fingerprint", zzwz);
                        if (!zzwz.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzdbz(bundle);
            }
        });
    }
}
