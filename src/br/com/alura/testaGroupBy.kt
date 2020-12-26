package br.com.alura

fun testaGroupBy() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )
    println(pedidos)
//    val pedidosAssociados = pedidos.associate { pedido ->
//        Pair(pedido.numero, pedido.valor)
//    }
    val pedidosAssociados = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosAssociados)

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(2, 60.0)])

    val mapa = pedidos.associateBy { pedido ->
        pedido.valor > 50.0
    }
    println(mapa)

    val valorAgrupado = pedidos.groupBy {
        it.valor > 50
    }
    println(valorAgrupado)

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Paulo",
        "Maria",
        "Mario",
        "Giselle"
    )

    val agenda = nomes.groupBy {
        it.first()
    }
    println(agenda)
}

data class Pedido(val numero: Int, val valor: Double)