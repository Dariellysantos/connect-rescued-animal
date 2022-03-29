package br.com.connectrescuedanimal.demo.service

import br.com.connectrescuedanimal.demo.model.Protectress
import org.springframework.stereotype.Service

@Service
class ProtectressService(private var protective: List<Protectress> = ArrayList()) {

    fun register(protectress: Protectress): Protectress {
        protective.plus(protectress)
        return protectress
    }

}