package im.pumpkin.common

sealed class Input {

    data class Number(
        val value: Int
    ) : Input()

    data class Point(
        val value: String
    ) : Input()

    data class Op(
        val value: Operator
    ) : Input()

    data class Evaluate(
        val value: String
    ) : Input()

    object Clear : Input()
    object Back : Input()

}
