package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzir extends Thread {
    private final /* synthetic */ AudioTrack zzalt;
    private final /* synthetic */ zzio zzalu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzio zzioVar, AudioTrack audioTrack) {
        this.zzalu = zzioVar;
        this.zzalt = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zzalt.flush();
            this.zzalt.release();
        } finally {
            conditionVariable = this.zzalu.zzajq;
            conditionVariable.open();
        }
    }
}
