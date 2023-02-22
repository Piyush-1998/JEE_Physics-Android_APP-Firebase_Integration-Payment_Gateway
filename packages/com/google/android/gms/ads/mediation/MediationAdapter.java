package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface MediationAdapter extends MediationExtrasReceiver {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private int zzeqf;

        public final zza zzdv(int i) {
            this.zzeqf = 1;
            return this;
        }

        public final Bundle zzadc() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzeqf);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
