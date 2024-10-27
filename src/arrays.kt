fun main(args: Array<String>) {
    /*
        Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
        El valor acumulado de todos los elementos.
        El valor acumulado de los elementos que sean mayores a 36.
        Cantidad de valores mayores a 50.
        (Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar cada elemento)
     */
    val arreglosInt = IntArray(8)
    for(i in 0..arreglosInt.size-1) {
        println("Ingrese elemento:")
        arreglosInt[i] = readln().toInt()
    }
    var acumulado = 0
    var acumuladoMayor36 = 0
    var acumuladoMayor50 = 0
    for(entero in arreglosInt) {
        acumulado += entero
        if(entero > 50){
            acumuladoMayor50 += entero
            acumuladoMayor36 += entero
            continue
        }
        if (entero > 36)
            acumuladoMayor36 += entero
    }
    println("Sumatoria: $acumulado \n" +
            "Sumatoria > 36: $acumuladoMayor36 \n" +
            "Sumatoria > 50: $acumuladoMayor50")
}