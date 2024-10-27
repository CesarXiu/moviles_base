fun main() {
    /*
        Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores enteros.
        Acumular solo el mayor del cada lista de tres valores.
     */
    var sumatoria = 0
    for (i in 0..4){
        println("Solo el mayor de los 3 numeros sera almacenado.")
        println("Ingrese el primer numero:")
        val numero1 = readln().toInt()
        println("Ingrese el segundo numero:")
        val numero2 = readln().toInt()
        println("Ingrese el tercer numero:")
        val numero3 = readln().toInt()
        sumatoria += when{
            numero1 > numero2 && numero1 > numero3 -> {numero1}
            numero2 > numero1 && numero2 > numero3 -> {numero2}
            numero3 > numero1 && numero3 > numero2 -> {numero3}
            numero1 == numero2 && numero1 > numero3 -> {numero1}
            numero1 == numero3 && numero1 > numero2 -> {numero1}
            numero2 == numero3 && numero2 > numero1 -> {numero2}
            else -> numero1
        }
    }
    println("La sumatoria final fue: $sumatoria")
}