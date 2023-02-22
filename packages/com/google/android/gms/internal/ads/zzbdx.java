package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbdx extends SSLSocketFactory {
    private SSLSocketFactory zzejm = (SSLSocketFactory) SSLSocketFactory.getDefault();
    private final /* synthetic */ zzbdu zzejn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdx(zzbdu zzbduVar) {
        this.zzejn = zzbduVar;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zzejm.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zzejm.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return zzb(this.zzejm.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        return zzb(this.zzejm.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return zzb(this.zzejm.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return zzb(this.zzejm.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return zzb(this.zzejm.createSocket(inetAddress, i, inetAddress2, i2));
    }

    private final Socket zzb(Socket socket) throws SocketException {
        int i;
        int i2;
        i = this.zzejn.zzejf;
        if (i > 0) {
            i2 = this.zzejn.zzejf;
            socket.setReceiveBufferSize(i2);
        }
        this.zzejn.zza(socket);
        return socket;
    }
}
