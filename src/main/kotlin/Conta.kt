class Conta {
    var titular=""
    var numeroConta=0
    var saldo=0.0

    constructor()
    fun depositar(valor:Double){
        this.saldo+=valor
        println("Depósito de $valor realizado com sucesso!")
    }
    fun sacar(valor: Double){
        if(this.saldo<valor){
            println("Impossível Sacar,saldo insuficiente")
        }else{
            this.saldo-=valor
            println("Saque de $valor realizado com sucesso!")
        }
    }
}

fun main(){
    println("Bem vindo ao ByteBank")
    val conta1 = Conta()
    conta1.titular="Igor"
    conta1.numeroConta=222
    conta1.saldo=2500.00
    println("Número da conta : ${conta1.numeroConta} , nome do titular: ${conta1.titular},e o seu saldo é: ${conta1.saldo}")
    conta1.depositar(2000.0)
    println(conta1.saldo)
    conta1.sacar(1500.0)
    println(conta1.saldo)
}