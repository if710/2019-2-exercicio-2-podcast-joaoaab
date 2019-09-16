package br.ufpe.cin.android.podcast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import java.net.URL
import br.ufpe.cin.android.podcast.Adapters.FeedItemAdapter
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
    val xmlDownloadLink = "http://joeroganexp.joerogan.libsynpro.com/rss"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var feedItems: List<ItemFeed>

        doAsync {
            val feed = URL(xmlDownloadLink).readText()
            feedItems = Parser.parse(feed)

            uiThread {
                listRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                listRecyclerView.adapter = FeedItemAdapter(
                    feedItems,
                    this@MainActivity
                )
            }
        }
    }

}

