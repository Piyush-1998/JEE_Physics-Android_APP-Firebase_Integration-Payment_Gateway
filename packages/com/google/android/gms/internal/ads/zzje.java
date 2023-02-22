package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzje implements zzie {
    private ByteBuffer zzalb;
    private ByteBuffer zzami;
    private boolean zzamj;
    private zzjf zzams;
    private ShortBuffer zzamt;
    private long zzamu;
    private long zzamv;
    private float zzahw = 1.0f;
    private float zzahx = 1.0f;
    private int zzahi = -1;
    private int zzame = -1;

    public zzje() {
        ByteBuffer byteBuffer = zzaiu;
        this.zzami = byteBuffer;
        this.zzamt = byteBuffer.asShortBuffer();
        this.zzalb = zzaiu;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final int zzfi() {
        return 2;
    }

    public final float zza(float f) {
        float zza = zzpq.zza(f, 0.1f, 8.0f);
        this.zzahw = zza;
        return zza;
    }

    public final float zzb(float f) {
        this.zzahx = zzpq.zza(f, 0.1f, 8.0f);
        return f;
    }

    public final long zzgd() {
        return this.zzamu;
    }

    public final long zzge() {
        return this.zzamv;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final boolean zzb(int i, int i2, int i3) throws zzih {
        if (i3 != 2) {
            throw new zzih(i, i2, i3);
        }
        if (this.zzame == i && this.zzahi == i2) {
            return false;
        }
        this.zzame = i;
        this.zzahi = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final boolean isActive() {
        return Math.abs(this.zzahw - 1.0f) >= 0.01f || Math.abs(this.zzahx - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final int zzfh() {
        return this.zzahi;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzn(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzamu += remaining;
            this.zzams.zza(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zzgf = (this.zzams.zzgf() * this.zzahi) << 1;
        if (zzgf > 0) {
            if (this.zzami.capacity() < zzgf) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzgf).order(ByteOrder.nativeOrder());
                this.zzami = order;
                this.zzamt = order.asShortBuffer();
            } else {
                this.zzami.clear();
                this.zzamt.clear();
            }
            this.zzams.zzb(this.zzamt);
            this.zzamv += zzgf;
            this.zzami.limit(zzgf);
            this.zzalb = this.zzami;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void zzfj() {
        this.zzams.zzfj();
        this.zzamj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final ByteBuffer zzfk() {
        ByteBuffer byteBuffer = this.zzalb;
        this.zzalb = zzaiu;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final boolean zzfc() {
        if (this.zzamj) {
            zzjf zzjfVar = this.zzams;
            return zzjfVar == null || zzjfVar.zzgf() == 0;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void flush() {
        zzjf zzjfVar = new zzjf(this.zzame, this.zzahi);
        this.zzams = zzjfVar;
        zzjfVar.setSpeed(this.zzahw);
        this.zzams.zzc(this.zzahx);
        this.zzalb = zzaiu;
        this.zzamu = 0L;
        this.zzamv = 0L;
        this.zzamj = false;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void reset() {
        this.zzams = null;
        ByteBuffer byteBuffer = zzaiu;
        this.zzami = byteBuffer;
        this.zzamt = byteBuffer.asShortBuffer();
        this.zzalb = zzaiu;
        this.zzahi = -1;
        this.zzame = -1;
        this.zzamu = 0L;
        this.zzamv = 0L;
        this.zzamj = false;
    }
}
