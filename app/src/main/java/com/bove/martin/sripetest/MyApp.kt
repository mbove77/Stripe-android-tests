package com.bove.martin.sripetest

import android.app.Application
import com.stripe.android.PaymentConfiguration

/**
 * Created by Martín Bove on 29/9/2022.
 * E-mail: mbove77@gmail.com
 */
open class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        PaymentConfiguration.init(
            applicationContext,
            "pk_test_51LgYQKCdDlvaazzQQHRb8Fd2zPs520X9W2c9xwbHCJAFHbXGJfoPLYNrmdvlKK8MJhdEGxROZfNIUZwhkVE68hrW00VDb2gJ8c"
        )
    }
}