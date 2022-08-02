package com.loloof64.android.stockfishlib

class NativeLib {

    companion object {
        // Used to load the 'stockfishlib' library on application startup.
        init {
            System.loadLibrary("stockfishlib")
        }

        external fun readStdOut(): String

        external fun writeStdIn(command: String): Boolean

        external fun init()

        external fun main()
    }
}