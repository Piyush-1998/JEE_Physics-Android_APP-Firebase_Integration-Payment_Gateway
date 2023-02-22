package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzkq {
    public int height;
    public int number;
    public int type;
    public int width;
    public zzjn zzahb;
    public int zzahf;
    public byte[] zzahg;
    public int zzahi;
    public int zzahj;
    private String zzahp;
    public String zzari;
    public int zzarj;
    public boolean zzark;
    public byte[] zzarl;
    public zzkf zzarm;
    public byte[] zzarn;
    public int zzaro;
    public int zzarp;
    public int zzarq;
    public boolean zzarr;
    public int zzars;
    public int zzart;
    public int zzaru;
    public int zzarv;
    public int zzarw;
    public float zzarx;
    public float zzary;
    public float zzarz;
    public float zzasa;
    public float zzasb;
    public float zzasc;
    public float zzasd;
    public float zzase;
    public float zzasf;
    public float zzasg;
    public int zzash;
    public long zzasi;
    public long zzasj;
    public boolean zzask;
    public boolean zzasl;
    public zzkg zzasm;
    public int zzasn;

    private zzkq() {
        this.width = -1;
        this.height = -1;
        this.zzaro = -1;
        this.zzarp = -1;
        this.zzarq = 0;
        this.zzahg = null;
        this.zzahf = -1;
        this.zzarr = false;
        this.zzars = -1;
        this.zzart = -1;
        this.zzaru = -1;
        this.zzarv = 1000;
        this.zzarw = 200;
        this.zzarx = -1.0f;
        this.zzary = -1.0f;
        this.zzarz = -1.0f;
        this.zzasa = -1.0f;
        this.zzasb = -1.0f;
        this.zzasc = -1.0f;
        this.zzasd = -1.0f;
        this.zzase = -1.0f;
        this.zzasf = -1.0f;
        this.zzasg = -1.0f;
        this.zzahi = 1;
        this.zzash = -1;
        this.zzahj = 8000;
        this.zzasi = 0L;
        this.zzasj = 0L;
        this.zzasl = true;
        this.zzahp = "eng";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:364:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzjx r43, int r44) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkq.zza(com.google.android.gms.internal.ads.zzjx, int):void");
    }

    private static List<byte[]> zza(zzpk zzpkVar) throws zzhv {
        try {
            zzpkVar.zzbp(16);
            if (zzpkVar.zzjb() != 826496599) {
                return null;
            }
            byte[] bArr = zzpkVar.data;
            for (int position = zzpkVar.getPosition() + 20; position < bArr.length - 4; position++) {
                if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length));
                }
            }
            throw new zzhv("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzhv {
        try {
            if (bArr[0] != 2) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            int i = 1;
            int i2 = 0;
            while (bArr[i] == -1) {
                i2 += 255;
                i++;
            }
            int i3 = i + 1;
            int i4 = i2 + bArr[i];
            int i5 = 0;
            while (bArr[i3] == -1) {
                i5 += 255;
                i3++;
            }
            int i6 = i3 + 1;
            int i7 = i5 + bArr[i3];
            if (bArr[i6] != 1) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i6, bArr2, 0, i4);
            int i8 = i6 + i4;
            if (bArr[i8] != 3) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            int i9 = i8 + i7;
            if (bArr[i9] != 5) {
                throw new zzhv("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i9];
            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhv("Error parsing vorbis codec private");
        }
    }

    private static boolean zzb(zzpk zzpkVar) throws zzhv {
        UUID uuid;
        UUID uuid2;
        try {
            int zziz = zzpkVar.zziz();
            if (zziz == 1) {
                return true;
            }
            if (zziz == 65534) {
                zzpkVar.zzbo(24);
                long readLong = zzpkVar.readLong();
                uuid = zzkl.zzapi;
                if (readLong == uuid.getMostSignificantBits()) {
                    long readLong2 = zzpkVar.readLong();
                    uuid2 = zzkl.zzapi;
                    if (readLong2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhv("Error parsing MS/ACM codec private");
        }
    }

    public /* synthetic */ zzkq(zzko zzkoVar) {
        this();
    }

    public static /* synthetic */ String zza(zzkq zzkqVar, String str) {
        zzkqVar.zzahp = str;
        return str;
    }
}
