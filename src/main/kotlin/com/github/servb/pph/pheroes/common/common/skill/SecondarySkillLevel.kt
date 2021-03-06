package com.github.servb.pph.pheroes.common.common.skill

import com.github.servb.pph.util.helpertype.UndefinedCountValueEnum
import com.github.servb.pph.util.helpertype.UniqueValueEnum

enum class SecondarySkillLevel(override val v: Int) : UniqueValueEnum, UndefinedCountValueEnum {
    NONE(-1),
    BASIC(0),
    ADVANCED(1),
    EXPERT(2),
    COUNT(3);
}
