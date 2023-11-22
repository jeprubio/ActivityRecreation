package com.telefonica.activityrecreationproblem

import android.app.Application
import com.yariksoffice.lingver.Lingver
import timber.log.Timber
import java.util.Locale

class App: Application() {

    override fun onCreate() {
        Timber.d("Application onCreate")
        super.onCreate()
        Lingver.init(this, Locale("pt", "BR"))
        Timber.plant(Timber.DebugTree())
    }
}