package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzejj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzam(zzeff zzeffVar) {
        zzejm zzejmVar = new zzejm(zzeffVar);
        StringBuilder sb = new StringBuilder(zzejmVar.size());
        for (int i = 0; i < zzejmVar.size(); i++) {
            byte zzfu = zzejmVar.zzfu(i);
            if (zzfu == 34) {
                sb.append("\\\"");
            } else if (zzfu == 39) {
                sb.append("\\'");
            } else if (zzfu != 92) {
                switch (zzfu) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zzfu >= 32 && zzfu <= 126) {
                            sb.append((char) zzfu);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzfu >>> 6) & 3) + 48));
                            sb.append((char) (((zzfu >>> 3) & 7) + 48));
                            sb.append((char) ((zzfu & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
