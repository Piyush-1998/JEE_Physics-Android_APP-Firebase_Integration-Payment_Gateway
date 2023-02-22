package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zziq {
    private int zzahj;
    protected AudioTrack zzaju;
    private boolean zzalm;
    private long zzaln;
    private long zzalo;
    private long zzalp;
    private long zzalq;
    private long zzalr;
    private long zzals;

    private zziq() {
    }

    public boolean zzfy() {
        return false;
    }

    public void zza(AudioTrack audioTrack, boolean z) {
        this.zzaju = audioTrack;
        this.zzalm = z;
        this.zzalq = -9223372036854775807L;
        this.zzaln = 0L;
        this.zzalo = 0L;
        this.zzalp = 0L;
        if (audioTrack != null) {
            this.zzahj = audioTrack.getSampleRate();
        }
    }

    public final void zzdy(long j) {
        this.zzalr = zzfw();
        this.zzalq = SystemClock.elapsedRealtime() * 1000;
        this.zzals = j;
        this.zzaju.stop();
    }

    public final void pause() {
        if (this.zzalq != -9223372036854775807L) {
            return;
        }
        this.zzaju.pause();
    }

    public final long zzfw() {
        if (this.zzalq != -9223372036854775807L) {
            return Math.min(this.zzals, this.zzalr + ((((SystemClock.elapsedRealtime() * 1000) - this.zzalq) * this.zzahj) / 1000000));
        }
        int playState = this.zzaju.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.zzaju.getPlaybackHeadPosition();
        if (this.zzalm) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzalp = this.zzaln;
            }
            playbackHeadPosition += this.zzalp;
        }
        if (this.zzaln > playbackHeadPosition) {
            this.zzalo++;
        }
        this.zzaln = playbackHeadPosition;
        return playbackHeadPosition + (this.zzalo << 32);
    }

    public final long zzfx() {
        return (zzfw() * 1000000) / this.zzahj;
    }

    public long zzfz() {
        throw new UnsupportedOperationException();
    }

    public long zzga() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zziq(zzir zzirVar) {
        this();
    }
}
