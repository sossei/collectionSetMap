package br.com.alura


fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Alex")
//    nomesSalvos.add("Viny")
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()
    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

private fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome alex? ${nomes.contains("Alex")}")
}