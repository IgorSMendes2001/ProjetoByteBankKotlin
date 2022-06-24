class Conta {
    var titular=""
    var numeroConta=0
    var saldo=0.0

    constructor()
}
fun main(){
    println("Bem vindo ao ByteBank")
    val conta1 = Conta()
    conta1.titular="Igor"
    conta1.numeroConta=222
    conta1.saldo=2500.00
    println("Número da conta : ${conta1.numeroConta} , nome do titular: ${conta1.titular},e o seu saldo é: ${conta1.saldo}")
}