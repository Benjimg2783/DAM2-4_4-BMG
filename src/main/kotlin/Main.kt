class Pila<T>() {
     private var lista = mutableListOf<T>()

    constructor(lista: List<T>) : this() {
        this.lista = lista.toMutableList()
    }

    fun top() = lista[0]
    fun push(elemento: T) = lista.add(0,elemento)
    fun pop(): Boolean = lista.remove(lista[0])
    fun vacia(): Boolean = lista.isEmpty()
    fun isNotEmpty(): Boolean = lista.isNotEmpty()
    fun toList():List<T> =lista.toList()
}

fun <T> reverse(lista: List<T>): List<T> {
    val pila=Pila<T>()
    val iterador=lista.iterator()
    var listaInvertida= mutableListOf<T>()
    while (iterador.hasNext()) {
        pila.push(iterador.next())
    }
    while (pila.isNotEmpty()){
        pila.top()?.let { listaInvertida.add(it) }
        pila.pop() }
    return listaInvertida
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)
    if (listOf("four", "three", "two", "one") != numbersRev)
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}