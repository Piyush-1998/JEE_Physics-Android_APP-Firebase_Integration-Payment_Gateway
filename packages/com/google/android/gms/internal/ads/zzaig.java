package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaig implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbbq zzbvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaig(zzahz zzahzVar, zzbbq zzbbqVar) {
        this.zzbvn = zzbbqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbvn.setException(new RuntimeException("Connection failed."));
    }
}
