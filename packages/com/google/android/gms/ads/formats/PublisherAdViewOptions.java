package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzaaa;
import com.google.android.gms.internal.ads.zzafp;
import com.google.android.gms.internal.ads.zzafq;
import com.google.android.gms.internal.ads.zzvn;
import com.google.android.gms.internal.ads.zzxc;
import com.google.android.gms.internal.ads.zzxf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzc();
    private final boolean zzbnu;
    private final zzxc zzbnv;
    private AppEventListener zzbnw;
    private final IBinder zzbnx;

    private PublisherAdViewOptions(Builder builder) {
        this.zzbnu = builder.zzbnu;
        AppEventListener appEventListener = builder.zzbnw;
        this.zzbnw = appEventListener;
        this.zzbnv = appEventListener != null ? new zzvn(this.zzbnw) : null;
        this.zzbnx = builder.zzbny != null ? new zzaaa(builder.zzbny) : null;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzbnu = false;
        private AppEventListener zzbnw;
        private ShouldDelayBannerRenderingListener zzbny;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbnu = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbnw = appEventListener;
            return this;
        }

        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzbny = shouldDelayBannerRenderingListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.zzbnu = z;
        this.zzbnv = iBinder != null ? zzxf.zze(iBinder) : null;
        this.zzbnx = iBinder2;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbnw;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbnu;
    }

    public final zzxc zzjt() {
        return this.zzbnv;
    }

    public final zzafq zzju() {
        return zzafp.zzy(this.zzbnx);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        zzxc zzxcVar = this.zzbnv;
        SafeParcelWriter.writeIBinder(parcel, 2, zzxcVar == null ? null : zzxcVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzbnx, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
