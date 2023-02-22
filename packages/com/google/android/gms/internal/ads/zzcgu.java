package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgu extends zzaen {
    private final String zzfqh;
    private final zzccv zzfvt;
    private final zzcco zzfyz;

    public zzcgu(String str, zzcco zzccoVar, zzccv zzccvVar) {
        this.zzfqh = str;
        this.zzfyz = zzccoVar;
        this.zzfvt = zzccvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final IObjectWrapper zzsg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfyz);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final String getHeadline() throws RemoteException {
        return this.zzfvt.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final List<?> getImages() throws RemoteException {
        return this.zzfvt.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final String getBody() throws RemoteException {
        return this.zzfvt.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final zzadw zzsk() throws RemoteException {
        return this.zzfvt.zzsk();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final String getCallToAction() throws RemoteException {
        return this.zzfvt.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final String getAdvertiser() throws RemoteException {
        return this.zzfvt.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final Bundle getExtras() throws RemoteException {
        return this.zzfvt.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void destroy() throws RemoteException {
        this.zzfyz.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final zzyg getVideoController() throws RemoteException {
        return this.zzfvt.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzfyz.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzfyz.zzi(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzfyz.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final zzado zzsi() throws RemoteException {
        return this.zzfvt.zzsi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final IObjectWrapper zzsj() throws RemoteException {
        return this.zzfvt.zzsj();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzfqh;
    }
}
