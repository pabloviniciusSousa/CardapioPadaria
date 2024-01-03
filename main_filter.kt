/*
O filter() permiti criar um subconjunto de itens de uma coleção
Diferente do map() que gera uma coleção com o mesmo tamanho,
o filter pode ter tamanhos distinto.

- Se o resultado da expressão lambda for true, o item vai ser incluído na nova coleção.
- Se o resultado for false, o item não vai ser incluído na nova coleção.
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

val softBakedMenu = cookies.filter{
    it.softBaked
}

fun main(){

  println("Soft coockies: ")
  softBakedMenu.forEach{
    println("${it.name} : ${it.price}")
  }

}
