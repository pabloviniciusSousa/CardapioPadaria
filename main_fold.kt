/*
Função fold() é usado para gerar um valor unico na coleção.

É usado principalmente para preço total e somar de todos os elementos

A função fold() usa dois parâmetros:

    -  Um valor inicial. O tipo de dados é inferido ao chamar a função, ou seja, o valor inicial de 0 é inferido como Int.
    -  Uma expressão lambda que retorna um valor com o mesmo tipo do valor inicial.

Além disso, a expressão lambda tem dois parâmetros:

- O primeiro é conhecido como acumulador. Ele tem o mesmo tipo de dados que o valor inicial. Você pode considerá-lo como um valor total. Cada vez que a expressão lambda é chamada, o acumulador é igual ao valor de retorno da chamada anterior.
- O segundo parâmetro é do mesmo tipo de cada elemento da coleção.

*/

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
    )

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69,       
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )

)

val totalPrice = cookies.fold(0.0){
    total, cookie -> total + cookie.price
}

fun main(){
  println("Total dos preços: $${totalPrice}")
}