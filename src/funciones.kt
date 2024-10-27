fun main(){
    fun retornarSuperficie(lado1: Int,lado2: Int): Int = lado1 * lado2
    val rectangulo1 = retornarSuperficie(1,1)
    val rectangulo2 = retornarSuperficie(2,2)
    if(rectangulo1 > rectangulo2)
        println("Rectangulo 1: $rectangulo1")
    else
        println("Rectangulo 2: $rectangulo2")
}