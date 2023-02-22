package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbws extends zzbxe<AppEventListener> implements zzagn {
    public zzbws(Set<zzbys<AppEventListener>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final synchronized void onAppEvent(final String str, final String str2) {
        zza(new zzbxg(str, str2) { // from class: com.google.android.gms.internal.ads.zzbwv
            private final String zzdft;
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
                this.zzdft = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((AppEventListener) obj).onAppEvent(this.zzdgb, this.zzdft);
            }
        });
    }
}
