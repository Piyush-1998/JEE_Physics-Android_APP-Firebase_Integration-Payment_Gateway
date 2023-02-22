package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzadm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzadm> CREATOR = new zzadl();
    public final int versionCode;
    public final int zzbnj;
    public final int zzbnk;
    public final boolean zzbnl;
    public final int zzbnm;
    public final boolean zzbno;
    public final boolean zzdcs;
    public final zzaac zzdct;

    public zzadm(NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzaac(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzjr(), nativeAdOptions.getMediaAspectRatio());
    }

    public zzadm(int i, boolean z, int i2, boolean z2, int i3, zzaac zzaacVar, boolean z3, int i4) {
        this.versionCode = i;
        this.zzdcs = z;
        this.zzbnj = i2;
        this.zzbnl = z2;
        this.zzbnm = i3;
        this.zzdct = zzaacVar;
        this.zzbno = z3;
        this.zzbnk = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzdcs);
        SafeParcelWriter.writeInt(parcel, 3, this.zzbnj);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzbnl);
        SafeParcelWriter.writeInt(parcel, 5, this.zzbnm);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdct, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzbno);
        SafeParcelWriter.writeInt(parcel, 8, this.zzbnk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
