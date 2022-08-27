package im.pumpkin.common

enum class Operator(val text: String, val impl: (Float, Float) -> Float) {

    PLUS("+", { l, r -> l + r }),
    MINUS("-", { l, r -> l - r }),
    MULTIPLY("×", { l, r -> l * r }),
    DIVIDE("÷", { l, r -> l / r })

}
