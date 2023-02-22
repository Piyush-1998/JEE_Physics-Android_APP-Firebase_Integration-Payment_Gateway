package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzael extends NativeAppInstallAd {
    private final zzaek zzdcy;
    private final zzadx zzdda;
    private final NativeAd.AdChoicesInfo zzddb;
    private final List<NativeAd.Image> zzdcz = new ArrayList();
    private final VideoController zzcjj = new VideoController();

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(7:27|28|29|30|(2:32|33)|35|36)|41|28|29|30|(0)|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        com.google.android.gms.internal.ads.zzbbd.zzc("", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: RemoteException -> 0x0081, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0081, blocks: (B:30:0x006c, B:32:0x0074), top: B:38:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzael(com.google.android.gms.internal.ads.zzaek r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzdcz = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzcjj = r1
            r5.zzdcy = r6
            r1 = 0
            java.util.List r6 = r6.getImages()     // Catch: android.os.RemoteException -> L53
            if (r6 == 0) goto L57
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L53
        L20:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L57
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L53
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L53
            if (r3 == 0) goto L45
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L53
            if (r2 == 0) goto L45
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L53
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzadw     // Catch: android.os.RemoteException -> L53
            if (r4 == 0) goto L3f
            com.google.android.gms.internal.ads.zzadw r3 = (com.google.android.gms.internal.ads.zzadw) r3     // Catch: android.os.RemoteException -> L53
            goto L46
        L3f:
            com.google.android.gms.internal.ads.zzady r3 = new com.google.android.gms.internal.ads.zzady     // Catch: android.os.RemoteException -> L53
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L53
            goto L46
        L45:
            r3 = r1
        L46:
            if (r3 == 0) goto L20
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.zzdcz     // Catch: android.os.RemoteException -> L53
            com.google.android.gms.internal.ads.zzadx r4 = new com.google.android.gms.internal.ads.zzadx     // Catch: android.os.RemoteException -> L53
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L53
            r2.add(r4)     // Catch: android.os.RemoteException -> L53
            goto L20
        L53:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbbd.zzc(r0, r6)
        L57:
            com.google.android.gms.internal.ads.zzaek r6 = r5.zzdcy     // Catch: android.os.RemoteException -> L65
            com.google.android.gms.internal.ads.zzadw r6 = r6.zzsh()     // Catch: android.os.RemoteException -> L65
            if (r6 == 0) goto L69
            com.google.android.gms.internal.ads.zzadx r2 = new com.google.android.gms.internal.ads.zzadx     // Catch: android.os.RemoteException -> L65
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L65
            goto L6a
        L65:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbbd.zzc(r0, r6)
        L69:
            r2 = r1
        L6a:
            r5.zzdda = r2
            com.google.android.gms.internal.ads.zzaek r6 = r5.zzdcy     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzado r6 = r6.zzsi()     // Catch: android.os.RemoteException -> L81
            if (r6 == 0) goto L85
            com.google.android.gms.internal.ads.zzadp r6 = new com.google.android.gms.internal.ads.zzadp     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzaek r2 = r5.zzdcy     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzado r2 = r2.zzsi()     // Catch: android.os.RemoteException -> L81
            r6.<init>(r2)     // Catch: android.os.RemoteException -> L81
            r1 = r6
            goto L85
        L81:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbbd.zzc(r0, r6)
        L85:
            r5.zzddb = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzael.<init>(com.google.android.gms.internal.ads.zzaek):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.NativeAd
    /* renamed from: zzsg */
    public final IObjectWrapper zzjq() {
        try {
            return this.zzdcy.zzsg();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zzdcy.performClick(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzdcy.recordImpression(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzdcy.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getHeadline() {
        try {
            return this.zzdcy.getHeadline();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final List<NativeAd.Image> getImages() {
        return this.zzdcz;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getBody() {
        try {
            return this.zzdcy.getBody();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.Image getIcon() {
        return this.zzdda;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getCallToAction() {
        try {
            return this.zzdcy.getCallToAction();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Double getStarRating() {
        try {
            double starRating = this.zzdcy.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getStore() {
        try {
            return this.zzdcy.getStore();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getPrice() {
        try {
            return this.zzdcy.getPrice();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final VideoController getVideoController() {
        try {
            if (this.zzdcy.getVideoController() != null) {
                this.zzcjj.zza(this.zzdcy.getVideoController());
            }
        } catch (RemoteException e) {
            zzbbd.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcjj;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzddb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzdcy.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final Bundle getExtras() {
        try {
            return this.zzdcy.getExtras();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAppInstallAd
    public final void destroy() {
        try {
            this.zzdcy.destroy();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
