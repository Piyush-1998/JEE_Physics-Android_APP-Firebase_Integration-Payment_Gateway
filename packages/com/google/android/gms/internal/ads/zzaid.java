package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaid implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzbbq zzbvn;
    private final /* synthetic */ zzahz zzdfd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaid(zzahz zzahzVar, zzbbq zzbbqVar) {
        this.zzdfd = zzahzVar;
        this.zzbvn = zzbbqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzahs zzahsVar;
        try {
            zzbbq zzbbqVar = this.zzbvn;
            zzahsVar = this.zzdfd.zzdfb;
            zzbbqVar.set(zzahsVar.zzsx());
        } catch (DeadObjectException e) {
            this.zzbvn.setException(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbbq zzbbqVar = this.zzbvn;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzbbqVar.setException(new RuntimeException(sb.toString()));
    }
}
