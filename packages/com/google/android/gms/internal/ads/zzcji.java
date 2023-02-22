package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcji {
    private final zzcjd zzgdx;
    private final AtomicReference<zzamu> zzgdy = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcji(zzcjd zzcjdVar) {
        this.zzgdx = zzcjdVar;
    }

    public final void zzb(zzamu zzamuVar) {
        this.zzgdy.compareAndSet(null, zzamuVar);
    }

    public final zzdlx zzd(String str, JSONObject jSONObject) throws zzdlr {
        zzamv zze;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zze = new zzanq(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                zze = new zzanq(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zze = new zzanq(new zzapq());
            } else {
                zze = zze(str, jSONObject);
            }
            zzdlx zzdlxVar = new zzdlx(zze);
            this.zzgdx.zza(str, zzdlxVar);
            return zzdlxVar;
        } catch (Throwable th) {
            throw new zzdlr(th);
        }
    }

    public final zzapa zzdm(String str) throws RemoteException {
        zzapa zzdm = zzant().zzdm(str);
        this.zzgdx.zza(str, zzdm);
        return zzdm;
    }

    public final boolean zzans() {
        return this.zzgdy.get() != null;
    }

    private final zzamv zze(String str, JSONObject jSONObject) throws RemoteException {
        zzamu zzant = zzant();
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                if (zzant.zzdj(jSONObject.getString("class_name"))) {
                    return zzant.zzdi("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                }
                return zzant.zzdi("com.google.ads.mediation.customevent.CustomEventAdapter");
            } catch (JSONException e) {
                zzaxy.zzc("Invalid custom event.", e);
            }
        }
        return zzant.zzdi(str);
    }

    private final zzamu zzant() throws RemoteException {
        zzamu zzamuVar = this.zzgdy.get();
        if (zzamuVar != null) {
            return zzamuVar;
        }
        zzaxy.zzfe("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
