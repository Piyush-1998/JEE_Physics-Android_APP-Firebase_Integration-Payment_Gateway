package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzau implements zzx {
    private static final boolean DEBUG = zzaq.DEBUG;
    @Deprecated
    private final zzbe zzcf;
    private final zzar zzcg;
    private final zzat zzch;

    public zzau(zzar zzarVar) {
        this(zzarVar, new zzat(4096));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzau(zzar zzarVar, zzat zzatVar) {
        this.zzcg = zzarVar;
        this.zzcf = zzarVar;
        this.zzch = zzatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    @Override // com.google.android.gms.internal.ads.zzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzy zzc(com.google.android.gms.internal.ads.zzaa<?> r22) throws com.google.android.gms.internal.ads.zzao {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzau.zzc(com.google.android.gms.internal.ads.zzaa):com.google.android.gms.internal.ads.zzy");
    }

    private static void zza(String str, zzaa<?> zzaaVar, zzao zzaoVar) throws zzao {
        zzan zzj = zzaaVar.zzj();
        int zzi = zzaaVar.zzi();
        try {
            zzj.zza(zzaoVar);
            zzaaVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzi)));
        } catch (zzao e) {
            zzaaVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzi)));
            throw e;
        }
    }

    private final byte[] zza(InputStream inputStream, int i) throws IOException, zzam {
        zzbi zzbiVar = new zzbi(this.zzch, i);
        try {
            if (inputStream == null) {
                throw new zzam();
            }
            byte[] zzf = this.zzch.zzf(1024);
            while (true) {
                int read = inputStream.read(zzf);
                if (read == -1) {
                    break;
                }
                zzbiVar.write(zzf, 0, read);
            }
            byte[] byteArray = zzbiVar.toByteArray();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                    zzaq.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzch.zza(zzf);
            zzbiVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzaq.v("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.zzch.zza(null);
            zzbiVar.close();
            throw th;
        }
    }
}
