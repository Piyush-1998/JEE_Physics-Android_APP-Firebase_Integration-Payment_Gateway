package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeeu;
import com.google.android.gms.internal.ads.zzeev;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzeev<MessageType extends zzeev<MessageType, BuilderType>, BuilderType extends zzeeu<MessageType, BuilderType>> implements zzehz {
    protected int zziaq = 0;

    @Override // com.google.android.gms.internal.ads.zzehz
    public final zzeff zzbda() {
        try {
            zzefn zzfw = zzeff.zzfw(zzbfl());
            zzb(zzfw.zzbds());
            return zzfw.zzbdr();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehz
    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzbfl()];
            zzefz zzw = zzefz.zzw(bArr);
            zzb(zzw);
            zzw.zzbeu();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzbdb() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzfq(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzegr.checkNotNull(iterable);
        if (iterable instanceof zzehk) {
            List<?> zzbgn = ((zzehk) iterable).zzbgn();
            zzehk zzehkVar = (zzehk) list;
            int size = list.size();
            for (Object obj : zzbgn) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzehkVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzehkVar.size() - 1; size2 >= size; size2--) {
                        zzehkVar.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof zzeff) {
                    zzehkVar.zzaj((zzeff) obj);
                } else {
                    zzehkVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzeil) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        }
    }
}
