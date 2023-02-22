package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcws {
    private final zzcji zzggg;
    private final ConcurrentHashMap<String, zzapa> zzgpi = new ConcurrentHashMap<>();

    public zzcws(zzcji zzcjiVar) {
        this.zzggg = zzcjiVar;
    }

    public final void zzgo(String str) {
        try {
            this.zzgpi.put(str, this.zzggg.zzdm(str));
        } catch (RemoteException e) {
            zzaxy.zzc("Couldn't create RTB adapter : ", e);
        }
    }

    @CheckForNull
    public final zzapa zzgp(String str) {
        if (this.zzgpi.containsKey(str)) {
            return this.zzgpi.get(str);
        }
        return null;
    }
}
