package com.example.affirmations.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(private  val context : Context, private val datasets : List<Affirmation>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder (private  val view:View): RecyclerView.ViewHolder(view) {
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = datasets[position]

        holder.textView.text = context.resources.getText(item.stringId)
        holder.imageView.setImageResource(item.ImageId)
    }

    override fun getItemCount(): Int {
        return datasets.size
    }
}