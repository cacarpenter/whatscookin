package dev.craigcarpenter.whatscookin.planning.api

import dev.craigcarpenter.whatscookin.planning.svc.Plan
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.util.concurrent.atomic.AtomicLong

@RestController
class PlanningController {
    val counter = AtomicLong()

    @PostMapping("/plans")
    fun getPlans() = Plan(counter.incrementAndGet(), LocalDate.now(), LocalDate.now().plusDays(1))
}