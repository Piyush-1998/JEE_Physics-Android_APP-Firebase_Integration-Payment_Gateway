package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.database.core.ServerValues;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdy implements View.OnClickListener {
    private final Clock zzbpw;
    private final zzchc zzfzs;
    private zzafr zzfzt;
    private zzahf<Object> zzfzu;
    String zzfzv;
    Long zzfzw;
    WeakReference<View> zzfzx;

    public zzcdy(zzchc zzchcVar, Clock clock) {
        this.zzfzs = zzchcVar;
        this.zzbpw = clock;
    }

    public final void zza(final zzafr zzafrVar) {
        this.zzfzt = zzafrVar;
        zzahf<Object> zzahfVar = this.zzfzu;
        if (zzahfVar != null) {
            this.zzfzs.zzb("/unconfirmedClick", zzahfVar);
        }
        zzahf<Object> zzahfVar2 = new zzahf(this, zzafrVar) { // from class: com.google.android.gms.internal.ads.zzcdx
            private final zzcdy zzfzq;
            private final zzafr zzfzr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzq = this;
                this.zzfzr = zzafrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                zzcdy zzcdyVar = this.zzfzq;
                zzafr zzafrVar2 = this.zzfzr;
                try {
                    zzcdyVar.zzfzw = Long.valueOf(Long.parseLong((String) map.get(ServerValues.NAME_OP_TIMESTAMP)));
                } catch (NumberFormatException unused) {
                    zzaxy.zzfc("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzcdyVar.zzfzv = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzafrVar2 == null) {
                    zzaxy.zzef("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzafrVar2.onUnconfirmedClickReceived(str);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzfzu = zzahfVar2;
        this.zzfzs.zza("/unconfirmedClick", zzahfVar2);
    }

    public final zzafr zzamw() {
        return this.zzfzt;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzfzt == null || this.zzfzw == null) {
            return;
        }
        zzamx();
        try {
            this.zzfzt.onUnconfirmedClickCancelled();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzfzx;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zzfzv != null && this.zzfzw != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.zzfzv);
            hashMap.put("time_interval", String.valueOf(this.zzbpw.currentTimeMillis() - this.zzfzw.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzfzs.zza("sendMessageToNativeJs", hashMap);
        }
        zzamx();
    }

    private final void zzamx() {
        View view;
        this.zzfzv = null;
        this.zzfzw = null;
        WeakReference<View> weakReference = this.zzfzx;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzfzx = null;
    }
}
