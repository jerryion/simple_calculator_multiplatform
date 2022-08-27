package im.pumpkin.common

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

class CalculatorViewModel {
    private val inputStack = MutableStateFlow(listOf<Input>())
    val expression = inputStack.map { stack ->
        val text = StringBuilder()
        stack.forEach { input ->
            when (input) {
                is Input.Number -> {
                    text.append(input.value)
                }
                is Input.Point -> {
                    text.append(input.value)
                }
                is Input.Op -> {
                    text.append(input.value.text)
                }
                is Input.Evaluate -> {
                    text.append(input.value)
                }
            }
        }

        if (stack.lastOrNull() is Input.Evaluate) {
        }
        return@map text.toString()
    }

    fun emit(input: Input) {
        val last = inputStack.value.lastOrNull()
        if (last is Input.Evaluate) {
            return
        }
        when (input) {
            is Input.Number -> {
                inputStack.value += input
            }
            is Input.Point -> {
                if (last is Input.Number) {
                    inputStack.value += input
                }
            }
            is Input.Op -> {
                if (last is Input.Op) {
                    inputStack.value -= last
                }
                inputStack.value += input
            }
            is Input.Back -> {
                if (last != null) {
                    inputStack.value -= last
                }
            }
            is Input.Clear -> {
                inputStack.value = emptyList()
            }
            is Input.Evaluate -> {
                if (last is Input.Number) {
                    inputStack.value += input
                }
            }
        }
    }

}