package com.sample.tmdb.ui.detail

import androidx.lifecycle.SavedStateHandle
import com.sample.tmdb.core.domain.model.Movie
import com.sample.tmdb.core.domain.model.MovieDetails
import com.sample.tmdb.core.domain.repository.BaseDetailRepository
import com.sample.tmdb.core.domain.repository.BookmarkItemDetailsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    bookmarkRepository: BookmarkItemDetailsRepository<Movie>,
    repository: BaseDetailRepository<MovieDetails>,
    savedStateHandle: SavedStateHandle
) : BaseDetailViewModel<MovieDetails, Movie>(bookmarkRepository, repository, savedStateHandle)