package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpy {
    public final List<byte[]> zzaha;
    public final int zzasn;

    public static zzpy zzi(zzpk zzpkVar) throws zzhv {
        try {
            zzpkVar.zzbp(21);
            int readUnsignedByte = zzpkVar.readUnsignedByte() & 3;
            int readUnsignedByte2 = zzpkVar.readUnsignedByte();
            int position = zzpkVar.getPosition();
            int i = 0;
            for (int i2 = 0; i2 < readUnsignedByte2; i2++) {
                zzpkVar.zzbp(1);
                int readUnsignedShort = zzpkVar.readUnsignedShort();
                for (int i3 = 0; i3 < readUnsignedShort; i3++) {
                    int readUnsignedShort2 = zzpkVar.readUnsignedShort();
                    i += readUnsignedShort2 + 4;
                    zzpkVar.zzbp(readUnsignedShort2);
                }
            }
            zzpkVar.zzbo(position);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
                zzpkVar.zzbp(1);
                int readUnsignedShort3 = zzpkVar.readUnsignedShort();
                for (int i6 = 0; i6 < readUnsignedShort3; i6++) {
                    int readUnsignedShort4 = zzpkVar.readUnsignedShort();
                    System.arraycopy(zzpf.zzbjn, 0, bArr, i4, zzpf.zzbjn.length);
                    int length = i4 + zzpf.zzbjn.length;
                    System.arraycopy(zzpkVar.data, zzpkVar.getPosition(), bArr, length, readUnsignedShort4);
                    i4 = length + readUnsignedShort4;
                    zzpkVar.zzbp(readUnsignedShort4);
                }
            }
            return new zzpy(i == 0 ? null : Collections.singletonList(bArr), readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing HEVC config", e);
        }
    }

    private zzpy(List<byte[]> list, int i) {
        this.zzaha = list;
        this.zzasn = i;
    }
}
