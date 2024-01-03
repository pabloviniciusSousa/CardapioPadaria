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

/*
    Vamos usar o forEach().
    O forEach() quando executado passa por cada item na lista, tipo um repeat() ou um for

    ForEach() usa um unico tipo de ação, que é uma função do tipo (T) -> Unit

    T corresponde ao tipo de dado incluso na coleção.
    Para se referir ao parametro usasse it
*/



fun main()
{
    cookies.forEach{
        //Para mostrar a informação do itens é necessário colocar {}
        //e depois do it o . e o nome do dado que deseja mostrar
        println("menu item: ${it.name}")
    }

}