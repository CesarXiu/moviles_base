//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
        Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
            a) La cantidad de valores ingresados negativos.
            b) La cantidad de valores ingresados positivos.
            c) La cantidad de múltiplos de 15.
            d) El valor acumulado de los números ingresados que son pares.
    */
    var negativos = 0
    var positivos= 0
    var mult15= 0
    var sumaPares= 0
    for (i in 1..5) {
        println("Ingrese un numero: ")
        var valores = readln().toInt()
        if(valores < 0)
            negativos++
        else
            positivos++
        if(valores % 15 == 0)
            mult15++
        if (valores % 2 == 0)
            sumaPares = sumaPares + valores
    }
    println("Los resultados son: \n" +
            "Valores negativos:$negativos \n" +
            "Valores positivos: $positivos \n" +
            "Multiplos de 15: $mult15 \n" +
            "Suma de pares: $sumaPares")
}