package com.harman.dorbby.paging

interface Pagination<Key, Item> {
    suspend fun loadNextPage()
    fun reset()
}