package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzmf implements Parcelable.Creator<zzmg> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmg[] newArray(int i) {
        return new zzmg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmg createFromParcel(Parcel parcel) {
        return new zzmg(parcel);
    }
}
