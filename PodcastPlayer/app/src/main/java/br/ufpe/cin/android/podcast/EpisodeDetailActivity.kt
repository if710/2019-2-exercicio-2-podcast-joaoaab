package br.ufpe.cin.android.podcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_episode_detail.*

class EpisodeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_episode_detail)

        episode_title.text = intent.getStringExtra("episode_title")

        episode_pubdate.text = intent.getStringExtra("episdoe_pub_date")
    }
}
