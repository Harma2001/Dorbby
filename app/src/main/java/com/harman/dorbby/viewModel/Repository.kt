package com.harman.dorbby.viewModel

import com.harman.dorbby.models.Details
import com.harman.dorbby.models.MoviesList
import com.harman.dorbby.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getMovieList(page:Int): Response<MoviesList>{
        return RetrofitInstance.api.getMovies(page)
    }
    suspend fun getDetailsById(id:Int): Response<Details>{
        return RetrofitInstance.api.getDetailsById(id = id)
    }
}