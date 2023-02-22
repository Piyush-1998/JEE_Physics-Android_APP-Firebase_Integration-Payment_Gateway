package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgz implements zzahf<Object> {
    private final zzeli<zzcgw> zzfxe;
    private final zzchc zzfzs;
    private final zzafc zzgci;

    public zzcgz(zzcdg zzcdgVar, zzccv zzccvVar, zzchc zzchcVar, zzeli<zzcgw> zzeliVar) {
        this.zzgci = zzcdgVar.zzge(zzccvVar.getCustomTemplateId());
        this.zzfzs = zzchcVar;
        this.zzfxe = zzeliVar;
    }

    public final void zzanf() {
        if (this.zzgci == null) {
            return;
        }
        this.zzfzs.zza("/nativeAdCustomClick", this);
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zzgci.zza(this.zzfxe.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzaxy.zzd(sb.toString(), e);
        }
    }
}
