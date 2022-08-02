package com.loloof64.android.stockfishlib;

class NativeLib {
        // Used to load the 'stockfishlib' library on application startup.
        static {
            System.loadLibrary("stockfishlib");
        }

        public static native String readStdOut();

        public static native boolean writeStdIn(String command);

        public static native void init();

        public static native void main();
}