package com.example.appportfolio.data


import com.example.appportfolio.domain.RepositoryElement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiGitHub {
   @GET("users/{user}/repos")
   fun getRepository(@Path("user") user: String): Call<List<RepositoryElement>>
}