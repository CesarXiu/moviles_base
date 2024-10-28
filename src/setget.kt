
class dado {
        var valor:Int = 0
        set(value){
            if(value>6 || value<1)
                field = 1
            else
                field = value
        }
    fun aleatorio() = ((Math.random()* (6 + 1 - 1)) + 1).toInt()
    fun print(){
        println(this.valor)
    }
}
fun main(args: Array<String>) {
    /*
        Plantear una clase llamada Dado. Definir una propiedad llamada valor que permita cargar un valor comprendido entre 1 y 6 si llega un valor que no está comprendido en este rango se debe cargar un 1.
        Definir dos métodos, uno que genere un número aleatorio entre 1 y 6 y otro que lo imprima.
        Al constructor llega el valor inicial que debe tener el dado (tratar de enviarle el número 7)
    */
    val dado1:dado = dado()
    dado1.valor = 7
    dado1.print()
    println(dado1.aleatorio())
    dado1.valor = dado1.aleatorio()
    dado1.print()

}