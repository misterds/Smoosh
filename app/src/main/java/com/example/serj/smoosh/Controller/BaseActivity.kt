package com.example.serj.smoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


// this  class need to  be  open  that other  classes  can inhertiten this  class
open class BaseActivity : AppCompatActivity() {


//    API for sending log output.
//
//    Generally, you should use the Log.v(), Log.d(), Log.i(), Log.w(), and Log.e() methods to write logs. You can then view the logs in logcat.
//
//    The order in terms of verbosity, from least to most is ERROR, WARN, INFO, DEBUG, VERBOSE. Verbose should never be compiled into an application except during development. Debug logs are compiled in but stripped at runtime. Error, warning and info logs are always kept.
//
//    Tip: A good convention is to declare a TAG constant in your class:
//
//            private static final String TAG = "MyActivity";

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName} OnStart")
        super.onStart()
    }


    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} OnRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} OnDestroy")
        super.onDestroy()
    }
}
