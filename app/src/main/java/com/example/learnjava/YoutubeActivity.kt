package com.example.learnjava

import android.os.Bundle
import android.widget.Toast
import com.google.android.youtube.player.*

class YoutubeActivity : YouTubeBaseActivity() {
    private val vdoIds = arrayOf("ntLJmHOJ0ME","zIdg7hkqNE0","X0zdAG7gfgs","HRfmLqqvzUs","tem1bKt2Osc","YPK6NYMJt_A",
                                 "hdOtQSuPBRY","oAl0umTfW4U","qMePCtjeqB4","t6e5AyYWLFw","pFaB68naMiU","QLbG77JngYc",
                                 "25zw-ljLLw0","Fxj4n8En8lw","XSuybcFfLx4","DSZI90Db24I","vqV22AszAdw","VYhmL038G1I",
                                 "rzA7UJ-hQn4","k7TwStbkK70")

    val YT_API_KEY = "AIzaSyARfupf6NK_Xscu2CtVKUz0f9E5mHmLViM"
    private lateinit var youtublePlayer: YouTubePlayerView
    lateinit var youtubePlayerInit : YouTubePlayer.OnInitializedListener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val bundle : Bundle?= intent.extras
        val vdo = bundle!!.getInt("position")
        val VIDEO_ID = vdoIds[vdo]

        youtublePlayer = findViewById(R.id.youTubePlayerView)
        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext,"Failed Loading Video",Toast.LENGTH_LONG).show()
            }

        }
        youtublePlayer.initialize(YT_API_KEY,youtubePlayerInit)




    }
}