package com.example.themovieappfree.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result(@SerializedName("page") @Expose val pageName: Integer,
                  @SerializedName("total_pages") @Expose val totalPages: Integer,
                  @SerializedName("total_results") @Expose  val totalResults: Integer,
                  @SerializedName("results") @Expose val results: List<Movie>)

