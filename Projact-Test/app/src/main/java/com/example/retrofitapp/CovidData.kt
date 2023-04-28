package com.example.retrofitapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CovidData(
    @SerializedName("txn_date")
    @Expose
    var txn_date: String? = null,

    @SerializedName("new_case")
    @Expose
    var new_case: Int? = null,

    @SerializedName("total_case")
    @Expose
    var total_case: Int? = null,

    @SerializedName("new_case_excludeabroad")
    @Expose
    var new_case_excludeabroad: Int? = null,

    @SerializedName("total_case_excludeabroad")
    @Expose
    var total_case_excludeabroad: Int? = null,

    @SerializedName("new_death")
    @Expose
    var newDeath: Int? = null,

    @SerializedName("total_death")
    @Expose
    var totalDeath: Int? = null,

    @SerializedName("new_recovered")
    @Expose
    var newRecovered: Int? = null,

    @SerializedName("total_recovered")
    @Expose
    var totalRecovered: Int? = null,

    @SerializedName("update_date")
    @Expose
    var updateDate: String? = null
)
