package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzit extends zziq {
    private final AudioTimestamp zzalv;
    private long zzalw;
    private long zzalx;
    private long zzaly;

    public zzit() {
        super(null);
        this.zzalv = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final void zza(AudioTrack audioTrack, boolean z) {
        super.zza(audioTrack, z);
        this.zzalw = 0L;
        this.zzalx = 0L;
        this.zzaly = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final boolean zzfy() {
        boolean timestamp = this.zzaju.getTimestamp(this.zzalv);
        if (timestamp) {
            long j = this.zzalv.framePosition;
            if (this.zzalx > j) {
                this.zzalw++;
            }
            this.zzalx = j;
            this.zzaly = j + (this.zzalw << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final long zzfz() {
        return this.zzalv.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    public final long zzga() {
        return this.zzaly;
    }
}
