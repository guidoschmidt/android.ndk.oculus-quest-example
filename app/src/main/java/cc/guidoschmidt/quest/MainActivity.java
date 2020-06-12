package cc.guidoschmidt.quest;

public class MainActivity extends android.app.NativeActivity {
    static {
        System.loadLibrary("vrapi");
        System.loadLibrary("vrsamplebase");
    }
}
