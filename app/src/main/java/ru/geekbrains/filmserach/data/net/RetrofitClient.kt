package ru.geekbrains.filmserach.data.net

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.geekbrains.filmserach.data.PATH
import java.io.IOException

object RetrofitClient {
    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit {
        if (retrofit == null) {

            retrofit = Retrofit.Builder()
                .baseUrl(PATH)
                .client(client(FilmApiInterceptor()))
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }

    private fun client(interceptor: Interceptor): OkHttpClient {

        val builder = OkHttpClient()
            .newBuilder()
            .addInterceptor(interceptor)
            .addInterceptor(
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            )

        return builder.build()
    }

    class FilmApiInterceptor : Interceptor {

        @Throws(IOException::class)
        override fun intercept(chain: Interceptor.Chain): Response {
            return chain.proceed(chain.request())
        }
    }
}
