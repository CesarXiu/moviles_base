class socio constructor(var Nombre:String, var Antiguedad:Int) {
    fun actualizarAntiguedad(NuevAntiguedad:Int) {
        this.Antiguedad = NuevAntiguedad
    }
    fun imprimirSocio():String{
        return "Socio: ${this.Nombre}, con una antiguedad de ${this.Antiguedad} años"
    }
}
class club constructor(var Nombre:String){
    var socio1 = socio("",-1)
    var socio2 = socio("",-1)
    var socio3 = socio("",-1)
    fun agregarSocio(nuevoSocio:socio):Boolean{
        when{
            this.socio1.Antiguedad == -1 -> this.socio1 = nuevoSocio
            this.socio2.Antiguedad == -1 -> this.socio2 = nuevoSocio
            this.socio3.Antiguedad == -1 -> this.socio3 = nuevoSocio
            else -> return false
        }
        return true
    }
    fun removerSocio(nombre:String):Boolean{
        when{
            this.socio1.Nombre == nombre -> this.socio1 = socio("",-1)
            this.socio2.Nombre == nombre -> this.socio2 = socio("",-1)
            this.socio3.Nombre == nombre -> this.socio3 = socio("",-1)
            else -> return false
        }
        return true
    }
    fun socioMasAntiguo():socio{
        return when{
            this.socio1.Antiguedad > this.socio2.Antiguedad && this.socio1.Antiguedad > this.socio3.Antiguedad -> this.socio1
            this.socio2.Antiguedad > this.socio1.Antiguedad && this.socio2.Antiguedad > this.socio3.Antiguedad -> this.socio2
            this.socio3.Antiguedad > this.socio1.Antiguedad && this.socio3.Antiguedad > this.socio2.Antiguedad -> this.socio3
            else -> socio("", -1)
        }
    }
}
fun main(args: Array<String>) {
    /*
        Plantear una clase Club y otra clase Socio.
        La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad en el club (en años).
        Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
        La clase Club debe tener como propiedades 3 objetos de la clase Socio.
        Definir un metodo en la clase Club para imprimir el nombre del socio con mayor antigüedad en el club.
     */
    val mapachitosClub = club("Mapachitos")
    mapachitosClub.agregarSocio(socio("Cesar",5))
    mapachitosClub.agregarSocio(socio("Yadira",4))
    mapachitosClub.agregarSocio(socio("Gibran",3))
    val antiguo = mapachitosClub.socioMasAntiguo().imprimirSocio()
    println("El socio mas antiguo de ${mapachitosClub.Nombre} es el $antiguo")
}