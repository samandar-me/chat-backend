package com.sdk.util

object BotResponse {
    fun botResponse(message: String): String {
        val random = (0..2).random()
        return when {
            message.contains("hi") || message.contains("hel") -> {
                when(random) {
                    0 -> "Hello!"
                    1 -> "Hi bro, what's up?"
                    else -> "How can i help you?"
                }
            }
            message.contains("how are") -> {
                when(random) {
                    0 -> "Not bad"
                    1 -> "Fine"
                    else -> "Good"
                }
            }
            message.contains("lan") -> {
                "I know English, Russian, Korean, Spanish, Uzbek. I am still under development, and I am constantly learning new languages"
            }
            message.contains("solve") -> {
                val equation: String = message.substringAfterLast("solve")
                return try {
                    val answer = MathSolve.solveMath(equation)
                    "$answer"

                } catch (e: Exception) {
                    "Can't be solve"
                }
            }
            else -> "I am a large language model, also known as a conversational AI or chatbot trained to be informative and comprehensive"
        }
    }
}