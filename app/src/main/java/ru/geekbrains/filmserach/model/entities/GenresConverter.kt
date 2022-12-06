package ru.geekbrains.filmserach.model.entities

import androidx.room.TypeConverter
import java.util.Arrays
import java.util.stream.Collectors

class GenresConverter {
    @TypeConverter
    fun fromGenres(genres: List<String>): String {
        return genres.stream().collect(Collectors.joining(","))
    }

    @TypeConverter
    fun toGenres(genres: String): MutableList<List<String>> {
        return Arrays.asList(genres.split(","))
    }
}