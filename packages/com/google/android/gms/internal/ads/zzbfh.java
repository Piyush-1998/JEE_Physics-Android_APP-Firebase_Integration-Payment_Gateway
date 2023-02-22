package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbfh extends zzbev implements zzpa<zzom> {
    private String url;
    private ByteBuffer zzami;
    private final zzbdf zzeiw;
    private boolean zzelf;
    private final zzbfe zzell;
    private final zzben zzelm;
    private boolean zzeln;
    private final Object zzelo;
    private boolean zzelp;

    public zzbfh(zzbde zzbdeVar, zzbdf zzbdfVar) {
        super(zzbdeVar);
        this.zzeiw = zzbdfVar;
        this.zzell = new zzbfe();
        this.zzelm = new zzben();
        this.zzelo = new Object();
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final /* bridge */ /* synthetic */ void zzc(zzom zzomVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final /* bridge */ /* synthetic */ void zze(zzom zzomVar) {
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzaaw() {
        return this.zzelp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbev
    public final String zzfo(String str) {
        String valueOf = String.valueOf(super.zzfo(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzzg() {
        int zzaau = (int) this.zzell.zzaau();
        int zzq = (int) this.zzelm.zzq(this.zzami);
        int position = this.zzami.position();
        int round = Math.round(zzq * (position / zzaau));
        boolean z = round > 0;
        int zzaar = zzbeb.zzaar();
        int zzaas = zzbeb.zzaas();
        String str = this.url;
        zza(str, zzfo(str), position, zzaau, round, zzq, z, zzaar, zzaas);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:? -> B:53:0x013a). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean zzfn(String str) {
        String str2;
        this.url = str;
        String zzfo = zzfo(str);
        String str3 = "error";
        int i = 0;
        try {
            zzom zzopVar = new zzop(this.zzecp, null, this, this.zzeiw.zzehx, this.zzeiw.zzehz, true, null);
            if (this.zzeiw.zzeid) {
                try {
                    zzopVar = new zzbdw(this.mContext, zzopVar, null, null);
                } catch (Exception e) {
                    e = e;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                    sb.append(canonicalName);
                    sb.append(":");
                    sb.append(message);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb2).length());
                    sb3.append("Failed to preload url ");
                    sb3.append(str);
                    sb3.append(" Exception: ");
                    sb3.append(sb2);
                    zzaxy.zzfe(sb3.toString());
                    zza(str, zzfo, str3, sb2);
                    return false;
                }
            }
            zzopVar.zza(new zzon(Uri.parse(str)));
            zzbde zzbdeVar = this.zzekx.get();
            if (zzbdeVar != null) {
                zzbdeVar.zza(zzfo, this);
            }
            Clock zzkw = com.google.android.gms.ads.internal.zzp.zzkw();
            long currentTimeMillis = zzkw.currentTimeMillis();
            long longValue = ((Long) zzwe.zzpu().zzd(zzaat.zzcma)).longValue();
            long longValue2 = ((Long) zzwe.zzpu().zzd(zzaat.zzclz)).longValue();
            this.zzami = ByteBuffer.allocate(this.zzeiw.zzehw);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            while (true) {
                int read = zzopVar.read(bArr, i, Math.min(this.zzami.remaining(), i2));
                if (read == -1) {
                    this.zzelp = true;
                    zzc(str, zzfo, (int) this.zzelm.zzq(this.zzami));
                    return true;
                }
                synchronized (this.zzelo) {
                    try {
                        if (this.zzelf) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                this.zzami.put(bArr, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzami.remaining() <= 0) {
                                zzzg();
                                return true;
                            } else if (this.zzelf) {
                                int limit = this.zzami.limit();
                                StringBuilder sb4 = new StringBuilder(35);
                                sb4.append("Precache abort at ");
                                sb4.append(limit);
                                sb4.append(" bytes");
                                throw new IOException(sb4.toString());
                            } else {
                                long currentTimeMillis2 = zzkw.currentTimeMillis();
                                if (currentTimeMillis2 - j >= longValue) {
                                    zzzg();
                                    j = currentTimeMillis2;
                                }
                                if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                    StringBuilder sb5 = new StringBuilder(49);
                                    sb5.append("Timeout exceeded. Limit: ");
                                    sb5.append(longValue2);
                                    sb5.append(" sec");
                                    throw new IOException(sb5.toString());
                                }
                                str3 = str2;
                                i2 = 8192;
                                i = 0;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = str2;
                            String canonicalName2 = e.getClass().getCanonicalName();
                            String message2 = e.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                            sb6.append(canonicalName2);
                            sb6.append(":");
                            sb6.append(message2);
                            String sb22 = sb6.toString();
                            StringBuilder sb32 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(sb22).length());
                            sb32.append("Failed to preload url ");
                            sb32.append(str);
                            sb32.append(" Exception: ");
                            sb32.append(sb22);
                            zzaxy.zzfe(sb32.toString());
                            zza(str, zzfo, str3, sb22);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void abort() {
        this.zzelf = true;
    }

    public final ByteBuffer getByteBuffer() {
        synchronized (this.zzelo) {
            if (this.zzami != null && !this.zzeln) {
                this.zzami.flip();
                this.zzeln = true;
            }
            this.zzelf = true;
        }
        return this.zzami;
    }

    @Override // com.google.android.gms.internal.ads.zzpa
    public final /* synthetic */ void zza(zzom zzomVar, zzon zzonVar) {
        zzom zzomVar2 = zzomVar;
        if (zzomVar2 instanceof zzop) {
            this.zzell.zza((zzop) zzomVar2);
        }
    }
}
