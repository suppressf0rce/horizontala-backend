package rs.novafabrika.horizontala

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class Horizontala

fun main(args: Array<String>) {
    runApplication<Horizontala>(*args)
}
