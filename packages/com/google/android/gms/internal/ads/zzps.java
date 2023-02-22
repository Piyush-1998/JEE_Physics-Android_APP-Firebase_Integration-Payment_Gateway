package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzps {
    private final int height;
    private final int width;
    public final List<byte[]> zzaha;
    public final int zzasn;
    public final float zzbjy;

    public static zzps zzg(zzpk zzpkVar) throws zzhv {
        int i;
        int i2;
        float f;
        try {
            zzpkVar.zzbp(4);
            int readUnsignedByte = (zzpkVar.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = zzpkVar.readUnsignedByte() & 31;
            for (int i3 = 0; i3 < readUnsignedByte2; i3++) {
                arrayList.add(zzh(zzpkVar));
            }
            int readUnsignedByte3 = zzpkVar.readUnsignedByte();
            for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                arrayList.add(zzh(zzpkVar));
            }
            if (readUnsignedByte2 > 0) {
                zzpi zzd = zzpf.zzd((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i5 = zzd.width;
                int i6 = zzd.height;
                f = zzd.zzbjy;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzps(arrayList, readUnsignedByte, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhv("Error parsing AVC config", e);
        }
    }

    private zzps(List<byte[]> list, int i, int i2, int i3, float f) {
        this.zzaha = list;
        this.zzasn = i;
        this.width = i2;
        this.height = i3;
        this.zzbjy = f;
    }

    private static byte[] zzh(zzpk zzpkVar) {
        int readUnsignedShort = zzpkVar.readUnsignedShort();
        int position = zzpkVar.getPosition();
        zzpkVar.zzbp(readUnsignedShort);
        return zzpc.zzc(zzpkVar.data, position, readUnsignedShort);
    }
}
