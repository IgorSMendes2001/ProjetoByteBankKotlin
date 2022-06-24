fun main() {
    println("Olá Mundo, rumo ao Kotlin Developer");
    val titular = "Igor" // valor constante
    var signo = "Leão" //valor variável
    println(signo)
    signo = "Peixes"
    println(signo)
    println("O nome do titular é : $titular")
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100.0
    println("Número da conta : $numeroConta , saldo da conta : $saldo")
    saldo += 300
    println("Número da conta : $numeroConta , saldo da conta : $saldo")
    testaCondicoes(saldo)
    /*when{
            saldo>0.0-> println("conta é positiva)
            saldo ==0.0->println("conta é neutra")
            else->println("conta é negativa")
            }
    * */
    for(i in 1..3){
        println(i)
    }
    for (i in 5 downTo 0 step 1){
        if(i==3){
            break
        }
        println(i)
    }
}
    fun testaCondicoes(saldo:Double){
        if(saldo>0.0){
            println("Saldo positivo, a crise não te afetou")
        }else if (saldo<0.0){
            println("Saldo negativo pobre")
        }else{
            println("Saldo 0, precisa ver mais aulas do marcílio"!!)
        }
    }
