package com.example.countries.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.countries.databinding.ItemCountryBinding
import com.example.countries.model.Country
import com.example.countries.util.downloadFromUrl
import com.example.countries.util.placeholderProgressBar
import com.example.countries.view.FeedFragmentDirections

class CountryAdapter(val countryList : ArrayList<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(val binding: ItemCountryBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CountryViewHolder(binding)
    }



    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

        val country = countryList[position]

        country.countryName?.let {
            holder.binding.name.text = country.countryName
        }

        country.countryRegion?.let {
            holder.binding.region.text = country.countryRegion
        }

        country.imageUrl?.let {
            holder.binding.imageView.downloadFromUrl(country.imageUrl, placeholderProgressBar(holder.itemView.context))
        }

        holder.itemView.setOnClickListener {
            val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment(countryList[position].uuid)
            Navigation.findNavController(it).navigate(action)
        }

    }

    override fun getItemCount(): Int {
       return countryList.size
    }

    fun updateCountryList(newCountryList : List<Country>) {
        countryList.clear()
        countryList.addAll(newCountryList)
        notifyDataSetChanged()
    }


}