package br.ufpe.cin.android.podcast.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.ufpe.cin.android.podcast.Adapters.Holders.FeedItemHolder
import br.ufpe.cin.android.podcast.ItemFeed
import br.ufpe.cin.android.podcast.R

class FeedItemAdapter(private val itemFeeds: List<ItemFeed>, private val context: Context):
    RecyclerView.Adapter<FeedItemHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedItemHolder {
        val itemFeedViewInflater =
            LayoutInflater.from(context).inflate(R.layout.itemlista, parent, false)

        return FeedItemHolder(
            itemFeedViewInflater
        )
    }

    override fun onBindViewHolder(holder: FeedItemHolder, position: Int) {
        val itemFeed = itemFeeds[position]

        holder.bind(itemFeed, context)
    }

    override fun getItemCount() = itemFeeds.size

}