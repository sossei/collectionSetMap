package br.com.alura

fun testaComportamentosMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0,
    )
//   val valorPedido = pedidos.getValue(3)
//    println(valorPedido)
    val message = pedidos.getOrElse(1, {
        0.0
    })
    println(message)
    val default = pedidos.getOrDefault(0, -1.0)
    println(default)
    println(pedidos.keys)

    for (numero in pedidos.keys)
        println("Pedido: $numero")
    for (valor in pedidos.values)
        println("Valores: $valor")

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)
    val pedidosAcima = pedidos.filterValues {
        it > 70.0

    }
    println(pedidosAcima)
    val pedidosPares = pedidos.filterKeys {
        it % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(8 to 90.0, 9 to 150.0))
    println(pedidos)

    println(pedidos - 6)
    println(pedidos - listOf(5, 6))
    println(pedidos)

    pedidos.putAll(setOf(8 to 90.0, 9 to 150.0))
    println(pedidos)

    pedidos += setOf(10 to 80.0, 11 to 660.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}
fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }
    for (p in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 60.0)
    println(pedidos)
}

