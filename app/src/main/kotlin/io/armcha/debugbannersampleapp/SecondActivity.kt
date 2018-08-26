package io.armcha.debugbannersampleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.armcha.debugbanner.Banner
import io.armcha.debugbanner.BannerGravity
import io.armcha.debugbanner.BannerView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), BannerView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        thirdActivityButton.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }

    override fun createBanner(): Banner {
        return Banner(
                bannerText = "BETA",
                bannerColorRes = R.color.yellow,
                textColorRes = android.R.color.black,
                bannerGravity = BannerGravity.END)
    }
}