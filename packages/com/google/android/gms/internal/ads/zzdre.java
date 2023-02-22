package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdre {
    private final Context zzvr;
    private final zzdpy zzvw;

    public zzdre(Context context, zzdpy zzdpyVar) {
        this.zzvr = context;
        this.zzvw = zzdpyVar;
    }

    private final void zzj(byte[] bArr) {
        if (this.zzvw == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(zzdsx.OS_ARCH.value());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";");
        sb.append("CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        this.zzvw.zzg(4007, sb.toString());
    }

    private final String zzavq() {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String value = zzdsx.OS_ARCH.value();
        if (TextUtils.isEmpty(value) || !hashSet.contains(value)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e) {
                zzdpy zzdpyVar = this.zzvw;
                if (zzdpyVar != null) {
                    zzdpyVar.zza(2024, 0L, e);
                }
            } catch (NoSuchFieldException e2) {
                zzdpy zzdpyVar2 = this.zzvw;
                if (zzdpyVar2 != null) {
                    zzdpyVar2.zza(2024, 0L, e2);
                }
            }
            if (Build.CPU_ABI != null) {
                return Build.CPU_ABI;
            }
            return Build.CPU_ABI2;
        }
        return value;
    }

    private final zzgo zzavr() {
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(this.zzvr.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            return zzgo.UNSUPPORTED;
        }
        File[] listFiles = file.listFiles(new zzduf(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            return zzgo.UNSUPPORTED;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            bArr = new byte[20];
        } catch (IOException unused) {
        }
        if (fileInputStream.read(bArr) == 20) {
            byte[] bArr2 = {0, 0};
            if (bArr[5] == 2) {
                zzj(bArr);
                zzgo zzgoVar = zzgo.UNSUPPORTED;
                fileInputStream.close();
                return zzgoVar;
            }
            bArr2[0] = bArr[19];
            bArr2[1] = bArr[18];
            short s = ByteBuffer.wrap(bArr2).getShort();
            if (s == 3) {
                zzgo zzgoVar2 = zzgo.X86;
                fileInputStream.close();
                return zzgoVar2;
            } else if (s == 40) {
                zzgo zzgoVar3 = zzgo.ARM7;
                fileInputStream.close();
                return zzgoVar3;
            } else if (s == 62) {
                zzgo zzgoVar4 = zzgo.X86_64;
                fileInputStream.close();
                return zzgoVar4;
            } else if (s == 183) {
                zzgo zzgoVar5 = zzgo.ARM64;
                fileInputStream.close();
                return zzgoVar5;
            } else {
                zzgo zzgoVar6 = zzgo.UNSUPPORTED;
                fileInputStream.close();
                return zzgoVar6;
            }
        }
        fileInputStream.close();
        return zzgo.UNSUPPORTED;
    }

    public final zzgo zzavs() {
        zzgo zzavr = zzavr();
        if (zzavr == zzgo.UNSUPPORTED) {
            String zzavq = zzavq();
            if (!TextUtils.isEmpty(zzavq)) {
                if (zzavq.equalsIgnoreCase("i686") || zzavq.equalsIgnoreCase("x86")) {
                    return zzgo.X86;
                }
                if (zzavq.equalsIgnoreCase("x86_64")) {
                    return zzgo.X86_64;
                }
                if (zzavq.equalsIgnoreCase("arm64-v8a")) {
                    return zzgo.ARM64;
                }
                if (zzavq.equalsIgnoreCase("armeabi-v7a") || zzavq.equalsIgnoreCase("armv71")) {
                    return zzgo.ARM7;
                }
            }
            zzj(null);
            return zzgo.UNSUPPORTED;
        }
        return zzavr;
    }
}
