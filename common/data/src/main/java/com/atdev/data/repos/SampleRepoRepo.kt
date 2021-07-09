package com.atdev.data.repos

import com.atdev.core.entities.LoadType
import com.atdev.core.interactors.ISampleRepo
import com.atdev.data.datasources.SampleLocalDataSrc
import com.atdev.data.datasources.SampleRemoteDatSrc

class SampleRepoRepo(
    private val sampleLocalDataSrc: SampleLocalDataSrc,
    private val sampleRemoteDatSrc: SampleRemoteDatSrc
) : ISampleRepo {

    override fun getData(loadType: LoadType) {
        return when (loadType) {
            LoadType.Local -> sampleLocalDataSrc.get()
            LoadType.Remote -> sampleRemoteDatSrc.get()
        }
    }

    override fun postItem() {

    }

    fun save() {
        sampleLocalDataSrc.save()
    }

    fun deleteAll() {
        sampleLocalDataSrc.delete()
    }
}