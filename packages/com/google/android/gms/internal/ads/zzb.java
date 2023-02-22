package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzb {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0292, TryCatch #0 {all -> 0x0292, blocks: (B:3:0x0009, B:5:0x000f, B:7:0x0028, B:12:0x0039, B:14:0x0041, B:18:0x0050, B:20:0x0083, B:22:0x0092, B:26:0x00a6, B:28:0x00b2, B:30:0x00d5, B:32:0x00f1, B:33:0x00fe, B:35:0x0104, B:37:0x010b, B:43:0x0121, B:45:0x012c, B:47:0x0135, B:50:0x0153, B:51:0x015a, B:52:0x0182, B:53:0x0183, B:54:0x019f, B:55:0x01a0, B:56:0x01b8, B:57:0x01b9, B:58:0x01c0, B:59:0x01c1, B:60:0x01c8, B:61:0x01c9, B:62:0x01ea, B:63:0x01eb, B:64:0x0203, B:65:0x0204, B:66:0x021d, B:67:0x021e, B:68:0x0225, B:69:0x0226, B:70:0x023e, B:71:0x023f, B:72:0x0246, B:73:0x0247, B:74:0x0267, B:75:0x0268, B:76:0x026f, B:77:0x0270, B:78:0x0291), top: B:86:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0268 A[Catch: all -> 0x0292, TryCatch #0 {all -> 0x0292, blocks: (B:3:0x0009, B:5:0x000f, B:7:0x0028, B:12:0x0039, B:14:0x0041, B:18:0x0050, B:20:0x0083, B:22:0x0092, B:26:0x00a6, B:28:0x00b2, B:30:0x00d5, B:32:0x00f1, B:33:0x00fe, B:35:0x0104, B:37:0x010b, B:43:0x0121, B:45:0x012c, B:47:0x0135, B:50:0x0153, B:51:0x015a, B:52:0x0182, B:53:0x0183, B:54:0x019f, B:55:0x01a0, B:56:0x01b8, B:57:0x01b9, B:58:0x01c0, B:59:0x01c1, B:60:0x01c8, B:61:0x01c9, B:62:0x01ea, B:63:0x01eb, B:64:0x0203, B:65:0x0204, B:66:0x021d, B:67:0x021e, B:68:0x0225, B:69:0x0226, B:70:0x023e, B:71:0x023f, B:72:0x0246, B:73:0x0247, B:74:0x0267, B:75:0x0268, B:76:0x026f, B:77:0x0270, B:78:0x0291), top: B:86:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[][] zza(java.lang.String r18) throws com.google.android.gms.internal.ads.zzh, java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzb.zza(java.lang.String):java.security.cert.X509Certificate[][]");
    }

    private static X509Certificate[][] zza(FileChannel fileChannel, zze zzeVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zzb;
                ByteBuffer zza = zza(byteBuffer);
                int i = 0;
                while (zza.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zza(zza(zza), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Failed to parse/verify signer #");
                        sb.append(i);
                        sb.append(" block");
                        throw new SecurityException(sb.toString(), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    j = zzeVar.zzc;
                    j2 = zzeVar.zzd;
                    j3 = zzeVar.zze;
                    byteBuffer2 = zzeVar.zzf;
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No digests provided");
                    }
                    zzf zzfVar = new zzf(fileChannel, 0L, j);
                    zzf zzfVar2 = new zzf(fileChannel, j2, j3 - j2);
                    ByteBuffer duplicate = byteBuffer2.duplicate();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    zzi.zza(duplicate, j);
                    zzd zzdVar = new zzd(duplicate);
                    int size = hashMap.size();
                    int[] iArr = new int[size];
                    int i2 = 0;
                    for (Integer num : hashMap.keySet()) {
                        iArr[i2] = num.intValue();
                        i2++;
                    }
                    try {
                        byte[][] zza2 = zza(iArr, new zzc[]{zzfVar, zzfVar2, zzdVar});
                        for (int i3 = 0; i3 < size; i3++) {
                            int i4 = iArr[i3];
                            if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i4)), zza2[i3])) {
                                throw new SecurityException(String.valueOf(zzb(i4)).concat(" digest of contents did not verify"));
                            }
                        }
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    } catch (DigestException e2) {
                        throw new SecurityException("Failed to compute digest(s) of contents", e2);
                    }
                }
                throw new SecurityException("No content digests found");
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zza(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzb.zza(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zza(int[] iArr, zzc[] zzcVarArr) throws DigestException {
        long j;
        zzc[] zzcVarArr2 = zzcVarArr;
        int length = zzcVarArr2.length;
        long j2 = 0;
        int i = 0;
        long j3 = 0;
        int i2 = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i2 >= length) {
                break;
            }
            j3 += ((zzcVarArr2[i2].size() + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - 1) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i2++;
        }
        if (j3 >= 2097151) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Too many chunks: ");
            sb.append(j3);
            throw new DigestException(sb.toString());
        }
        int i3 = (int) j3;
        byte[][] bArr = new byte[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            byte[] bArr2 = new byte[(zzc(iArr[i4]) * i3) + 5];
            bArr2[0] = 90;
            zza(i3, bArr2, 1);
            bArr[i4] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length2 = iArr.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length2];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            String zzb = zzb(iArr[i5]);
            try {
                messageDigestArr[i5] = MessageDigest.getInstance(zzb);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(String.valueOf(zzb).concat(" digest not supported"), e);
            }
        }
        int length3 = zzcVarArr2.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length3) {
            zzc zzcVar = zzcVarArr2[i6];
            long j4 = j2;
            int i8 = i7;
            int i9 = length3;
            long size = zzcVar.size();
            while (size > j2) {
                int min = (int) Math.min(size, j);
                zza(min, bArr3, 1);
                for (int i10 = 0; i10 < length2; i10++) {
                    messageDigestArr[i10].update(bArr3);
                }
                long j5 = j4;
                try {
                    zzcVar.zza(messageDigestArr, j5, min);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i11];
                        int zzc = zzc(i12);
                        int i13 = length2;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int i14 = i8;
                        zzc zzcVar2 = zzcVar;
                        int digest = messageDigest.digest(bArr5, (i14 * zzc) + 5, zzc);
                        if (digest != zzc) {
                            String algorithm = messageDigest.getAlgorithm();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                            sb2.append("Unexpected output size of ");
                            sb2.append(algorithm);
                            sb2.append(" digest: ");
                            sb2.append(digest);
                            throw new RuntimeException(sb2.toString());
                        }
                        i11++;
                        i8 = i14;
                        bArr3 = bArr4;
                        length2 = i13;
                        messageDigestArr = messageDigestArr2;
                        zzcVar = zzcVar2;
                    }
                    long j6 = min;
                    long j7 = j5 + j6;
                    size -= j6;
                    i8++;
                    bArr3 = bArr3;
                    messageDigestArr = messageDigestArr;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    j4 = j7;
                    j2 = 0;
                } catch (IOException e2) {
                    StringBuilder sb3 = new StringBuilder(59);
                    sb3.append("Failed to digest chunk #");
                    sb3.append(i8);
                    sb3.append(" of section #");
                    sb3.append(i);
                    throw new DigestException(sb3.toString(), e2);
                }
            }
            i++;
            i6++;
            zzcVarArr2 = zzcVarArr;
            i7 = i8;
            length3 = i9;
            messageDigestArr = messageDigestArr;
            j2 = 0;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            byte[] bArr7 = bArr[i15];
            String zzb2 = zzb(i16);
            try {
                bArr6[i15] = MessageDigest.getInstance(zzb2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(String.valueOf(zzb2).concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static int zza(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return "SHA-256";
    }

    private static int zzc(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Unknown content digest algorthm: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        return 32;
    }

    private static ByteBuffer zza(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 < 8) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("end < start: ");
            sb.append(i2);
            sb.append(" < 8");
            throw new IllegalArgumentException(sb.toString());
        }
        int capacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("end > capacity: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(capacity);
            throw new IllegalArgumentException(sb2.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    private static ByteBuffer zza(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(17);
            sb.append("size: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zza(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(93);
            sb.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining2 = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(101);
            sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
            sb2.append(i);
            sb2.append(", remaining: ");
            sb2.append(remaining2);
            throw new IOException(sb2.toString());
        }
        return zza(byteBuffer, i);
    }

    private static byte[] zzb(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            int remaining = byteBuffer.remaining();
            StringBuilder sb = new StringBuilder(90);
            sb.append("Underflow while reading length-prefixed value. Length: ");
            sb.append(i);
            sb.append(", available: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static void zza(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }
}
