package com.atdev.core.interactors

import com.atdev.core.entities.LoadType

interface ISampleRepo {
    fun postItem()
    fun getData(loadType: LoadType)
}