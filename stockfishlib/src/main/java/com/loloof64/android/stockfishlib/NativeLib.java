package com.loloof64.android.stockfishlib;

class NativeLib {
        // Used to load the 'stockfishlib' library on application startup.
        static {
            System.loadLibrary("stockfishlib");
        }

        public native String readStdOut();

        public native boolean writeStdIn(String command);

        public native void init();

        public native void main();
}