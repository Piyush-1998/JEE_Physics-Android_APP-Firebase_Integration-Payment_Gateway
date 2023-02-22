package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckw implements zzbsy, zzbtm, zzbwt {
    private final zzdlj zzeua;
    private final zzdkx zzflh;
    private final zzcli zzfns;
    private final zzdlt zzgex;
    private Boolean zzgey;
    private final boolean zzgez = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcwz)).booleanValue();
    private final Context zzvr;

    public zzckw(Context context, zzdlt zzdltVar, zzcli zzcliVar, zzdlj zzdljVar, zzdkx zzdkxVar) {
        this.zzvr = context;
        this.zzgex = zzdltVar;
        this.zzfns = zzcliVar;
        this.zzeua = zzdljVar;
        this.zzflh = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void onAdImpression() {
        if (zzaol()) {
            zzgh("impression").zzaop();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzaiy() {
        if (zzaol()) {
            zzgh("adapter_impression").zzaop();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzaja() {
        if (zzaol()) {
            zzgh("adapter_shown").zzaop();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzh(zzuw zzuwVar) {
        if (this.zzgez) {
            zzclh zzgh = zzgh("ifts");
            zzgh.zzq("reason", "adapter");
            if (zzuwVar.errorCode >= 0) {
                zzgh.zzq("arec", String.valueOf(zzuwVar.errorCode));
            }
            String zzgu = this.zzgex.zzgu(zzuwVar.zzcgr);
            if (zzgu != null) {
                zzgh.zzq("areec", zzgu);
            }
            zzgh.zzaop();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(zzcbc zzcbcVar) {
        if (this.zzgez) {
            zzclh zzgh = zzgh("ifts");
            zzgh.zzq("reason", "exception");
            if (!TextUtils.isEmpty(zzcbcVar.getMessage())) {
                zzgh.zzq(NotificationCompat.CATEGORY_MESSAGE, zzcbcVar.getMessage());
            }
            zzgh.zzaop();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzajk() {
        if (this.zzgez) {
            zzclh zzgh = zzgh("ifts");
            zzgh.zzq("reason", "blocked");
            zzgh.zzaop();
        }
    }

    private final boolean zzaol() {
        if (this.zzgey == null) {
            synchronized (this) {
                if (this.zzgey == null) {
                    zzaai<String> zzaaiVar = zzaat.zzcpv;
                    com.google.android.gms.ads.internal.zzp.zzkp();
                    this.zzgey = Boolean.valueOf(zzf((String) zzwe.zzpu().zzd(zzaaiVar), zzayh.zzbd(this.zzvr)));
                }
            }
        }
        return this.zzgey.booleanValue();
    }

    private static boolean zzf(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final zzclh zzgh(String str) {
        zzclh zzd = this.zzfns.zzaor().zza(this.zzeua.zzhbq.zzhbn).zzd(this.zzflh);
        zzd.zzq("action", str);
        if (!this.zzflh.zzhap.isEmpty()) {
            zzd.zzq("ancn", this.zzflh.zzhap.get(0));
        }
        return zzd;
    }
}
