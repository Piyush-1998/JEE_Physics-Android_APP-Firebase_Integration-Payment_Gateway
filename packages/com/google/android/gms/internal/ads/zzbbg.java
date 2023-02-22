package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbg> CREATOR = new zzbbj();
    public String zzbra;
    public int zzedq;
    public int zzedr;
    public boolean zzeds;
    public boolean zzedt;

    public zzbbg(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzbbg(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzbbg(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbg.<init>(int, int, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbg(String str, int i, int i2, boolean z, boolean z2) {
        this.zzbra = str;
        this.zzedq = i;
        this.zzedr = i2;
        this.zzeds = z;
        this.zzedt = z2;
    }

    public static zzbbg zzyr() {
        return new zzbbg(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbra, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzedq);
        SafeParcelWriter.writeInt(parcel, 4, this.zzedr);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzeds);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzedt);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
