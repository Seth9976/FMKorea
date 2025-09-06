package B0;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.util.Log;
import co.median.android.MainActivity;

public abstract class o {
    private static final String a = "B0.o";
    private static AudioFocusRequest b;
    private static AudioFocusRequest c;
    private static AudioManager.OnAudioFocusChangeListener d;
    private static AudioManager.OnAudioFocusChangeListener e;

    static {
    }

    public static void c(MainActivity mainActivity0) {
        AudioManager audioManager0 = (AudioManager)mainActivity0.getSystemService("audio");
        if(audioManager0 == null) {
            Log.w("B0.o", "AudioManager is null. Aborting abandonFocusRequest()");
        }
        if(Build.VERSION.SDK_INT < 26) {
            AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0 = o.d;
            if(audioManager$OnAudioFocusChangeListener0 != null) {
                audioManager0.abandonAudioFocus(audioManager$OnAudioFocusChangeListener0);
                o.d = null;
            }
            AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener1 = o.e;
            if(audioManager$OnAudioFocusChangeListener1 != null) {
                audioManager0.abandonAudioFocus(audioManager$OnAudioFocusChangeListener1);
                o.e = null;
            }
        }
        else {
            AudioFocusRequest audioFocusRequest0 = o.b;
            if(audioFocusRequest0 != null) {
                audioManager0.abandonAudioFocusRequest(audioFocusRequest0);
                o.b = null;
            }
            AudioFocusRequest audioFocusRequest1 = o.c;
            if(audioFocusRequest1 != null) {
                audioManager0.abandonAudioFocusRequest(audioFocusRequest1);
                o.c = null;
            }
        }
    }

    public static void d(MainActivity mainActivity0) {
        int v;
        Object object0 = new Object();
        AudioManager audioManager0 = (AudioManager)mainActivity0.getSystemService("audio");
        if(audioManager0 == null) {
            Log.w("B0.o", "AudioManager is null. Aborting initAudioFocusListener()");
        }
        o.d = (int v) -> if(v == 1) {
            synchronized(object0) {
                Log.d("B0.o", "AudioFocusListener GAINED. Try to request audio focus");
                o.h(mainActivity0);
                o.c(mainActivity0);
            }
        };
        if(Build.VERSION.SDK_INT < 26) {
            v = audioManager0.requestAudioFocus(o.d, 0, 3);
        }
        else {
            AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setUsage(2).build();
            AudioFocusRequest audioFocusRequest0 = k.a(3).setAudioAttributes(audioAttributes0).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(o.d).build();
            o.b = audioFocusRequest0;
            v = audioManager0.requestAudioFocus(audioFocusRequest0);
        }
        synchronized(object0) {
            if(v == 1) {
                Log.d("B0.o", "AudioFocusListener REQUEST GRANTED");
            }
        }
    }

    // 检测为 Lambda 实现
    private static void e(Object object0, MainActivity mainActivity0, int v) [...]

    // 检测为 Lambda 实现
    private static void f(Object object0, MainActivity mainActivity0, AudioManager audioManager0, int v) [...]

    public static void g(MainActivity mainActivity0, AudioManager audioManager0) {
        if(audioManager0.isBluetoothScoAvailableOffCall() && !audioManager0.isBluetoothScoOn()) {
            Log.d("B0.o", "Resetting audio to bluetooth device");
            o.i(mainActivity0, 2);
        }
    }

    public static void h(MainActivity mainActivity0) {
        int v;
        Object object0 = new Object();
        AudioManager audioManager0 = (AudioManager)mainActivity0.getSystemService("audio");
        if(audioManager0 == null) {
            Log.w("B0.o", "AudioManager is null. Aborting requestAudioFocus()");
        }
        o.e = (int v) -> switch(v) {
            case -3: 
            case -2: 
            case -1: {
                synchronized(object0) {
                    Log.d("B0.o", "AudioFocus LOST. Try to reconnect bluetooth device");
                    o.g(mainActivity0, audioManager0);
                }
                return;
            }
            case 1: {
                synchronized(object0) {
                    Log.d("B0.o", "AudioFocus GAINED. Try to connect bluetooth device");
                    o.g(mainActivity0, audioManager0);
                }
            }
        };
        o.c(mainActivity0);
        if(Build.VERSION.SDK_INT < 26) {
            v = audioManager0.requestAudioFocus(o.e, 0, 3);
        }
        else {
            AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setUsage(2).build();
            AudioFocusRequest audioFocusRequest0 = k.a(3).setAudioAttributes(audioAttributes0).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(o.e).build();
            o.c = audioFocusRequest0;
            v = audioManager0.requestAudioFocus(audioFocusRequest0);
        }
        synchronized(object0) {
            if(v == 1) {
                Log.d("B0.o", "AudioFocus REQUEST GRANTED");
                o.g(mainActivity0, audioManager0);
            }
        }
    }

    public static void i(MainActivity mainActivity0, int v) {
        AudioManager audioManager0 = (AudioManager)mainActivity0.getSystemService("audio");
        if(v == 2) {
            audioManager0.setMode(3);
            audioManager0.startBluetoothSco();
            audioManager0.setBluetoothScoOn(true);
            return;
        }
        if(v == 1) {
            audioManager0.setMode(3);
            audioManager0.stopBluetoothSco();
            audioManager0.setBluetoothScoOn(false);
            audioManager0.setSpeakerphoneOn(false);
            return;
        }
        audioManager0.setMode(0);
        audioManager0.stopBluetoothSco();
        audioManager0.setBluetoothScoOn(false);
        audioManager0.setSpeakerphoneOn(true);
    }
}

