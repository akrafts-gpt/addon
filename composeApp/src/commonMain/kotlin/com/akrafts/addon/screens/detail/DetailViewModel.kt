package com.akrafts.addon.screens.detail

import androidx.lifecycle.ViewModel
import com.akrafts.addon.data.MuseumObject
import com.akrafts.addon.data.MuseumRepository
import kotlinx.coroutines.flow.Flow

class DetailViewModel(private val museumRepository: MuseumRepository) : ViewModel() {
    fun getObject(objectId: Int): Flow<MuseumObject?> =
        museumRepository.getObjectById(objectId)
}
