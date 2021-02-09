package dev.craigcarpenter.whatscookin.planning.svc

import java.time.LocalDate

data class Plan(val id: Long, val startDate : LocalDate, val endDate : LocalDate)