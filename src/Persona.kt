class Persona constructor(Nombre:String, Edad:Int){
    var Nombre :String = Nombre
    var Edad :Int = Edad
    fun imprimirPersona() {
        println("Hola, Soy ${this.Nombre} y tengo ${this.Edad} años")
    }
    fun esMayor():Boolean = this.Edad > 18
}
class Triangulo constructor(var Lado1: Int, var Lado2: Int, var Lado3: Int) {
    fun tipoTriangulo():String{
        return when{
            this.Lado1 == this.Lado2 && this.Lado1 == this.Lado3 -> "Equilatero"
            (this.Lado1 == this.Lado2 && this.Lado1 != this.Lado3) || (this.Lado1 == this.Lado3 && this.Lado1 != this.Lado2) || (this.Lado2 == this.Lado3 && this.Lado2 != this.Lado1) -> "Isoceles"
            this.Lado1 != this.Lado2 && this.Lado1 != this.Lado3-> "Escaleno"
            else -> "Eso no es un tringualo :/"
        }
    }
}
fun main(){
    val Persona = Persona("Cesar Xiu", 22)
    Persona.imprimirPersona()
    val mayor = if(Persona.esMayor()) "Si" else "No"
    println("Soy mayor de edad? $mayor")
    val Triangulo1 = Triangulo(3,3,3)
    println("Triangulo del tipo ${Triangulo1.tipoTriangulo()}")
    val Triangulo2 = Triangulo(3,3,1)
    println("Triangulo del tipo ${Triangulo2.tipoTriangulo()}")
    val Triangulo3 = Triangulo(1,2,3)
    println("Triangulo del tipo ${Triangulo3.tipoTriangulo()}")
}