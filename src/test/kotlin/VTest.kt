object VTest {
    init {
        println("init V-Test")
    }
    object Simbot {
        init {
            println("init Simbot")
        }
        object Core {
            init {
                println("init Core")
            }
            const val NAME = "simbot-core"
        }
    }
}

fun main() {
    println(VTest.Simbot.Core.NAME)
    println(VTest.Simbot.Core)
}