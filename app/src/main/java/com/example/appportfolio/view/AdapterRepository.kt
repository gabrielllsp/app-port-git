package com.example.appportfolio.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appportfolio.domain.RepositoryElement
import com.example.appportfolio.databinding.ItemRepositorioBinding

class AdapterRepository(val list: List<RepositoryElement>) :
    RecyclerView.Adapter<AdapterRepository.ViewHolder>() {

    var clickItemCompartilhar: (RepositoryElement) -> Unit = {}
    var clickItemRepositorio: (RepositoryElement) -> Unit = {}

    class ViewHolder(val binding: ItemRepositorioBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRepositorioBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repository = list[position]
        holder.binding.tvNomeRepositorio.text = repository.name

        holder.binding.imageView.setOnClickListener {
            clickItemCompartilhar(repository)

        }
        holder.itemView.setOnClickListener {
            clickItemRepositorio(repository)
        }

    }

    override fun getItemCount() = list.size
}