package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzasp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzasp> CREATOR = new zzaso();
    public final ApplicationInfo applicationInfo;
    public final String packageName;
    public final zzbbg zzdpq;
    public final PackageInfo zzdpx;
    public final List<String> zzdqh;
    public final String zzdqr;
    public final Bundle zzdtd;
    public final boolean zzdte;
    public final String zzdtf;
    public zzdnd zzdtg;
    public String zzdth;

    public zzasp(Bundle bundle, zzbbg zzbbgVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3, zzdnd zzdndVar, String str4) {
        this.zzdtd = bundle;
        this.zzdpq = zzbbgVar;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzdqh = list;
        this.zzdpx = packageInfo;
        this.zzdqr = str2;
        this.zzdte = z;
        this.zzdtf = str3;
        this.zzdtg = zzdndVar;
        this.zzdth = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zzdtd, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdpq, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.packageName, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzdqh, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzdpx, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdqr, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdte);
        SafeParcelWriter.writeString(parcel, 9, this.zzdtf, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzdtg, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzdth, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
