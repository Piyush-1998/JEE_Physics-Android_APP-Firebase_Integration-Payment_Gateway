package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdex implements zzden<zzdeu> {
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzdex(zzdvw zzdvwVar, Context context) {
        this.zzgay = zzdvwVar;
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdeu> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdew
            private final zzdex zzgvr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgvr = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgvr.zzark();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdeu zzark() throws Exception {
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzvr.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzp.zzkp();
        int i4 = -1;
        if (zzayh.zzr(this.zzvr, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzvr.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i4 = activeNetworkInfo.getType();
                i3 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i3 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i2 = i3;
            i = i4;
        } else {
            i = -2;
            z = false;
            i2 = -1;
        }
        return new zzdeu(networkOperator, i, networkType, phoneType, z, i2);
    }
}
