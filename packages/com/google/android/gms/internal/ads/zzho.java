package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzho implements Parcelable {
    public static final Parcelable.Creator<zzho> CREATOR = new zzhr();
    public final int height;
    public final int width;
    private final String zzagt;
    public final int zzagu;
    public final String zzagv;
    private final zzmc zzagw;
    private final String zzagx;
    public final String zzagy;
    public final int zzagz;
    public final List<byte[]> zzaha;
    public final zzjn zzahb;
    public final float zzahc;
    public final int zzahd;
    public final float zzahe;
    private final int zzahf;
    private final byte[] zzahg;
    private final zzpr zzahh;
    public final int zzahi;
    public final int zzahj;
    public final int zzahk;
    private final int zzahl;
    private final int zzahm;
    public final long zzahn;
    public final int zzaho;
    public final String zzahp;
    private final int zzahq;
    private int zzahr;

    public static zzho zza(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzpr zzprVar, zzjn zzjnVar) {
        return new zzho(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzprVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzjnVar, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static zzho zza(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zzjn zzjnVar, int i5, String str4) {
        return zza(str, str2, null, -1, -1, i3, i4, -1, null, zzjnVar, 0, str4);
    }

    public static zzho zza(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zzjn zzjnVar, int i6, String str4) {
        return new zzho(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zzjnVar, null);
    }

    public static zzho zza(String str, String str2, String str3, int i, int i2, String str4, zzjn zzjnVar) {
        return zza(str, str2, null, -1, i2, str4, -1, zzjnVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzho zza(String str, String str2, String str3, int i, int i2, String str4, int i3, zzjn zzjnVar, long j, List<byte[]> list) {
        return new zzho(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzjnVar, null);
    }

    public static zzho zza(String str, String str2, String str3, int i, List<byte[]> list, String str4, zzjn zzjnVar) {
        return new zzho(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzjnVar, null);
    }

    public static zzho zza(String str, String str2, long j) {
        return new zzho(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static zzho zza(String str, String str2, String str3, int i, zzjn zzjnVar) {
        return new zzho(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzjnVar, null);
    }

    private zzho(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzpr zzprVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zzjn zzjnVar, zzmc zzmcVar) {
        this.zzagt = str;
        this.zzagx = str2;
        this.zzagy = str3;
        this.zzagv = str4;
        this.zzagu = i;
        this.zzagz = i2;
        this.width = i3;
        this.height = i4;
        this.zzahc = f;
        this.zzahd = i5;
        this.zzahe = f2;
        this.zzahg = bArr;
        this.zzahf = i6;
        this.zzahh = zzprVar;
        this.zzahi = i7;
        this.zzahj = i8;
        this.zzahk = i9;
        this.zzahl = i10;
        this.zzahm = i11;
        this.zzaho = i12;
        this.zzahp = str5;
        this.zzahq = i13;
        this.zzahn = j;
        this.zzaha = list == null ? Collections.emptyList() : list;
        this.zzahb = zzjnVar;
        this.zzagw = zzmcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzho(Parcel parcel) {
        this.zzagt = parcel.readString();
        this.zzagx = parcel.readString();
        this.zzagy = parcel.readString();
        this.zzagv = parcel.readString();
        this.zzagu = parcel.readInt();
        this.zzagz = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.zzahc = parcel.readFloat();
        this.zzahd = parcel.readInt();
        this.zzahe = parcel.readFloat();
        this.zzahg = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzahf = parcel.readInt();
        this.zzahh = (zzpr) parcel.readParcelable(zzpr.class.getClassLoader());
        this.zzahi = parcel.readInt();
        this.zzahj = parcel.readInt();
        this.zzahk = parcel.readInt();
        this.zzahl = parcel.readInt();
        this.zzahm = parcel.readInt();
        this.zzaho = parcel.readInt();
        this.zzahp = parcel.readString();
        this.zzahq = parcel.readInt();
        this.zzahn = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzaha = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzaha.add(parcel.createByteArray());
        }
        this.zzahb = (zzjn) parcel.readParcelable(zzjn.class.getClassLoader());
        this.zzagw = (zzmc) parcel.readParcelable(zzmc.class.getClassLoader());
    }

    public final zzho zzv(int i) {
        return new zzho(this.zzagt, this.zzagx, this.zzagy, this.zzagv, this.zzagu, i, this.width, this.height, this.zzahc, this.zzahd, this.zzahe, this.zzahg, this.zzahf, this.zzahh, this.zzahi, this.zzahj, this.zzahk, this.zzahl, this.zzahm, this.zzaho, this.zzahp, this.zzahq, this.zzahn, this.zzaha, this.zzahb, this.zzagw);
    }

    public final zzho zzds(long j) {
        return new zzho(this.zzagt, this.zzagx, this.zzagy, this.zzagv, this.zzagu, this.zzagz, this.width, this.height, this.zzahc, this.zzahd, this.zzahe, this.zzahg, this.zzahf, this.zzahh, this.zzahi, this.zzahj, this.zzahk, this.zzahl, this.zzahm, this.zzaho, this.zzahp, this.zzahq, j, this.zzaha, this.zzahb, this.zzagw);
    }

    public final zzho zzb(int i, int i2) {
        return new zzho(this.zzagt, this.zzagx, this.zzagy, this.zzagv, this.zzagu, this.zzagz, this.width, this.height, this.zzahc, this.zzahd, this.zzahe, this.zzahg, this.zzahf, this.zzahh, this.zzahi, this.zzahj, this.zzahk, i, i2, this.zzaho, this.zzahp, this.zzahq, this.zzahn, this.zzaha, this.zzahb, this.zzagw);
    }

    public final zzho zza(zzjn zzjnVar) {
        return new zzho(this.zzagt, this.zzagx, this.zzagy, this.zzagv, this.zzagu, this.zzagz, this.width, this.height, this.zzahc, this.zzahd, this.zzahe, this.zzahg, this.zzahf, this.zzahh, this.zzahi, this.zzahj, this.zzahk, this.zzahl, this.zzahm, this.zzaho, this.zzahp, this.zzahq, this.zzahn, this.zzaha, zzjnVar, this.zzagw);
    }

    public final zzho zza(zzmc zzmcVar) {
        return new zzho(this.zzagt, this.zzagx, this.zzagy, this.zzagv, this.zzagu, this.zzagz, this.width, this.height, this.zzahc, this.zzahd, this.zzahe, this.zzahg, this.zzahf, this.zzahh, this.zzahi, this.zzahj, this.zzahk, this.zzahl, this.zzahm, this.zzaho, this.zzahp, this.zzahq, this.zzahn, this.zzaha, this.zzahb, zzmcVar);
    }

    public final int zzex() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final MediaFormat zzey() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzagy);
        String str = this.zzahp;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zza(mediaFormat, "max-input-size", this.zzagz);
        zza(mediaFormat, "width", this.width);
        zza(mediaFormat, "height", this.height);
        float f = this.zzahc;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zza(mediaFormat, "rotation-degrees", this.zzahd);
        zza(mediaFormat, "channel-count", this.zzahi);
        zza(mediaFormat, "sample-rate", this.zzahj);
        zza(mediaFormat, "encoder-delay", this.zzahl);
        zza(mediaFormat, "encoder-padding", this.zzahm);
        for (int i = 0; i < this.zzaha.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.zzaha.get(i)));
        }
        zzpr zzprVar = this.zzahh;
        if (zzprVar != null) {
            zza(mediaFormat, "color-transfer", zzprVar.zzart);
            zza(mediaFormat, "color-standard", zzprVar.zzars);
            zza(mediaFormat, "color-range", zzprVar.zzaru);
            byte[] bArr = zzprVar.zzbkn;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.zzagt;
        String str2 = this.zzagx;
        String str3 = this.zzagy;
        int i = this.zzagu;
        String str4 = this.zzahp;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.zzahc;
        int i4 = this.zzahi;
        int i5 = this.zzahj;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            String str = this.zzagt;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zzagx;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzagy;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzagv;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzagu) * 31) + this.width) * 31) + this.height) * 31) + this.zzahi) * 31) + this.zzahj) * 31;
            String str5 = this.zzahp;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzahq) * 31;
            zzjn zzjnVar = this.zzahb;
            int hashCode6 = (hashCode5 + (zzjnVar == null ? 0 : zzjnVar.hashCode())) * 31;
            zzmc zzmcVar = this.zzagw;
            this.zzahr = hashCode6 + (zzmcVar != null ? zzmcVar.hashCode() : 0);
        }
        return this.zzahr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzho zzhoVar = (zzho) obj;
            if (this.zzagu == zzhoVar.zzagu && this.zzagz == zzhoVar.zzagz && this.width == zzhoVar.width && this.height == zzhoVar.height && this.zzahc == zzhoVar.zzahc && this.zzahd == zzhoVar.zzahd && this.zzahe == zzhoVar.zzahe && this.zzahf == zzhoVar.zzahf && this.zzahi == zzhoVar.zzahi && this.zzahj == zzhoVar.zzahj && this.zzahk == zzhoVar.zzahk && this.zzahl == zzhoVar.zzahl && this.zzahm == zzhoVar.zzahm && this.zzahn == zzhoVar.zzahn && this.zzaho == zzhoVar.zzaho && zzpq.zza(this.zzagt, zzhoVar.zzagt) && zzpq.zza(this.zzahp, zzhoVar.zzahp) && this.zzahq == zzhoVar.zzahq && zzpq.zza(this.zzagx, zzhoVar.zzagx) && zzpq.zza(this.zzagy, zzhoVar.zzagy) && zzpq.zza(this.zzagv, zzhoVar.zzagv) && zzpq.zza(this.zzahb, zzhoVar.zzahb) && zzpq.zza(this.zzagw, zzhoVar.zzagw) && zzpq.zza(this.zzahh, zzhoVar.zzahh) && Arrays.equals(this.zzahg, zzhoVar.zzahg) && this.zzaha.size() == zzhoVar.zzaha.size()) {
                for (int i = 0; i < this.zzaha.size(); i++) {
                    if (!Arrays.equals(this.zzaha.get(i), zzhoVar.zzaha.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzagt);
        parcel.writeString(this.zzagx);
        parcel.writeString(this.zzagy);
        parcel.writeString(this.zzagv);
        parcel.writeInt(this.zzagu);
        parcel.writeInt(this.zzagz);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.zzahc);
        parcel.writeInt(this.zzahd);
        parcel.writeFloat(this.zzahe);
        parcel.writeInt(this.zzahg != null ? 1 : 0);
        byte[] bArr = this.zzahg;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzahf);
        parcel.writeParcelable(this.zzahh, i);
        parcel.writeInt(this.zzahi);
        parcel.writeInt(this.zzahj);
        parcel.writeInt(this.zzahk);
        parcel.writeInt(this.zzahl);
        parcel.writeInt(this.zzahm);
        parcel.writeInt(this.zzaho);
        parcel.writeString(this.zzahp);
        parcel.writeInt(this.zzahq);
        parcel.writeLong(this.zzahn);
        int size = this.zzaha.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.zzaha.get(i2));
        }
        parcel.writeParcelable(this.zzahb, 0);
        parcel.writeParcelable(this.zzagw, 0);
    }
}
