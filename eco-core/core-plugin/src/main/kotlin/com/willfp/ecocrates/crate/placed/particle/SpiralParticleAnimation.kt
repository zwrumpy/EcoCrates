package com.willfp.ecocrates.crate.placed.particle

import com.willfp.eco.util.NumberUtils
import org.bukkit.util.Vector
import kotlin.math.PI

class SpiralParticleAnimation : ParticleAnimation("spiral") {
    override fun getOffset(tick: Int): Vector {
        return Vector(
            NumberUtils.fastSin(config.getDouble("spirals-per-second") * 2 * PI * tick / 20) * config.getDouble("radius"),
            -NumberUtils.fastCos(config.getDouble("rises-per-second") * 2 * PI * tick / 20) * config.getDouble("height"),
            NumberUtils.fastCos(config.getDouble("spirals-per-second") * 2 * PI * tick / 20) * config.getDouble("radius")
        )
    }
}
