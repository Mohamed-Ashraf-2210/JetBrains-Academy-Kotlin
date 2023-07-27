package machine

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550
var action:String = ""

fun remaining(){
    println(
        """
            
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $beans g of coffee beans
        $cups disposable cups
        $$money of money
        
    """.trimIndent(),
    )
}

fun main() {
    do {
        println("Write action (buy, fill, take, remaining, exit): ")
        action = readln()
        when(action){
            "buy" -> {
                println()
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
                var buy = readln()
                when(buy){
                    "1" -> {
                        if (water >= 250 && beans >= 16 && cups > 0) {
                            println("I have enough resources, making you a coffee!")
                            println()
                            water -= 250
                            beans -= 16
                            cups--
                            money += 4
                        } else {
                            println("Sorry, not enough water!")
                            println()
                        }
                    }
                    "2" -> {
                        if (water >= 350 && beans >= 20 && cups > 0 && milk >= 75) {
                            println("I have enough resources, making you a coffee!")
                            println()
                            water -= 350
                            milk -= 75
                            beans -= 20
                            cups--
                            money += 7
                        } else {
                            println("Sorry, not enough water!")
                            println()
                        }
                    }
                    "3" -> {
                        if (water >= 200 && beans >= 12 && cups > 0 && milk >= 100) {
                            println("I have enough resources, making you a coffee!")
                            println()
                            water -= 200
                            milk -= 100
                            beans -= 12
                            cups--
                            money += 6
                        } else {
                            println("Sorry, not enough water!")
                            println()
                        }
                    }
                }
            }
            "fill" -> {
                println()
                println("Write how many ml of water you want to add: ")
                var xWater = readln().toInt()
                water += xWater
                println("Write how many ml of milk you want to add: ")
                var xMilk = readln().toInt()
                milk += xMilk
                println("Write how many grams of coffee beans you want to add: ")
                var xBeans = readln().toInt()
                beans += xBeans
                println("Write how many disposable cups you want to add: ")
                var xCups = readln().toInt()
                cups += xCups
                println()
            }
            "take" -> {
                println()
                println("I gave you $money")
                money = 0
                println()
            }
            "remaining" -> remaining()
        }
    } while (action != "exit")

}
