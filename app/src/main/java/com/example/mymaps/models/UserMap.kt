package com.example.mymaps.models

import java.io.Serializable
import java.time.LocalDateTime

data class UserMap(val title: String, val date: LocalDateTime, val places: List<Place>) : Serializable