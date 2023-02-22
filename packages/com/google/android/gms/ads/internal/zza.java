package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzayh;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zza {
    private boolean zzbob;
    private zzavu zzboc;
    private zzasa zzbod;
    private final Context zzvr;

    public zza(Context context, zzavu zzavuVar, zzasa zzasaVar) {
        this.zzvr = context;
        this.zzboc = zzavuVar;
        this.zzbod = null;
        if (0 == 0) {
            this.zzbod = new zzasa();
        }
    }

    private final boolean zzjw() {
        zzavu zzavuVar = this.zzboc;
        return (zzavuVar != null && zzavuVar.zzvn().zzdwm) || this.zzbod.zzdsw;
    }

    public final void recordClick() {
        this.zzbob = true;
    }

    public final boolean zzjx() {
        return !zzjw() || this.zzbob;
    }

    public final void zzbo(String str) {
        if (zzjw()) {
            if (str == null) {
                str = "";
            }
            zzavu zzavuVar = this.zzboc;
            if (zzavuVar != null) {
                zzavuVar.zza(str, null, 3);
            } else if (this.zzbod.zzdsw && this.zzbod.zzdsx != null) {
                for (String str2 : this.zzbod.zzdsx) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzp.zzkp();
                        zzayh.zzb(this.zzvr, "", replace);
                    }
                }
            }
        }
    }
}
