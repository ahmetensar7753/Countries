package com.example.countries.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.countries.model.Country

@Dao
interface CountryDao {

    @Insert
    suspend fun insertAll(vararg countries : Country) : List<Long>

    // vararg -> multiple country object
    // List<Long> -> primary keys

    @Query("SELECT * FROM country")
    suspend fun getAllCountries() : List<Country>

    @Query("SELECT * FROM country WHERE uuid = :countryId")
    suspend fun getCountry(countryId : Int) : Country

    @Query("DELETE FROM country")
    suspend fun deleteAllCountries()

}