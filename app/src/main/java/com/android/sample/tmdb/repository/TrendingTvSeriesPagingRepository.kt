package com.android.sample.tmdb.repository

import android.content.Context
import com.android.sample.tmdb.data.network.TVShowService
import com.android.sample.tmdb.data.paged.BasePagingSource
import com.android.sample.tmdb.data.paged.tvshow.TrendingTvSeriesPagingSource
import com.android.sample.tmdb.domain.BasePagingRepository
import com.android.sample.tmdb.domain.model.TVShow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TrendingTvSeriesPagingRepository @Inject constructor(
    private val context: Context,
    private val tvShowApi: TVShowService
) : BasePagingRepository<TVShow>() {

    override val pagingSource: BasePagingSource<TVShow>
        get() = TrendingTvSeriesPagingSource(context, tvShowApi)
}