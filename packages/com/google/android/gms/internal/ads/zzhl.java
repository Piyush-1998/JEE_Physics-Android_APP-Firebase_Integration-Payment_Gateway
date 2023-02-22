package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzhl implements Handler.Callback, zzna, zznc, zzof {
    private final Handler handler;
    private int repeatMode = 0;
    private int state = 1;
    private final zzhx[] zzael;
    private final zzog zzaem;
    private final Handler zzaeo;
    private final zzid zzaer;
    private final zzia zzaes;
    private boolean zzaeu;
    private boolean zzaey;
    private zzhy zzaez;
    private zzhu zzafd;
    private zzhn zzafe;
    private final zzhw[] zzafu;
    private final zzhs zzafv;
    private zzmz zzafw;
    private final zzpl zzafy;
    private final HandlerThread zzafz;
    private final zzhc zzaga;
    private zzhx zzagb;
    private zzpd zzagc;
    private zzhx[] zzagd;
    private boolean zzage;
    private boolean zzagf;
    private int zzagg;
    private int zzagh;
    private long zzagi;
    private int zzagj;
    private zzhm zzagk;
    private long zzagl;
    private zzhk zzagm;
    private zzhk zzagn;
    private zzhk zzago;

    public zzhl(zzhx[] zzhxVarArr, zzog zzogVar, zzhs zzhsVar, boolean z, int i, Handler handler, zzhn zzhnVar, zzhc zzhcVar) {
        this.zzael = zzhxVarArr;
        this.zzaem = zzogVar;
        this.zzafv = zzhsVar;
        this.zzaeu = z;
        this.zzaeo = handler;
        this.zzafe = zzhnVar;
        this.zzaga = zzhcVar;
        this.zzafu = new zzhw[zzhxVarArr.length];
        for (int i2 = 0; i2 < zzhxVarArr.length; i2++) {
            zzhxVarArr[i2].setIndex(i2);
            this.zzafu[i2] = zzhxVarArr[i2].zzdx();
        }
        this.zzafy = new zzpl();
        this.zzagd = new zzhx[0];
        this.zzaer = new zzid();
        this.zzaes = new zzia();
        zzogVar.zza(this);
        this.zzafd = zzhu.zzahv;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzafz = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.zzafz.getLooper(), this);
    }

    public final void zza(zzmz zzmzVar, boolean z) {
        this.handler.obtainMessage(0, 1, 0, zzmzVar).sendToTarget();
    }

    public final void zzf(boolean z) {
        this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zza(zzhy zzhyVar, int i, long j) {
        this.handler.obtainMessage(3, new zzhm(zzhyVar, i, j)).sendToTarget();
    }

    public final void stop() {
        this.handler.sendEmptyMessage(5);
    }

    public final void zza(zzhh... zzhhVarArr) {
        if (this.zzage) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.zzagg++;
        this.handler.obtainMessage(11, zzhhVarArr).sendToTarget();
    }

    public final synchronized void zzb(zzhh... zzhhVarArr) {
        if (this.zzage) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzagg;
        this.zzagg = i + 1;
        this.handler.obtainMessage(11, zzhhVarArr).sendToTarget();
        while (this.zzagh <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void release() {
        if (this.zzage) {
            return;
        }
        this.handler.sendEmptyMessage(6);
        while (!this.zzage) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzafz.quit();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzb(zzhy zzhyVar, Object obj) {
        this.handler.obtainMessage(7, Pair.create(zzhyVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzna
    public final void zza(zzmx zzmxVar) {
        this.handler.obtainMessage(8, zzmxVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zzeq() {
        this.handler.sendEmptyMessage(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0287 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028a A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028e A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x052c A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0533 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0550 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x058b A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x059d A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05b9 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, LOOP:9: B:318:0x05b9->B:322:0x05cb, LOOP_START, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0718 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:7:0x0019, B:9:0x0021, B:12:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:29:0x0057, B:33:0x005f, B:34:0x0061, B:36:0x0065, B:37:0x006c, B:39:0x0076, B:41:0x007a, B:43:0x007e, B:44:0x0091, B:47:0x0097, B:10:0x0024, B:49:0x009b, B:56:0x00b9, B:63:0x00c7, B:66:0x00ca, B:69:0x00d4, B:73:0x00d8, B:74:0x00d9, B:76:0x00dd, B:78:0x00e2, B:81:0x00e8, B:83:0x00ee, B:86:0x00f3, B:88:0x00f8, B:92:0x0101, B:94:0x012b, B:95:0x0132, B:96:0x0139, B:98:0x013e, B:102:0x014b, B:104:0x0155, B:105:0x0157, B:107:0x015b, B:109:0x0161, B:112:0x0167, B:113:0x016e, B:114:0x0172, B:115:0x0179, B:117:0x017d, B:118:0x0182, B:119:0x0185, B:126:0x01c0, B:120:0x0194, B:122:0x019a, B:123:0x01a0, B:125:0x01aa, B:128:0x01cc, B:130:0x01d4, B:133:0x01db, B:135:0x01df, B:137:0x01e7, B:140:0x01ee, B:142:0x0201, B:143:0x020f, B:145:0x0213, B:147:0x0223, B:149:0x0227, B:151:0x0235, B:152:0x023a, B:160:0x0283, B:162:0x0287, B:165:0x028e, B:167:0x0298, B:169:0x02a2, B:170:0x02a7, B:171:0x02cf, B:173:0x02d3, B:177:0x02e0, B:178:0x02e3, B:179:0x02f0, B:183:0x02fe, B:185:0x0304, B:186:0x0317, B:188:0x031b, B:190:0x032b, B:192:0x033d, B:196:0x034b, B:198:0x0350, B:199:0x0364, B:200:0x036b, B:163:0x028a, B:153:0x0252, B:155:0x025a, B:157:0x0262, B:158:0x0267, B:202:0x036f, B:203:0x037a, B:210:0x0385, B:211:0x0386, B:213:0x038a, B:215:0x0392, B:217:0x039f, B:216:0x0399, B:219:0x03ab, B:221:0x03b3, B:222:0x03bc, B:224:0x03c2, B:225:0x03e0, B:229:0x03e9, B:235:0x040c, B:239:0x041a, B:247:0x0430, B:251:0x043e, B:254:0x0449, B:258:0x0458, B:259:0x0461, B:260:0x0462, B:262:0x046a, B:372:0x06c9, B:374:0x06cf, B:375:0x06d7, B:377:0x06f2, B:379:0x06fd, B:383:0x0706, B:385:0x070c, B:391:0x0718, B:396:0x0722, B:398:0x0729, B:399:0x072c, B:401:0x0730, B:403:0x073e, B:404:0x0751, B:408:0x076a, B:410:0x0772, B:412:0x0778, B:445:0x0802, B:447:0x0806, B:449:0x080b, B:450:0x0813, B:452:0x0817, B:456:0x0820, B:461:0x0836, B:454:0x081c, B:457:0x0826, B:459:0x082b, B:460:0x0831, B:413:0x0782, B:415:0x0787, B:418:0x078e, B:420:0x0796, B:424:0x07a9, B:434:0x07db, B:436:0x07e3, B:427:0x07b1, B:428:0x07bf, B:421:0x079b, B:432:0x07d5, B:437:0x07e7, B:439:0x07ec, B:444:0x07f8, B:442:0x07f2, B:263:0x0472, B:265:0x0476, B:278:0x04b9, B:280:0x04c1, B:305:0x0599, B:307:0x059d, B:310:0x05a6, B:312:0x05aa, B:314:0x05ae, B:316:0x05b5, B:318:0x05b9, B:320:0x05bf, B:322:0x05cb, B:323:0x05f6, B:326:0x05fd, B:328:0x0602, B:330:0x060e, B:332:0x0614, B:334:0x061a, B:335:0x061d, B:337:0x0621, B:339:0x0626, B:342:0x0638, B:345:0x0640, B:346:0x0643, B:348:0x0649, B:350:0x0651, B:355:0x0672, B:357:0x0677, B:360:0x0685, B:362:0x068b, B:364:0x069b, B:366:0x06a1, B:368:0x06aa, B:369:0x06b3, B:370:0x06c3, B:371:0x06c6, B:315:0x05b2, B:282:0x04c9, B:284:0x04cd, B:292:0x0528, B:294:0x052c, B:297:0x0549, B:301:0x0557, B:303:0x058b, B:304:0x058f, B:300:0x0550, B:296:0x0533, B:286:0x04d3, B:289:0x04e4, B:291:0x0517, B:266:0x047b, B:268:0x0485, B:270:0x048d, B:273:0x049c, B:275:0x04a0, B:277:0x04ad, B:463:0x083a, B:467:0x0842, B:469:0x0848, B:470:0x084f, B:472:0x0854, B:473:0x085d, B:475:0x0861, B:477:0x0867, B:481:0x0873, B:483:0x0882, B:484:0x088e), top: B:503:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x07d1  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 2326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhl.handleMessage(android.os.Message):boolean");
    }

    private final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            this.zzaeo.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzh(boolean z) {
        if (this.zzaey != z) {
            this.zzaey = z;
            this.zzaeo.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzer() throws zzhd {
        this.zzagf = false;
        this.zzafy.start();
        for (zzhx zzhxVar : this.zzagd) {
            zzhxVar.start();
        }
    }

    private final void zzes() throws zzhd {
        this.zzafy.stop();
        for (zzhx zzhxVar : this.zzagd) {
            zza(zzhxVar);
        }
    }

    private final void zzet() throws zzhd {
        zzhk zzhkVar = this.zzago;
        if (zzhkVar == null) {
            return;
        }
        long zzho = zzhkVar.zzafi.zzho();
        if (zzho != -9223372036854775807L) {
            zzdq(zzho);
        } else {
            zzhx zzhxVar = this.zzagb;
            if (zzhxVar != null && !zzhxVar.zzfc()) {
                long zzfx = this.zzagc.zzfx();
                this.zzagl = zzfx;
                this.zzafy.zzel(zzfx);
            } else {
                this.zzagl = this.zzafy.zzfx();
            }
            zzho = this.zzagl - this.zzago.zzen();
        }
        this.zzafe.zzagr = zzho;
        this.zzagi = SystemClock.elapsedRealtime() * 1000;
        long zzhp = this.zzagd.length == 0 ? Long.MIN_VALUE : this.zzago.zzafi.zzhp();
        zzhn zzhnVar = this.zzafe;
        if (zzhp == Long.MIN_VALUE) {
            zzhp = this.zzaez.zza(this.zzago.zzafn, this.zzaes, false).zzaid;
        }
        zzhnVar.zzags = zzhp;
    }

    private final void zza(long j, long j2) {
        this.handler.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.handler.sendEmptyMessage(2);
        } else {
            this.handler.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final long zza(int i, long j) throws zzhd {
        zzhk zzhkVar;
        zzes();
        this.zzagf = false;
        setState(2);
        zzhk zzhkVar2 = this.zzago;
        if (zzhkVar2 == null) {
            zzhk zzhkVar3 = this.zzagm;
            if (zzhkVar3 != null) {
                zzhkVar3.release();
            }
            zzhkVar = null;
        } else {
            zzhkVar = null;
            while (zzhkVar2 != null) {
                if (zzhkVar2.zzafn == i && zzhkVar2.zzafq) {
                    zzhkVar = zzhkVar2;
                } else {
                    zzhkVar2.release();
                }
                zzhkVar2 = zzhkVar2.zzafs;
            }
        }
        zzhk zzhkVar4 = this.zzago;
        if (zzhkVar4 != zzhkVar || zzhkVar4 != this.zzagn) {
            for (zzhx zzhxVar : this.zzagd) {
                zzhxVar.disable();
            }
            this.zzagd = new zzhx[0];
            this.zzagc = null;
            this.zzagb = null;
            this.zzago = null;
        }
        if (zzhkVar != null) {
            zzhkVar.zzafs = null;
            this.zzagm = zzhkVar;
            this.zzagn = zzhkVar;
            zzb(zzhkVar);
            if (this.zzago.zzafr) {
                j = this.zzago.zzafi.zzeg(j);
            }
            zzdq(j);
            zzew();
        } else {
            this.zzagm = null;
            this.zzagn = null;
            this.zzago = null;
            zzdq(j);
        }
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private final void zzdq(long j) throws zzhd {
        zzhk zzhkVar = this.zzago;
        long zzen = j + (zzhkVar == null ? 60000000L : zzhkVar.zzen());
        this.zzagl = zzen;
        this.zzafy.zzel(zzen);
        for (zzhx zzhxVar : this.zzagd) {
            zzhxVar.zzdo(this.zzagl);
        }
    }

    private final void zzeu() {
        zzi(true);
        this.zzafv.onStopped();
        setState(1);
    }

    private final void zzi(boolean z) {
        zzhx[] zzhxVarArr;
        this.handler.removeMessages(2);
        this.zzagf = false;
        this.zzafy.stop();
        this.zzagc = null;
        this.zzagb = null;
        this.zzagl = 60000000L;
        for (zzhx zzhxVar : this.zzagd) {
            try {
                zza(zzhxVar);
                zzhxVar.disable();
            } catch (zzhd | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzagd = new zzhx[0];
        zzhk zzhkVar = this.zzago;
        if (zzhkVar == null) {
            zzhkVar = this.zzagm;
        }
        zza(zzhkVar);
        this.zzagm = null;
        this.zzagn = null;
        this.zzago = null;
        zzh(false);
        if (z) {
            zzmz zzmzVar = this.zzafw;
            if (zzmzVar != null) {
                zzmzVar.zzhy();
                this.zzafw = null;
            }
            this.zzaez = null;
        }
    }

    private static void zza(zzhx zzhxVar) throws zzhd {
        if (zzhxVar.getState() == 2) {
            zzhxVar.stop();
        }
    }

    private final boolean zzdr(long j) {
        if (j == -9223372036854775807L || this.zzafe.zzagr < j) {
            return true;
        }
        return this.zzago.zzafs != null && this.zzago.zzafs.zzafq;
    }

    private final void zzev() throws IOException {
        zzhk zzhkVar = this.zzagm;
        if (zzhkVar == null || zzhkVar.zzafq) {
            return;
        }
        zzhk zzhkVar2 = this.zzagn;
        if (zzhkVar2 == null || zzhkVar2.zzafs == this.zzagm) {
            for (zzhx zzhxVar : this.zzagd) {
                if (!zzhxVar.zzea()) {
                    return;
                }
            }
            this.zzagm.zzafi.zzhl();
        }
    }

    private final void zza(Object obj, int i) {
        this.zzafe = new zzhn(0, 0L);
        zzb(obj, i);
        this.zzafe = new zzhn(0, -9223372036854775807L);
        setState(4);
        zzi(false);
    }

    private final void zzb(Object obj, int i) {
        this.zzaeo.obtainMessage(6, new zzhp(this.zzaez, obj, this.zzafe, i)).sendToTarget();
    }

    private final int zza(int i, zzhy zzhyVar, zzhy zzhyVar2) {
        int zzfe = zzhyVar.zzfe();
        int i2 = -1;
        for (int i3 = 0; i3 < zzfe && i2 == -1; i3++) {
            i = zzhyVar.zza(i, this.zzaes, this.zzaer, this.repeatMode);
            i2 = zzhyVar2.zzc(zzhyVar.zza(i, this.zzaes, true).zzafj);
        }
        return i2;
    }

    private final boolean zzu(int i) {
        this.zzaez.zza(i, this.zzaes, false);
        return !this.zzaez.zza(0, this.zzaer, false).zzaip && this.zzaez.zza(i, this.zzaes, this.zzaer, this.repeatMode) == -1;
    }

    private final Pair<Integer, Long> zza(zzhm zzhmVar) {
        zzhy zzhyVar = zzhmVar.zzaez;
        if (zzhyVar.isEmpty()) {
            zzhyVar = this.zzaez;
        }
        try {
            Pair<Integer, Long> zzb = zzb(zzhyVar, zzhmVar.zzagp, zzhmVar.zzagq);
            zzhy zzhyVar2 = this.zzaez;
            if (zzhyVar2 == zzhyVar) {
                return zzb;
            }
            int zzc = zzhyVar2.zzc(zzhyVar.zza(((Integer) zzb.first).intValue(), this.zzaes, true).zzafj);
            if (zzc != -1) {
                return Pair.create(Integer.valueOf(zzc), (Long) zzb.second);
            }
            int zza = zza(((Integer) zzb.first).intValue(), zzhyVar, this.zzaez);
            if (zza != -1) {
                this.zzaez.zza(zza, this.zzaes, false);
                return zzb(0, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzht(this.zzaez, zzhmVar.zzagp, zzhmVar.zzagq);
        }
    }

    private final Pair<Integer, Long> zzb(int i, long j) {
        return zzb(this.zzaez, i, -9223372036854775807L);
    }

    private final Pair<Integer, Long> zzb(zzhy zzhyVar, int i, long j) {
        return zza(zzhyVar, i, j, 0L);
    }

    private final Pair<Integer, Long> zza(zzhy zzhyVar, int i, long j, long j2) {
        zzoz.zzc(i, 0, zzhyVar.zzfd());
        zzhyVar.zza(i, this.zzaer, false, j2);
        if (j == -9223372036854775807L) {
            j = this.zzaer.zzais;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.zzaer.zzait + j;
        long j4 = zzhyVar.zza(0, this.zzaes, false).zzaid;
        if (j4 != -9223372036854775807L) {
            int i2 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void zzew() {
        long zzhn = !this.zzagm.zzafq ? 0L : this.zzagm.zzafi.zzhn();
        if (zzhn == Long.MIN_VALUE) {
            zzh(false);
            return;
        }
        long zzen = this.zzagl - this.zzagm.zzen();
        boolean zzdt = this.zzafv.zzdt(zzhn - zzen);
        zzh(zzdt);
        if (zzdt) {
            this.zzagm.zzafi.zzef(zzen);
        }
    }

    private static void zza(zzhk zzhkVar) {
        while (zzhkVar != null) {
            zzhkVar.release();
            zzhkVar = zzhkVar.zzafs;
        }
    }

    private final void zzb(zzhk zzhkVar) throws zzhd {
        if (this.zzago == zzhkVar) {
            return;
        }
        boolean[] zArr = new boolean[this.zzael.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            zzhx[] zzhxVarArr = this.zzael;
            if (i < zzhxVarArr.length) {
                zzhx zzhxVar = zzhxVarArr[i];
                zArr[i] = zzhxVar.getState() != 0;
                zzob zzbg = zzhkVar.zzaft.zzbht.zzbg(i);
                if (zzbg != null) {
                    i2++;
                }
                if (zArr[i] && (zzbg == null || (zzhxVar.zzec() && zzhxVar.zzdz() == this.zzago.zzafk[i]))) {
                    if (zzhxVar == this.zzagb) {
                        this.zzafy.zza(this.zzagc);
                        this.zzagc = null;
                        this.zzagb = null;
                    }
                    zza(zzhxVar);
                    zzhxVar.disable();
                }
                i++;
            } else {
                this.zzago = zzhkVar;
                this.zzaeo.obtainMessage(3, zzhkVar.zzaft).sendToTarget();
                zza(zArr, i2);
                return;
            }
        }
    }

    private final void zza(boolean[] zArr, int i) throws zzhd {
        this.zzagd = new zzhx[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzhx[] zzhxVarArr = this.zzael;
            if (i2 >= zzhxVarArr.length) {
                return;
            }
            zzhx zzhxVar = zzhxVarArr[i2];
            zzob zzbg = this.zzago.zzaft.zzbht.zzbg(i2);
            if (zzbg != null) {
                int i4 = i3 + 1;
                this.zzagd[i3] = zzhxVar;
                if (zzhxVar.getState() == 0) {
                    zzhz zzhzVar = this.zzago.zzaft.zzbhv[i2];
                    boolean z = this.zzaeu && this.state == 3;
                    boolean z2 = !zArr[i2] && z;
                    int length = zzbg.length();
                    zzho[] zzhoVarArr = new zzho[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        zzhoVarArr[i5] = zzbg.zzbe(i5);
                    }
                    zzhxVar.zza(zzhzVar, zzhoVarArr, this.zzago.zzafk[i2], this.zzagl, z2, this.zzago.zzen());
                    zzpd zzdy = zzhxVar.zzdy();
                    if (zzdy != null) {
                        if (this.zzagc != null) {
                            throw zzhd.zza(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.zzagc = zzdy;
                        this.zzagb = zzhxVar;
                        zzdy.zzb(this.zzafd);
                    }
                    if (z) {
                        zzhxVar.start();
                    }
                }
                i3 = i4;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ void zza(zzmx zzmxVar) {
        this.handler.obtainMessage(9, zzmxVar).sendToTarget();
    }
}
