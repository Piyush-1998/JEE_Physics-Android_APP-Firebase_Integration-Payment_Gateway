package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzy> CREATOR = new zzzx();
    public final String zzbqs;

    public zzzy(SearchAdRequest searchAdRequest) {
        this.zzbqs = searchAdRequest.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzy(String str) {
        this.zzbqs = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.zzbqs, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
