package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmg extends zzmj {
    public static final Parcelable.Creator<zzmg> CREATOR = new zzmf();
    private final String description;
    private final String mimeType;
    private final int zzbdd;
    private final byte[] zzbde;

    public zzmg(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = null;
        this.zzbdd = 3;
        this.zzbde = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmg(Parcel parcel) {
        super("APIC");
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.zzbdd = parcel.readInt();
        this.zzbde = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmg zzmgVar = (zzmg) obj;
            if (this.zzbdd == zzmgVar.zzbdd && zzpq.zza(this.mimeType, zzmgVar.mimeType) && zzpq.zza(this.description, zzmgVar.description) && Arrays.equals(this.zzbde, zzmgVar.zzbde)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zzbdd + 527) * 31;
        String str = this.mimeType;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzbde);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.zzbdd);
        parcel.writeByteArray(this.zzbde);
    }
}
