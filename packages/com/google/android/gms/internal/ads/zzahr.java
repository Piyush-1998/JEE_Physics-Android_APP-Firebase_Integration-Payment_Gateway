package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzahr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzahr> CREATOR = new zzahu();
    private final String url;
    private final String[] zzdey;
    private final String[] zzdez;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahr(String str, String[] strArr, String[] strArr2) {
        this.url = str;
        this.zzdey = strArr;
        this.zzdez = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzdey, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzdez, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static zzahr zzh(zzaa<?> zzaaVar) throws zzl {
        Map<String, String> headers = zzaaVar.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new zzahr(zzaaVar.getUrl(), strArr, strArr2);
    }
}
